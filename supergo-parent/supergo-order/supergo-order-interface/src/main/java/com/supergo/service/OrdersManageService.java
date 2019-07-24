package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbOrder;
import com.supergo.pojo.TbOrderDelivery;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbOrderManage;
import com.supergo.utils.PageVO;

public interface OrdersManageService {
	/**
	 * 订单管理分页查询接口
	 * @param manage
	 * @param page
	 * @param rows
	 * @return
	 */
	PageVO<TbOrderManage> query(TbOrderManage manage, Integer page, Integer rows);

	/**
	 * 订单详情之订单信息
	 * 
	 * @param ordersubId
	 * @return
	 */
	TbOrder selectOrderById(String ordersubId);

	/**
	 * 订单详情之订单明细
	 * 
	 * @param ordersubId
	 * @return
	 */
	List<TbOrderItem> selectOrderList(String ordersubId);

	/**
	 * 订单详情之收货人
	 * 
	 * @param ordersubId
	 * @return
	 */
	TbOrderDelivery selectByDeliveryId(String ordersubId);

	/**
	 * 订单详情之订单状态
	 * 
	 * @param ordersubId
	 * @return
	 */
	TbSubOrder selectSubOrderById(String ordersubId);

	/**
	 * 订单管理之退换货界面初始化
	 * 
	 * @param ordersubId
	 * @return
	 */
	List<TbOrderManage> InitOrderItem(String ordersubId);

}
