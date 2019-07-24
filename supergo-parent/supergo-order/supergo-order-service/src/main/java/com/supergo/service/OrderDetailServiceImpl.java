package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.mapper.ext.DetailExtMapper;
import com.supergo.mapper.ext.TbExchangeGoodsExtMapper;
import com.supergo.mapper.ext.TbRefundExtMapper;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.OrderListExt;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.pojo.ext.TbRefundExt;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	@Autowired
	private TbRefundExtMapper remapper;

	@Autowired
	private TbSubOrderMapper submapper;

	@Autowired
	private DetailExtMapper extmapper;

	@Autowired
	private TbExchangeGoodsExtMapper exmapper;

	/**
	 * 订单信息
	 */
	@Override
	public TbSubOrder selectOrderById(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		return submapper.selectByPrimaryKey(ordersubId);
	}

	/**
	 * 订单明细
	 */
	@Override
	public List<OrderListExt> selectOrderList(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		List<OrderListExt> orderlist =  extmapper.selectById(ordersubId);
		
		return orderlist;
	}

	/**
	 * 订单状态退货
	 */
	@Override
	public TbRefundExt selectRefundStatusById(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		return remapper.selectRefundStatusById(ordersubId);
	}

	/**
	 * 收货人
	 */
	@Override
	public OrderListExt selectByDeliveryId(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		return extmapper.selectDeliveryById(ordersubId);
	}

	/**
	 * 订单状态换货
	 */
	@Override
	public TbExchangeGoodsExt selectExchangeStatusById(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;

		}
		return exmapper.selectStatusById(ordersubId);
	}

	@Override
	public List<OrderListExt> selectGoodsList(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		return extmapper.selectGoodsListById(ordersubId);
	}

	/**
	 * 商品詳情查詢
	 */
	@Override
	public List<OrderListExt> selectItemList(String ordersubId) {
		if (StringUtils.isEmpty(ordersubId)) {
			return null;
		}
		return extmapper.selectItemListById(ordersubId);
	}
}
