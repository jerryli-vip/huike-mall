package com.supergo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbOrderItem;

import com.supergo.pojo.ext.Cart;
import com.supergo.pojo.ext.OrderVO;
import com.supergo.service.CartService;
import com.supergo.service.OrderService;
import com.supergo.service.SsoService;

import com.supergo.utils.IDUtils;
import com.supergo.utils.ResultVO;

/**
 * 购物车结算创建订单
 * 
 *  @author 陈阳
 * */

@RestController
@RequestMapping("/Order")
public class TbOrderController {
	
	@Reference
	private OrderService orderService;
	@Reference
	private SsoService tbMembersService;
	@Reference
	private CartService cartService;
	
	/**
	 * 接收购物车订单跟收货人地址
	 * 
	 * */
	@RequestMapping("/addOrder")
	public ResultVO addOrder(@RequestBody(required=false) OrderVO orderVO,HttpSession session){
		
		
		if(orderVO==null){
			return ResultVO.build(500, "没收到订单讯息");
		}
		
		if(orderVO.getPaymentType()==null||orderVO.getPaymentType().length()<=0){
			return ResultVO.build(500, "请选择付款方式");
		}
		if(orderVO.getCartList()==null||orderVO.getCartList().size()==0){
			return ResultVO.build(500, "请选择购买物品");
		}
		if(orderVO.getAddress()==null){
			return ResultVO.build(500, "请选择收货地址");
		}
		
		// 获取登录人ID
		TbMember tbMember = (TbMember) session.getAttribute("member");
		//判断是否有用户信息
		if(tbMember==null || tbMember.getMemberId()==null || tbMember.getMemberId() < 0){
			return ResultVO.build(500, "未获取到会员信息");
		}
		//获取当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String date = df.format(new Date());
		Random random = new Random();  
		int ends = random.nextInt(99);  
		String math = String.format("%02d",ends);
		//生成主订单
		String id = date+math;
		//给每个子订单设置子订单号码
		for (Cart cart : orderVO.getCartList()) {
			for(TbOrderItem orderItem : cart.getTbOrderItemlist()){
				//生成子订单id
				Long itemId = IDUtils.genItemId();
				//转成string
				String orderSubId = itemId.toString();
				//设置子订单属性
				orderItem.setOrdersubId(orderSubId);
			}
		}
		
		//参数还需要传入会员id这里没获取  
		ResultVO vo =  orderService.addOrder(orderVO.getPaymentType(),orderVO.getCartList(),orderVO.getAddress(),id,tbMember.getMemberId());	
		//判断订单是否生成成功
		if(vo.getStatus()==200){
			//如果生成成功将将订单号存入redis中
			ResultVO re = cartService.saveOrderId(tbMember.getMemberId(), id);
			//如果生成成功，将redis中的购买清单清空
			ResultVO result =  cartService.cleanSettlementCartList(tbMember.getMemberId());
			//判断购物清单是否清空
			if(result.getStatus()==200){
				//如果清空成功返回vo
				return vo;
			}else{
				//如果不成功则返回result
				return result;
			}
		}else{
			//如果订单没有生成成功返回vo
			return vo;
		}
		
	}
	
	




	/**
	 * 结算页初始化获取结算清单
	 * 
	 * */
	@RequestMapping("/getList")
	public ResultVO getList(HttpSession session){
		// 获取登录人ID
		TbMember tbMember = (TbMember) session.getAttribute("member");
		if(tbMember==null || tbMember.getMemberId()==null || tbMember.getMemberId() < 0){
			return ResultVO.build(500, "未获取到会员信息");
		}
		
		return cartService.getSettlementCartList(tbMember.getMemberId());
		
	}
	
	/**
	 * 支付成功页获取订单号
	 * 
	 * */
	@RequestMapping("/getOrderId")
	public ResultVO getOrderId(HttpSession session){
		//获取登录人ID
		
		TbMember tbMember = (TbMember) session.getAttribute("member");
		if(tbMember==null || tbMember.getMemberId()==null || tbMember.getMemberId() < 0){
			return ResultVO.build(500, "未获取到会员信息");
		}
		
		return cartService.getOrderId(tbMember.getMemberId());
		
	}
	
	
	
}
