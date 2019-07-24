package com.supergo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbCategoryMapper;
import com.supergo.mapper.TbGoodsMapper;
import com.supergo.mapper.TbProductAuditingMapper;
import com.supergo.mapper.TbProductInfoMapper;
import com.supergo.mapper.TbProductMapper;
import com.supergo.mapper.TbTemplateMapper;
import com.supergo.mapper.ext.TbProductMapperExt;
import com.supergo.pojo.TbCategory;
import com.supergo.pojo.TbCategoryExample;
import com.supergo.pojo.TbGoodsExample;
import com.supergo.pojo.TbProduct;
import com.supergo.pojo.TbProductAuditing;
import com.supergo.pojo.TbProductExample;
import com.supergo.pojo.TbProductExample.Criteria;
import com.supergo.pojo.TbProductInfoWithBLOBs;
import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.TbTemplateExample;
import com.supergo.pojo.ext.ProductRequestVO;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 产品管理与产品审核
 * 
 * @author TranSen范江浩
 *
 */
@Service
public class TbProductServiceImpl implements TbProductService {

	@Autowired
	private TbProductMapper productMapper;
	@Autowired
	private TbProductInfoMapper productInfoMapper;
	@Autowired
	private TbProductMapperExt productMapperExt;
	@Autowired
	private TbCategoryMapper categoryMapper;
	@Autowired
	private TbTemplateMapper templateMapper;
	@Autowired
	private TbGoodsMapper goodsMapper;
	@Autowired
	private TbProductAuditingMapper auditingMapper;
	

	/**
	 * 添加产品
	 */
	@Override
	public ResultVO insert(ProductRequestVO productResultVO,Integer templateId,Integer shopId,Integer userId) {

		if (productResultVO == null) {
			return ResultVO.build(500, "产品信息不能为空");
		}
		if (productResultVO.getProduct() == null) {
			return ResultVO.build(500, "产品基本信息不能为空");
		}
		if (templateId == null || templateId <=0) {
			return ResultVO.build(500, "模块信息不能为空");
		}

		TbProduct product = productResultVO.getProduct();
		TbProductInfoWithBLOBs productInfoWithBLOBs = productResultVO.getProductInfoWithBLOBs();
		
		// 添加模块id
		product.setTemplate(templateId.toString());
		
		// 添加创建人ID
		product.setCreateId(userId.toString());
		// 添加店铺ID
		product.setShopId(shopId);
		// 添加产品主信息
		productMapperExt.insert(product);

		if (productInfoWithBLOBs != null) {

			// 添加创建人ID
			productInfoWithBLOBs.setCreateId(userId);
			// 添加产品主键ID
			productInfoWithBLOBs.setProductId(product.getProductId());
			// 添加产品扩展信息
			productInfoMapper.insert(productInfoWithBLOBs);
		}
		return ResultVO.ok();
	}

	/**
	 * 查询产品
	 */
	@Override
	public PageVO<TbProduct> query(TbProduct product, Integer page, Integer size, Integer shopId) {

		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 1;
		}
		if (page == null || size <= 0 || size >= 150) {
			size = 10;
		}

		PageHelper.startPage(page, size);

		// 查询数据
		product.setShopId(shopId);
		List<TbProduct> list = productMapperExt.selectByProduct(product);

		PageVO<TbProduct> pageVO = new PageVO<>();
		PageInfo<TbProduct> pageInfo = new PageInfo<>(list);
		pageVO.setRows(list);
		pageVO.setPage(page);
		pageVO.setSize(size);
		pageVO.setTotal(pageInfo.getTotal());
		return pageVO;
	}

	/**
	 * 删除产品
	 */
	@Override
	public ResultVO delete(Integer[] ids) {
		// 数组进行非空判断
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}
		// 将数组转为集合
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}

		// 查询商品表，判断产品对应商品是否存在
		TbGoodsExample goodsExample = new TbGoodsExample();
		com.supergo.pojo.TbGoodsExample.Criteria goodsCriteria = goodsExample.createCriteria();
		goodsCriteria.andProductIdIn(list);
		goodsCriteria.andIsDeleteEqualTo("N");
		int countByExample = goodsMapper.countByExample(goodsExample);

		if (countByExample != ids.length) {
			return ResultVO.build(500, "有商品上架中，不能删除对应的产品");
		}

		// 删除产品，设置是否删除字段为Y
		TbProduct tbProduct = new TbProduct();
		tbProduct.setIsDelete("Y");
		TbProductExample example = new TbProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andProductIdIn(list);

		int line = productMapper.updateByExampleSelective(tbProduct, example);

		if (line > 0) {
			return ResultVO.build(200, "删除成功，共删除" + line + "个产品");
		} else {
			return ResultVO.build(500, "删除失败");
		}
	}

	/**
	 * 查询1、2、3级分类
	 */
	@Override
	public List<TbCategory> queryClassify(Integer categoryId) {
		TbCategoryExample example = new TbCategoryExample();
		com.supergo.pojo.TbCategoryExample.Criteria criteria = example.createCriteria();
		if (categoryId != null && categoryId >= 0) {

			criteria.andParentIdEqualTo(categoryId);
		}
		
		return categoryMapper.selectByExample(example);
	}

	/**
	 * 查询3级分类对应模板
	 */
	@Override
	public TbTemplate queryTemplate(Integer categoryId) {
		if (categoryId == null) {
			return null;
		}
		TbTemplateExample example = new TbTemplateExample();
		com.supergo.pojo.TbTemplateExample.Criteria criteria = example.createCriteria();

		criteria.andCategoryIdEqualTo(categoryId);
		
		List<TbTemplate> selectByExample = templateMapper.selectByExample(example);
		if (selectByExample.size()<=0) {
			return null;
		}
		return selectByExample.get(0);
	}

	/**
	 * 产品审核提交
	 */
	@Override
	public ResultVO auditing(Integer[] ids) {
		// 检验产品id是否为空
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要提审的数据！");
		}
		TbProductExample example = new TbProductExample();
		Criteria criteria = example.createCriteria();

		// 将数组id 加入where条件内
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andProductIdIn(list);

		// 检验产品状态 判断是否都是未申请状态
		List<TbProduct> products = productMapper.selectByExample(example);
		for (TbProduct tbProduct : products) {
			if (!tbProduct.getStatus().equals("0")) {
				return ResultVO.build(-1, "只能提审未申请的产品！");
			}
		}

		// 修改产品状态为1
		TbProduct tbProduct = new TbProduct();
		tbProduct.setStatus("1");

		int line = productMapper.updateByExampleSelective(tbProduct, example);

		if (line > 0) {
			return ResultVO.build(200, "提审成功，共提审" + line + "个产品");
		} else {
			return ResultVO.build(500, "提审失败");
		}
	}

	/**
	 * 编辑信息回显
	 * 
	 * @param productId
	 * @return
	 */
	@Override
	public ProductRequestVO echo(Integer productId) {
		// 产品id非空判断
		if (productId == 0) {
			return null;
		}
		// 主键查询产品信息
		TbProduct product = productMapperExt.selectByPrimaryKey(productId);
		TbProductInfoWithBLOBs productInfoWithBLOBs = productInfoMapper.selectByPrimaryKey(productId);
		if (productInfoWithBLOBs==null) {
			TbProductInfoWithBLOBs productInfoWithBLOBs2 = new TbProductInfoWithBLOBs();
			productInfoWithBLOBs2.setExtrattribute("[]");
			productInfoWithBLOBs2.setIntroduce("");
			productInfoWithBLOBs = productInfoWithBLOBs2;
		}
		// 封装进包装po类
		ProductRequestVO productRequestVO = new ProductRequestVO();
		productRequestVO.setProduct(product);
		productRequestVO.setProductInfoWithBLOBs(productInfoWithBLOBs);
		System.out.println(productRequestVO.toString());
		return productRequestVO;
	}
	
	/**
	 * 编辑信息提交
	 */
	@Override
	public ResultVO update(Integer productId, Integer classify1, Integer classify2, Integer classify3, Integer template,
			Integer brand, ProductRequestVO productResultVO, Integer shopId, Integer userId) {
		// 参数的非空判断
		if (productId == null || productId <= 0) {
			return ResultVO.build(-1, "没有要编辑的产品数据");
		}
		if (classify1 == null || classify1 <= 0) {
			return ResultVO.build(-1, "分类信息不能为空");
		}
		if (classify2 == null || classify2 <= 0) {
			return ResultVO.build(-1, "分类信息不能为空");
		}
		if (classify3 == null || classify3 <= 0) {
			return ResultVO.build(-1, "分类信息不能为空");
		}
		if (template == null || template <=0) {
			return ResultVO.build(-1, "模块信息不能为空");
		}
		if (brand == null || brand <=0) {
			return ResultVO.build(-1, "品牌信息不能为空");
		}
		
		TbProduct product = productResultVO.getProduct();
		TbProductInfoWithBLOBs productInfoWithBLOBs = productResultVO.getProductInfoWithBLOBs();
		if (product != null) {
			// 添加主键ID
			product.setProductId(productId);
			// 添加参数
			product.setClassify1(classify1.toString());
			product.setClassify2(classify2.toString());
			product.setClassify3(classify3.toString());
			product.setTemplate(template.toString());
			product.setBrand(brand.toString());
			// 添加创建人ID和创建时间
			product.setUpdateId(userId.toString());
			// 添加产品主信息
			productMapper.updateByPrimaryKeySelective(product);
		}
		if (productInfoWithBLOBs != null) {
			// 添加主键ID
			productInfoWithBLOBs.setProductId(productId);
			// 添加创建人ID和时间
			productInfoWithBLOBs.setUpdateId(userId);
			
			// 添加产品扩展信息
			productInfoMapper.updateByPrimaryKeySelective(productInfoWithBLOBs);
		}
		return ResultVO.build(200, "修改成功");
	}
	
	/**
	 * 产品审核之分页查询
	 * @author 范江浩
	 */
	@Override
	public PageVO<TbProduct> queryProduct(TbProduct product, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		
		if (page == null || page <= 0) {
			page = 1;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		PageHelper.startPage(page,rows);
		
		List<TbProduct> list = productMapperExt.selectProduct(product);
		PageInfo<TbProduct> pageInfo = new PageInfo<>(list);
		PageVO<TbProduct> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}
	
	/**
	 * 产品审核之审核通过功能
	 * @author 范江浩
	 */
	@Override
	public ResultVO updateAuditingSuccess(Integer[] ids) {
		// TODO Auto-generated method stub
		if(ids == null || ids.length <= 0){
			return ResultVO.build(500, "操作失败");
		}
		List<Integer> list = Arrays.asList(ids);
		TbProductExample example = new TbProductExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andProductIdIn(list);
		TbProduct product = new TbProduct();
		product.setStatus("2");
		Integer i = productMapper.updateByExampleSelective(product, example);
		if(i == 0){
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}
	/**
	 * 产品审核之审核未通过功能
	 * @author 范江浩
	 */
	@Override
	public ResultVO updateAuditingFail(TbProductAuditing productAuditing,TbSysuser sysuser) {
		// TODO Auto-generated method stub
		if (productAuditing.getReason() == null || "".equals(productAuditing.getReason())) {
			return ResultVO.build(500, "操作失败");
		}
		if (productAuditing.getProductId() == null || "".equals(productAuditing.getProductId())) {
			return ResultVO.build(500, "操作失败");
		}
		if (sysuser == null || "".equals(sysuser)) {
			return ResultVO.build(500, "用户为空");
		}
		TbProductExample example = new TbProductExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andProductIdEqualTo(productAuditing.getProductId());
		TbProduct product = new TbProduct();
		product.setStatus("3");
		Integer i = productMapper.updateByExampleSelective(product, example);
//		TbProductAuditing pAuditing = new TbProductAuditing();
//		pAuditing.setReason(productAuditing.getReason());
//		pAuditing.setProductId(productAuditing.getProductId());
//		pAuditing.setProductName(productAuditing.getProductName());
		productAuditing.setIsDelete("N");
		productAuditing.setCreateId(sysuser.getSysuserId().toString());
		productAuditing.setCreateTime(new Date());
		productAuditing.setUpdateId(sysuser.getSysuserId().toString());
		auditingMapper.insertSelective(productAuditing);
		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}
	
		
	
	/**
	 * 产品审核之批量删除
	 * 
	 * @author 范江浩
	 */
	@Override
	public ResultVO deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(500, "批量删除失败");
		}
		List<Integer> list = Arrays.asList(ids);
		TbProductExample example = new TbProductExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andProductIdIn(list);
		TbProduct product = new TbProduct();
		product.setIsDelete("Y");
		Integer i = productMapper.updateByExampleSelective(product, example);
		if(i == 0){
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

}
