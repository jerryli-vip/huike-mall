package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbCategory;
import com.supergo.pojo.TbProduct;
import com.supergo.pojo.TbProductAuditing;
import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.ext.ProductRequestVO;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 产品管理与产品审核
 * 
 * @author TranSen范江浩
 *
 */
public interface TbProductService {
	/**
	 * 查询产品
	 */
	PageVO<TbProduct> query(TbProduct product, Integer page, Integer size, Integer shopId);
	/**
	 * 删除产品
	 */
	ResultVO delete(Integer[] ids);
	/**
	 * 添加产品
	 */
	ResultVO insert(ProductRequestVO product,Integer templateId, Integer shopId, Integer userId);
	/**
	 * 产品审核提交
	 */
	ResultVO auditing(Integer[] ids);
	/**
	 * 查询1、2、3级分类
	 */
	List<TbCategory> queryClassify(Integer categoryId);
	/**
	 * 查询3级分类对应模板
	 */
	TbTemplate queryTemplate(Integer categoryId);
	/**
	 * 编辑信息回显
	 * 
	 * @param productId
	 * @return
	 */
	ProductRequestVO echo(Integer productId);
	/**
	 * 编辑信息提交
	 */
	ResultVO update(Integer productId, Integer classify1, Integer classify2, Integer classify3, Integer template, Integer brand, ProductRequestVO productResultVO, Integer shopId, Integer userId);

	/**
	 * 产品审核之分页查询
	 * @author 范江浩
	 */
	PageVO<TbProduct> queryProduct(TbProduct product,Integer page,Integer rows);
	/**
	 * 产品审核之审核通过功能
	 * @author 范江浩
	 */
	ResultVO updateAuditingSuccess(Integer[] ids);
	/**
	 * 产品审核之审核未通过功能
	 * @author 范江浩
	 */
	ResultVO updateAuditingFail(TbProductAuditing productAuditing,TbSysuser sysuser);
	/**
	 * 产品审核之批量删除
	 * @author 范江浩
	 */
	ResultVO deleteBatch(Integer[] ids);

}
