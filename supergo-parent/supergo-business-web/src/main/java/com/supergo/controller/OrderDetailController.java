package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.OrderListExt;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.pojo.ext.TbRefundExt;
import com.supergo.service.OrderDetailService;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("detail")
public class OrderDetailController {
	@Reference
	private OrderDetailService service;

	/**
	 * 订单信息
	 * 
	 * @param ordersubId
	 * @return
	 */
	@RequestMapping("queryorder/{ordersubId}")
	public ResultVO queryOrder(@PathVariable String ordersubId) {
		TbSubOrder sub = service.selectOrderById(ordersubId);
		return ResultVO.build(200, "查询成功", sub);
	}

	/**
	 * 订单明细
	 */
	@RequestMapping("queryorderlist/{ordersubId}")
	public ResultVO queryOrderList(@PathVariable String ordersubId) {
		List<OrderListExt> orderlist = service.selectOrderList(ordersubId);
		System.out.println(orderlist.toString());
		return ResultVO.build(200, "查询成功", orderlist);
	}

	/***
	 * 退货单单状态
	 * 
	 * @param ordersubId
	 * @return
	 */
	@RequestMapping("querystatus/{ordersubId}")
	public ResultVO queryOrderRefundStatus(@PathVariable String ordersubId) {
		TbRefundExt refund = service.selectRefundStatusById(ordersubId);
		return ResultVO.build(200, "查询成功", refund);
	}

	/**
	 * 收货人
	 * 
	 * @param ordersubId
	 * @return
	 */
	@RequestMapping("querydelivery/{ordersubId}")
	public ResultVO queryOrderDelivery(@PathVariable String ordersubId) {
		OrderListExt delivery = service.selectByDeliveryId(ordersubId);
		return ResultVO.build(200, "查询成功", delivery);
	}

	/***
	 * 换货单单状态
	 * 
	 * @param ordersubId
	 * @return
	 */
	@RequestMapping("queryexstatus/{ordersubId}")
	public ResultVO queryOrderExchangeStatus(@PathVariable String ordersubId) {
		TbExchangeGoodsExt goods = service.selectExchangeStatusById(ordersubId);
		return ResultVO.build(200, "查询成功", goods);
	}

	@RequestMapping("querygoods/{ordersubId}")
	public ResultVO queryGoodsList(@PathVariable String ordersubId) {

		List<OrderListExt> listExt = service.selectGoodsList(ordersubId);
		return ResultVO.build(200, "查询成功", listExt);

	}

	/**
	 * 退换货商品信息详情
	 * 
	 * @param ordersubId
	 * @return
	 */
	@RequestMapping("querygoodslist/{ordersubId}")
	public ResultVO queryItemList(@PathVariable String ordersubId) {

		List<OrderListExt> listExt = service.selectItemList(ordersubId);
		return ResultVO.build(200, "查询成功", listExt);

	}

}
