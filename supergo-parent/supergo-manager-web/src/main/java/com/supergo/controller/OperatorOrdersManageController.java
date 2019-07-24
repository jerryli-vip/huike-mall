package com.supergo.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbOrder;
import com.supergo.pojo.TbOrderDelivery;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.pojo.ext.TbOrderManage;
import com.supergo.pojo.ext.TbReturnGoodsExt;
import com.supergo.service.OrdersManageService;
import com.supergo.service.ReturnGoodService;
import com.supergo.service.TbExchangeService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("operatorOrders")
public class OperatorOrdersManageController {

	
	@Reference
	private OrdersManageService service;
	
	@Reference
	private ReturnGoodService returnService;
	
	@Reference
	private TbExchangeService exchangeService;
	/**
	 * 订单管理之分页+查询
	 * @param manage
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("queryOrder/{page}/{rows}")
	public PageVO<TbOrderManage> queryOrder(@RequestBody(required = false) TbOrderManage manage,
			@PathVariable Integer page, @PathVariable Integer rows) {
		
		return service.query(manage, page, rows);
	}
	
	/**
	 * 订单详情之订单信息
	 * @param ordersubId
	 * @return
	 */
	  @RequestMapping("order/{ordersubId}")
	  public ResultVO order(@PathVariable String ordersubId){
		 TbOrder orderList= service.selectOrderById(ordersubId);
		  return ResultVO.build(200, "查询成功",orderList);
	  }
	  
	  /**
	   * 订单详情之订单明细
	   * @param ordersubId
	   * @return
	   */
	  @RequestMapping("queryOrderItem/{ordersubId}")
	  public ResultVO queryOrderItem(@PathVariable String ordersubId){
		
		  List<TbOrderItem> orderItemlist = service.selectOrderList(ordersubId);
		  //设置可读权限
		  orderItemlist=Collections.unmodifiableList(orderItemlist);
		
		  return ResultVO.ok(orderItemlist);
	  }
	  
	  /**
	   * 订单详情之收货人
	   * @param ordersubId
	   * @return
	   */
	  @RequestMapping("queryOrderdelivery/{ordersubId}")
	  public ResultVO queryOrderdelivery(@PathVariable String ordersubId){
		 TbOrderDelivery deliveryList= service.selectByDeliveryId(ordersubId);
		 return ResultVO.build(200, "查询成功",deliveryList);
	  }
	  /**
	   * 订单详情之订单状态
	   * @param ordersubId
	   * @return
	   */
	  @RequestMapping("querySubOrderStatus/{ordersubId}")
	  public ResultVO querySubOrderStatus(@PathVariable String ordersubId){
		
		  TbSubOrder subOrderList = service.selectSubOrderById(ordersubId);
		  
		  return ResultVO.build(200, "查询成功",subOrderList);
		  
	  }
	  /**
	   * 订单管理之退换货界面初始化
	   * @param returnGoods
	   * @return
	   */
	  @RequestMapping("queryReturnOrderItem/{ordersubId}")
	  public ResultVO queryReturnOrderItem(@PathVariable String ordersubId) {
			
		List<TbOrderManage> initOrderItemList = service.InitOrderItem(ordersubId);
		
		//设置可读权限
		initOrderItemList=Collections.unmodifiableList(initOrderItemList);
		
		return ResultVO.ok(initOrderItemList);
		
		}
	/**
	 * 订单管理之退货申请
	 * @param returnGoods
	 * @return
	 */
	@RequestMapping("returnGoodsRequest")
	public ResultVO returnGoodsRequest(@RequestBody(required = false) TbReturnGoodsExt returnGoods,HttpSession session) {
		TbMember member = (TbMember) session.getAttribute("member");
		if (member != null){
		returnGoods.setCreateId(member.getMemberId());
		returnGoods.setUpdateId(member.getMemberId());
		}
		return returnService.updateRetuen(returnGoods);
	
	}	
	/**
	 * 订单管理之换货申请
	 * @param exchangeGoodsExt
	 * @return
	 */
	@RequestMapping("exchangeGoodsRequest")
	public ResultVO exchangeGoodsRequest(@RequestBody(required = false) TbExchangeGoodsExt exchangeGoodsExt,HttpSession session) {
		TbMember member = (TbMember) session.getAttribute("member");
		if (member != null) {
		exchangeGoodsExt.setCreateId(member.getMemberId());
		exchangeGoodsExt.setUpdateId(member.getMemberId());
		}
		return exchangeService.updateExchange(exchangeGoodsExt);
	}	
	
}
