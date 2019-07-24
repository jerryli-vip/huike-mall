package com.supergo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.activemq.command.ActiveMQTopic;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbGoodsMapper;
import com.supergo.mapper.TbImageMapper;
import com.supergo.mapper.ext.TbGoodsExtMapper;
import com.supergo.pojo.TbGoods;
import com.supergo.pojo.TbGoodsExample;
import com.supergo.pojo.TbGoodsExample.Criteria;
import com.supergo.pojo.TbImage;
import com.supergo.pojo.ext.GoodsVO;
import com.supergo.pojo.ext.OptionDecare;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbGoodsServiceImpl implements TbGoodsService {

	@Autowired
	private TbGoodsMapper mapper;
	@Autowired
	private TbGoodsExtMapper mapperExt;
	@Autowired
	private TbImageMapper imageMapper;

	@Autowired
	private JmsTemplate template;

	@Autowired
	private ActiveMQTopic destination;

	@Override
	public PageVO<TbGoods> query(Integer page, Integer rows, TbGoods tbGoods) {

		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		// 开启分页插件
		PageHelper.startPage(page, rows);

		// 进行查询
		TbGoodsExample example = new TbGoodsExample();
		example.setOrderByClause("goods_id DESC");
		Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(tbGoods.getShopId());
		// 有条件查询时
		// 订单状态
		if (tbGoods.getStatus() != null) {
			criteria.andStatusEqualTo(tbGoods.getStatus());
		}
		// 商品姓名
		if (StringUtils.isNotEmpty(tbGoods.getGoodsName())) {
			criteria.andGoodsNameLike("%" + tbGoods.getGoodsName() + "%");
		}

		List<TbGoods> list = mapper.selectByExample(example);

		// 获取分页后的信息
		PageInfo<TbGoods> pageInfo = new PageInfo<>(list);

		// 将结果赋值给pagevo对象
		PageVO<TbGoods> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}

	@Override
	public ResultVO deleteByIds(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbGoods record = new TbGoods();
		record.setStatus(2);
		record.setIsDelete("Y");
		record.setUpdateTime(new Date());
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andGoodsIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			// 将数组转换成字符串 拼接&del del表示是删除操作
			StringBuffer string = new StringBuffer();
			for (Integer id : ids) {
				string.append(id).append(",");
			}
			string.append("&del");
			// 调用消息服务 发送消息
			idsTopicProducer(string.toString());

			return ResultVO.build(200, "删除成功，共删除" + line + "个商品");
		}
		return ResultVO.build(-1, "删除失败，请重试");

	}

	@Override
	public ResultVO putOnSale(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}
		TbGoods record = new TbGoods();
		record.setStatus(0);
		record.setIsDelete("N");
		record.setUpdateTime(new Date());
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andGoodsIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {

			// 将数组转换成字符串 拼接&add add表示是添加操作
			StringBuffer string = new StringBuffer();
			for (Integer id : ids) {
				string.append(id).append(",");
			}
			string.append("&add");
			// 调用消息服务 发送消息
			idsTopicProducer(string.toString());

			return ResultVO.build(200, "上架成功，共上架" + line + "个商品");
		}
		return ResultVO.build(-1, "上架失败，请重试");
	}

	@Override
	public ResultVO putOffSale(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbGoods record = new TbGoods();
		record.setStatus(1);
		record.setIsDelete("N");
		record.setUpdateTime(new Date());
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andGoodsIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {

			// 将数组转换成字符串 拼接&del del表示是删除操作
			StringBuffer string = new StringBuffer();
			for (Integer id : ids) {
				string.append(id).append(",");
			}
			string.append("&del");
			// 调用消息服务 发送消息
			idsTopicProducer(string.toString());

			return ResultVO.build(200, "下架成功，共下架" + line + "个商品");
		}
		return ResultVO.build(-1, "下架失败");
	}

	@Override
	public ResultVO updateStock(Integer stocknum, Integer[] ids) {
		if (stocknum == null || stocknum < 0) {
			return ResultVO.build(-1, "修改失败，数量不存在，或者为负数");
		}
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbGoods record = new TbGoods();
		record.setInventory(stocknum);
		record.setUpdateTime(new Date());
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andGoodsIdIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "个商品");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}

	@Override
	public ResultVO updatePrice(String price, Integer[] ids) {

		if (price == null || !price.matches("^[1-9]\\d(\\.\\d*)?|0\\.\\d*[1-9]\\d*$")) {
			return ResultVO.build(-1, "修改失败，价格格式错误，或者为负数");
		}
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbGoods record = new TbGoods();
		record.setSellPrice(new BigDecimal(price));
		record.setUpdateTime(new Date());
		TbGoodsExample example = new TbGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andGoodsIdIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "个商品");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}

	@Override
	public ResultVO update(TbGoods tbGoods) {
		if (tbGoods == null || tbGoods.getGoodsId() == null || tbGoods.getGoodsId() <= 0) {
			return ResultVO.build(-1, "商品未提交，或者未选择商品");
		}
		tbGoods.setUpdateTime(new Date());
		int line = mapper.updateByPrimaryKey(tbGoods);
		if (line >= 0) {
			return ResultVO.build(200, "修改成功");
		}
		return ResultVO.build(-1, "修改失败，请检查字段");
	}

	@Override
	public ResultVO insert(GoodsVO vo) {
		if (vo == null) {
			return ResultVO.build(-1, "商品未提交");
		}
		if (vo.getImgList() == null || vo.getImgList().length <= 0 || vo.getImgList().length > 5) {
			return ResultVO.build(-1, "商品图片不存在,或者张数超过5张");
		}

		if (vo.getProductId() == null || vo.getProductId() <= 0) {
			return ResultVO.build(-1, "产品ID不存在");
		}
		if (vo.getProductId() == null || vo.getProductId() <= 0) {
			return ResultVO.build(-1, "产品ID不存在");
		}
		if (vo.getGoodsName() == null || vo.getGoodsName().isEmpty()) {
			return ResultVO.build(-1, "商品名称未提交");
		}
		if (vo.getOptionDecareList() == null || vo.getOptionDecareList().length == 0) {
			return ResultVO.build(-1, "商品规格未提交");
		}
		if (vo.getOptionNum() == null || vo.getOptionNum() <= 0) {
			return ResultVO.build(-1, "商品规格数目不能为零");
		}

		// 获取商品列表
		// 插入商品列表到数据库
		// 获取图片列表
		// 插入图片

		// 1. 获取商品列表
		List<TbGoods> goodsist = new ArrayList<>();

		OptionDecare[] decareList = vo.getOptionDecareList();
		TbImage[] imageList = vo.getImgList();
		String goodsName = vo.getGoodsName();
		Integer productId = vo.getProductId();
		// 插入商品
		for (OptionDecare optionDecare : decareList) {
			// 没有库存和价格
			if (optionDecare.getSellPrice() == null && optionDecare.getStock() == null) {
				continue;
			}
			// 当有库存和价格的时候
			TbGoods goods = new TbGoods();
			// 1. 设置产品id
			goods.setProductId(productId);
			// 2. 设置售价
			goods.setSellPrice(optionDecare.getSellPrice());
			// 3. 设置库存
			goods.setInventory(optionDecare.getStock());
			// 4. 设置状态status 下架状态
			goods.setStatus(1);
			// 5. 设置是否删除
			goods.setIsDelete("N");
			// 6. 设置创建时间和更新时间
			goods.setUpdateTime(new Date());
			goods.setCreateTime(new Date());
			goods.setCreateId(vo.getShopId().toString());
			goods.setUpdateId(vo.getShopId().toString());
			// 7. 设置商店id
			goods.setShopId(vo.getShopId());

			// 当添加一个规格选项时候
			if (optionDecare.getSpecOptionNum() == 1) {
				// 7. 设置商品名称title 产品名称 加规格
				String title = goodsName + " " + optionDecare.getSpecName1() + " " + optionDecare.getSpecOptionName1();
				goods.setGoodsName(title);
				// 8. 设置产品规格
				// {"机身内存":"16G","网络":"联通3G"}
				String specInfo = "{\"" + optionDecare.getSpecName1() + "\":\"" + optionDecare.getSpecOptionName1()
						+ "\"}";
				goods.setSpecInfo(specInfo);
			} else {
				// 7. 设置商品名称title 产品名称 加规格
				String title = goodsName + " " + optionDecare.getSpecName1() + " " + optionDecare.getSpecOptionName1();
				goods.setGoodsName(title);
				// 8. 设置产品规格
				// {"机身内存":"16G","网络":"联通3G"}
				String specInfo = "{\"" + optionDecare.getSpecName1() + "\":\"" + optionDecare.getSpecOptionName1()
						+ "\"}";
				goods.setSpecInfo(specInfo);
			}
			mapperExt.insert(goods);
			goodsist.add(goods);
		}

		// 插入图片
		for (TbGoods tbGoods : goodsist) {
			int i = 0;
			for (TbImage tbImage : imageList) {
				tbImage.setGoodsId(tbGoods.getGoodsId());
				tbImage.setCreateId(vo.getShopId());
				tbImage.setUpdateId(vo.getShopId());
				tbImage.setUpdateTime(new Date());
				tbImage.setCreateTime(new Date());
				tbImage.setImgOrder(i);
				tbImage.setIsDelete("N");
				if (i == 0) {
					tbImage.setIsMaster("Y");
				}
				imageMapper.insert(tbImage);
				i++;
			}
		}

		if (goodsist.size() <= 0) {
			return ResultVO.build(-1, "添加商品失败");
		}
		return ResultVO.build(200, "添加" + goodsist.size() + "个商品");

	}

	/**
	 * 将修改后的商品id 发送给消费者使用 &add 表示新增操作 &del 表示删除操作
	 * 
	 * @param ids
	 * @author transen
	 */
	private void idsTopicProducer(final String ids) {
		template.convertAndSend(destination, ids);
	}
}
