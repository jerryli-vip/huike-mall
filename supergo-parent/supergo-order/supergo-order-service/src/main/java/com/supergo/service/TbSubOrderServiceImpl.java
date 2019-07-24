package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbOrderDeliveryMapper;
import com.supergo.mapper.TbOrderItemMapper;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.mapper.ext.TbSubOrderExtMapper;
import com.supergo.pojo.TbOrderDelivery;
import com.supergo.pojo.TbOrderDeliveryExample;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbOrderItemExample;
import com.supergo.pojo.TbOrderItemExample.Criteria;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.OrderDetailVO;
import com.supergo.pojo.ext.TbSubOrderExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbSubOrderServiceImpl implements TbSubOrderService {
	@Autowired
	private TbSubOrderMapper tbSubOrderMapper;
	@Autowired
	private TbOrderDeliveryMapper tbOrderDeliveryMapper;
	@Autowired
	private TbOrderItemMapper tbOrderItemMapper;
	@Autowired
	private TbSubOrderExtMapper mapperExt;

	@Override
	public PageVO<TbSubOrderExt> query(Integer page, Integer rows, TbSubOrder tbSubOrder) {
		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		// 开启分页插件
		PageHelper.startPage(page, rows);
		List<TbSubOrderExt> list = mapperExt.query(tbSubOrder);
		// 获取分页后的信息
		PageInfo<TbSubOrderExt> pageInfo = new PageInfo<>(list);

		// 将结果赋值给pagevo对象
		PageVO<TbSubOrderExt> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}

	/**
	 * 订单详情 为了解耦 将3表关联查询 分解成3次单独的查询
	 */
	@Override
	public ResultVO orderDetail(String id, TbSubOrder tbSubOrder) {
		// 本次要查3张表 一张订单子表 一张商品表 一张物流表
		// 1. 字段值检验
		if (id == null || !id.matches("[0-9]\\d*")) {
			return ResultVO.build(-1, "订单id不能为空");

		}
		if (tbSubOrder == null || tbSubOrder.getMemberId() == null || tbSubOrder.getMemberId() <= 0) {
			return ResultVO.build(-1, "用户未登录");
		}

		// 2. 查询子订单列表
		TbSubOrder subOrder = tbSubOrderMapper.selectByPrimaryKey(id);
		System.out.println("subOrder" + subOrder);
		if (subOrder == null || subOrder.getMemberId() == null
				|| !tbSubOrder.getMemberId().equals(subOrder.getMemberId())) {
			return ResultVO.build(-1, "订单不存在，或不能查询非自己的订单");
		}
		// 3. 查询订单商品表
		TbOrderItemExample example = new TbOrderItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andOrdersubIdEqualTo(id);
		List<TbOrderItem> itemList = tbOrderItemMapper.selectByExample(example);
		if (itemList == null || itemList.size() <= 0) {
			return ResultVO.build(-1, "订单内容为空");
		}
		// 4. 查询物流地址表
		TbOrderDeliveryExample deliveryExample = new TbOrderDeliveryExample();
		com.supergo.pojo.TbOrderDeliveryExample.Criteria deliveryCriteria = deliveryExample.createCriteria();
		deliveryCriteria.andOrdersubIdEqualTo(id);
		List<TbOrderDelivery> orderDeliveryList = tbOrderDeliveryMapper.selectByExample(deliveryExample);

		// 5. 封装订单详情VO类
		OrderDetailVO orderDetailVO = new OrderDetailVO();
		orderDetailVO.setItemList(itemList);
		orderDetailVO.setTbSubOrder(subOrder);

		if (orderDeliveryList == null || orderDeliveryList.size() <= 0) {
			return ResultVO.build(200, "订单物流信息为空", orderDetailVO);
		}
		orderDetailVO.setOrderDelivery(orderDeliveryList.get(0));
		return ResultVO.ok(orderDetailVO);
	}

}
