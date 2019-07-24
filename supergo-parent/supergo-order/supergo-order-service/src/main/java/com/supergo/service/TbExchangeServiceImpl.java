package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbExchangeGoodsMapper;
import com.supergo.mapper.TbExchangeItemMapper;
import com.supergo.mapper.TbOrderItemMapper;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.mapper.ext.TbExchangeGoodsExtMapper;
import com.supergo.pojo.TbExchangeGoods;
import com.supergo.pojo.TbExchangeGoodsExample;
import com.supergo.pojo.TbExchangeItem;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbOrderItemExample;

import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.TbExchangeGoodsExample.Criteria;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbExchangeServiceImpl implements TbExchangeService {

	@Autowired
	private TbExchangeGoodsExtMapper extmapper;

	@Autowired
	private TbExchangeGoodsMapper mapper;
	@Autowired
	private TbExchangeItemMapper exchangeItemMapper;
	@Autowired
	private TbSubOrderMapper subMapper;
	@Autowired
	private TbOrderItemMapper itemMapper;
	/**
	 * 按条件分页查询
	 */
	@Override
	public PageVO<TbExchangeGoodsExt> queryTbExchangeGoods(TbExchangeGoodsExt good, Integer page, Integer rows) {
		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		// 开启分页插件
		PageHelper.startPage(page, rows);
	    // 将结果赋值给pagevo对象
		List<TbExchangeGoodsExt> list = extmapper.selectByExt(good);
		System.out.println(list);
		// 将结果赋值给pagevo对象
		PageInfo<TbExchangeGoodsExt> pageInfo = new PageInfo<>(list);
		PageVO<TbExchangeGoodsExt> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);

		return pageVO;
	}

	/**
	 * 状态修改换货寄回
	 */
	@Override
	public ResultVO sendBack(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbExchangeGoods record = new TbExchangeGoods();
		record.setExchangeGoodsStatus("0");
		record.setUpdateTime(new Date());
		TbExchangeGoodsExample example = new TbExchangeGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}

	/**
	 * 状态修改换货成功
	 */
	@Override
	public ResultVO exchangeSuccess(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbExchangeGoods record = new TbExchangeGoods();
		record.setExchangeGoodsStatus("1");
		record.setUpdateTime(new Date());
		TbExchangeGoodsExample example = new TbExchangeGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");

	}

	/**
	 * 状态修改换货取消
	 */
	@Override
	public ResultVO exchangeCancel(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbExchangeGoods record = new TbExchangeGoods();
		record.setExchangeGoodsStatus("2");
		record.setUpdateTime(new Date());
		TbExchangeGoodsExample example = new TbExchangeGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}
    /**
     * 修改内容
     */
	@Override
	public ResultVO exchangeUpdate(TbExchangeGoodsExt goods) {
		if(goods == null){
		 return	ResultVO.build(-1,"内容为空，修改失败");
		}
		if(goods.getReciveName()==null ||goods.getReciveMobile()==null){
			return ResultVO.build(-1,"内容为空，修改失败");
		}
		int line =extmapper.updateById(goods);
		if (line >=0) {
			return ResultVO.build(200, "修改成功");
		}
		return ResultVO.build(-1, "修改失败，请检查字段");
	}
	
	
	/**
	 * 换货申请
	 */
	@Override
	public ResultVO updateExchange(TbExchangeGoodsExt exchangeGoodsExt) {
		if (exchangeGoodsExt == null) {
			return ResultVO.build(-1, "参数错误");
		}
		// 判断前台获取的值是否为空
		if (exchangeGoodsExt.getGoodsId() == null) {
			return ResultVO.build(-1, "商品ID为空");
		}
		if (exchangeGoodsExt.getOrdersubId() == null || "".equals(exchangeGoodsExt.getOrdersubId())) {
			return ResultVO.build(-1, "子订单ID为空");
		}
		if (exchangeGoodsExt.getExchangeReason() == null || "".equals(exchangeGoodsExt.getExchangeReason())) {
			return ResultVO.build(-1, "请输入换货原因");
		}

		// 获取商品id
		int goodsId = exchangeGoodsExt.getGoodsId();
		// 获取子订单id
		String ordersubId = exchangeGoodsExt.getOrdersubId();

		// 1.根据商品id查询换货商品表
		TbExchangeItem tbExchangeItem = exchangeItemMapper.selectByGoodsId(goodsId);
		System.out.println("获取换货商品表" + JsonUtils.objectToJson(tbExchangeItem));

		// 2.在换货商品表里查询判断商品是否已存在
		// 如果存在 则返回已换货提示
		if (tbExchangeItem != null && tbExchangeItem.getOrderItemId() != null) {
			return ResultVO.build(-1, "该商品已申请换货，请关注处理流程");
		} else {
			// 3.如果不存在 则申请换货
			// 根据ordersubId获取子订单表
			TbSubOrder tbSubOrder = subMapper.selectByPrimaryKey(ordersubId);
			System.out.println("获取子订单表" + JsonUtils.objectToJson(tbSubOrder));
			
			// 根据goodsId获取订单商品表数据
			TbOrderItemExample example = new TbOrderItemExample();
			com.supergo.pojo.TbOrderItemExample.Criteria criteria = example.createCriteria();
			criteria.andGoodsIdEqualTo(goodsId);
			List<TbOrderItem> tbOrderItemList = itemMapper.selectByExample(example);

			if (tbOrderItemList != null && tbOrderItemList.size() > 0) {
				
				TbOrderItem tbOrderItem = tbOrderItemList.get(0);
				tbOrderItem.setCreateId(exchangeGoodsExt.getCreateId());
				tbOrderItem.setUpdateId(exchangeGoodsExt.getUpdateId());
				System.out.println("订单商品表" + JsonUtils.objectToJson(tbOrderItem));
				
				// 将子订单表和订单商品表封装进订单换货表
				TbExchangeGoods tbExchangeGoods = findByOrderList(tbOrderItem, tbSubOrder);
				
				// 获取换货理由
				tbExchangeGoods.setExchangeReason(exchangeGoodsExt.getExchangeReason());
				System.out.println("获取换货理由" + JsonUtils.objectToJson(tbExchangeGoods));
				
				// 将子订单表和订单商品表封装进订单商品换货表
				tbExchangeItem = findByItemList(tbOrderItem, tbSubOrder);

				// 修改订单商品表中的状态
				int n = itemMapper.updateStatusByKey(goodsId);
				System.out.println("修改订单商品表中的状态" + n);
				if (n < 0) {
					return ResultVO.build(500, "修改订单商品表中的状态失败");
				}

				// 将封装的数据插入订单换货表
				int insertReturnGoodsNums = mapper.insertSelective(tbExchangeGoods);
				System.out.println("插入订单换货表影响的行数" + insertReturnGoodsNums);
				
				// 将封装的数据插入订单商品换货表
				int insertReturnItemsNums = exchangeItemMapper.insertSelective(tbExchangeItem);
				System.out.println("插入订单商品换货表影响的行数" + insertReturnItemsNums);
				
				if (insertReturnGoodsNums < 0 && insertReturnItemsNums < 0) {
					
					return ResultVO.build(-1, "申请换货失败，请稍后重试");
				}
			}
		}
		return ResultVO.build(200, "申请换货成功，请等待处理");
	}
	
	/**
	 * 
	 * 订单换货表数据的获取
	 */
	private TbExchangeGoods findByOrderList(TbOrderItem tbOrderItem, TbSubOrder tbSubOrder) {
		if (tbOrderItem != null && tbSubOrder != null) {
			// 订单换货表
			TbExchangeGoods tbExchangeGoods = new TbExchangeGoods();
			tbExchangeGoods.setOrdersubId(tbSubOrder.getOrdersubId());
			tbExchangeGoods.setTbOrder(tbSubOrder.getOrderId());
			// 设置换货初始状态为1：审核中
			tbExchangeGoods.setAuditStatus("1");
			tbExchangeGoods.setApplyTime(new Date());
			// 设置换货初始状态为1：申请中
			tbExchangeGoods.setExchangeGoodsStatus("1");
			tbExchangeGoods.setExchangeGoodsTime(tbSubOrder.getUpdateTime());
			tbExchangeGoods.setCreateId(tbSubOrder.getCreateId());
			tbExchangeGoods.setCreateTime(tbSubOrder.getCreateTime());
			tbExchangeGoods.setUpdateId(tbSubOrder.getUpdateId());
			tbExchangeGoods.setUpdateTime(tbSubOrder.getUpdateTime());
			return tbExchangeGoods;
		}
		return null;
	}

	/**
	 * 
	 * 订单商品换货表数据的获取
	 */
	private TbExchangeItem findByItemList(TbOrderItem tbOrderItem, TbSubOrder tbSubOrder) {
		if (tbOrderItem != null && tbSubOrder != null) {

			// 订单商品换货表
			TbExchangeItem tbExchangeItem = new TbExchangeItem();
			tbExchangeItem.setOrderItemId(tbOrderItem.getOrderItemId());// 订单商品表
			tbExchangeItem.setGoodsId(tbOrderItem.getGoodsId());
			tbExchangeItem.setOrdersubId(tbOrderItem.getOrdersubId());
			tbExchangeItem.setGoodsName(tbOrderItem.getGoodsName());
			tbExchangeItem.setReciveName(tbSubOrder.getShopName());
			tbExchangeItem.setShopName(tbSubOrder.getShopName());
			if (tbSubOrder.getShopId() == null || "".equals(tbSubOrder.getShopId())) {
				return null;
			}
			tbExchangeItem.setShopId(Integer.valueOf(tbSubOrder.getShopId()));
			tbExchangeItem.setSellPrice(tbOrderItem.getSellPrice());
			tbExchangeItem.setActualPayment(tbOrderItem.getActualPayment());
			tbExchangeItem.setQuantity(tbOrderItem.getQuantity());
			tbExchangeItem.setCreateId(tbOrderItem.getCreateId());
			tbOrderItem.setCreateTime(new Date());
			tbExchangeItem.setUpdateId(tbOrderItem.getUpdateId());
			tbExchangeItem.setUpdateTime(new Date());
			return tbExchangeItem;
		}
		return null;
	}
}
