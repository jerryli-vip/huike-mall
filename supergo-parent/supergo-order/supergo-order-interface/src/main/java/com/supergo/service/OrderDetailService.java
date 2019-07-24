package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.OrderListExt;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.pojo.ext.TbRefundExt;

public interface OrderDetailService {
	/**
	 * 退款单订单状态
	 * 
	 * @param ordersubId
	 * @return
	 */
	TbRefundExt selectRefundStatusById(String ordersubId);

	/**
	 * 订单信息
	 * 
	 * @param ordersubId
	 * @return
	 */
	TbSubOrder selectOrderById(String ordersubId);

	/**
	 * 订单明细
	 * 
	 * @param ordersubId
	 * @return
	 */
	List<OrderListExt> selectOrderList(String ordersubId);

	/**
	 * 收货人
	 * 
	 * @param ordersubId
	 * @return
	 */

	OrderListExt selectByDeliveryId(String ordersubId);

	/**
	 * 换货单订单状态
	 * 
	 * @param ordersubId
	 * @return
	 */

	TbExchangeGoodsExt selectExchangeStatusById(String ordersubId);

	/**
	 * 订单明细之商品详情
	 * 
	 * @param ordersubId
	 * @return
	 */
	List<OrderListExt> selectGoodsList(String ordersubId);

	/**
	 * 商品详情查詢
	 * 
	 * @param ordersubId
	 * @return
	 */
	List<OrderListExt> selectItemList(String ordersubId);

}
