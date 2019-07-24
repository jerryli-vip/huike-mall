package com.supergo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.ext.Cart;
import com.supergo.service.CartService;
import com.supergo.utils.CookieUtils;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.ResultVO;

@RequestMapping("cart")
@RestController
public class CartController {
	@Reference
	private CartService service;

	/**
	 * 添加商品到购物车列表
	 * 
	 * @param goodsId
	 * @param quantity
	 * @return
	 */
	@RequestMapping("addToCartList/{goodsId}/{quantity}")
	public ResultVO addGoodsToCartList(HttpServletRequest request, HttpServletResponse response,
			@PathVariable Integer goodsId, @PathVariable Integer quantity) {

		System.out.println(goodsId);
		System.out.println(quantity);
		List<Cart> cartList = queryCartList(request);
		cartList = service.addToCartList(cartList, goodsId, quantity);
		System.out.println(cartList);
		TbMember member = (TbMember) request.getSession().getAttribute("member");

		if (member == null || member.getMemberId() == null || member.getMemberId() < 0) {
			
			CookieUtils.setCookie(request, response, "cartList", JsonUtils.objectToJson(cartList),true);
			return ResultVO.build(200, "添加成功", cartList);
		} else {
			service.saveCartListToRedis(member.getMemberId(), cartList);
			return ResultVO.build(200, "添加成功", cartList);
		}

		

	}

	/**
	 * 查找购物车列表
	 * 
	 * @return
	 */
	@RequestMapping("/queryCartList")
	public List<Cart> queryCartList(HttpServletRequest request) {

		// 获取登录人ID
		TbMember member = (TbMember) request.getSession().getAttribute("member");
		
		if (member != null && member.getMemberId() != null && member.getMemberId() > 0) {
			
			return service.queryCartListFromRedis(member.getMemberId());
			
		} else {
			
			String cartListJson = CookieUtils.getCookieValue(request, "cartList",true);
			
			if (cartListJson == null || cartListJson.equals("")) {
				
				cartListJson = "[]";
				
			}
			
			return JsonUtils.jsonToList(cartListJson, Cart.class);
			
		}
		
		

	}

	/**
	 * 修改商品数量
	 * 
	 * @param goodsId
	 * @param quantity
	 * @return
	 */
	@RequestMapping("editGoodsToQuantity/{goodsId}/{quantity}")
	public ResultVO editGoodsToQuantity(HttpServletRequest request, HttpServletResponse response,
			@PathVariable Integer goodsId, @PathVariable Integer quantity) {
		// 获取登录人ID
		TbMember member = (TbMember) request.getSession().getAttribute("member");
		List<Cart> cartList = queryCartList(request);
		System.out.println(cartList);
		System.out.println(goodsId);
		System.out.println(quantity);
		ResultVO cartlsit = service.editGoodsToQuantity(cartList, goodsId, quantity);
		if (cartlsit.getData() != null) {
			if (member != null && member.getMemberId() != null && member.getMemberId() > 0) {
				service.saveCartListToRedis(member.getMemberId(), (List<Cart>) cartlsit.getData());
				return ResultVO.build(200, "修改成功");
			}else{
				CookieUtils.setCookie(request, response, "cartList", JsonUtils.objectToJson( (List<Cart>) cartlsit.getData()),true);
				return ResultVO.build(200, "修改成功");
			}
		}
		return ResultVO.build(-1, "修改失败");
	}

	/**
	 * 删除选中商品
	 * 
	 * @param ids
	 * @param member
	 * @return
	 */
	@RequestMapping("delete")
	public ResultVO delete(@RequestBody(required = false) List<Integer> ids,  HttpServletResponse response, HttpServletRequest request) {
		System.out.println(ids.toString());
		if (ids == null || ids.size() <= 0) {
			return ResultVO.build(-1, "没有选中商品");
		}
		TbMember member = (TbMember) request.getSession().getAttribute("member");
		List<Cart> cartList = queryCartList(request);
		cartList =  service.deleteByIds(ids, cartList);
		if (member != null && member.getMemberId() != null && member.getMemberId() > 0) {
			service.saveCartListToRedis(member.getMemberId(), cartList);
			return ResultVO.build(200, "删除成功");
		}else{
			CookieUtils.setCookie(request, response, "cartList", JsonUtils.objectToJson(cartList),true);
			return ResultVO.build(200, "删除成功");
		}
	}

	/**
	 * 合并购物车
	 * 
	 * @return
	 */
	/*
	 * @RequestMapping("/combineCartList") public void
	 * combineCartList(HttpServletRequest request, HttpServletResponse response)
	 * { // 获取cookie中的购物车信息 String cartListJson =
	 * CookieUtils.getCookieValue(request, "cartList"); if (cartListJson == null
	 * || cartListJson.equals("")) { cartListJson = "[]"; } // 获取购物车列表
	 * List<Cart> cookieCartList = JsonUtils.jsonToList(cartListJson,
	 * Cart.class);
	 * 
	 * TbMember member = (TbMember) request.getSession().getAttribute("member");
	 * if (member != null) { Integer memberId = member.getMemberId(); if
	 * (memberId != null) { // 获取redis中的购物车 List<Cart> redisCartList =
	 * service.queryCartListFromRedis(memberId);
	 * 
	 * // 合并购物车 redisCartList.addAll(cookieCartList);
	 * 
	 * // 将合并后的购物车存入Redis service.saveCartListToRedis(memberId, redisCartList);
	 * 
	 * // 清空cookie中的数据 CookieUtils.setCookie(request, response, "cartList",
	 * "[]");
	 * 
	 * } } }
	 * 
	 */
	/**
	 *  结算购物车
	 * 
	 **/
	@RequestMapping("saveList")
	public ResultVO saveList(@RequestBody(required=false) List<Cart> cartlist ,HttpSession session){
		System.out.println("32423");
		System.out.println(cartlist);
		
		//判断集合是否为空
		if(cartlist !=null && !cartlist.isEmpty()){
			//获取session中存放的用户信息
			TbMember tbMember = (TbMember) session.getAttribute("member");
			//判断用户信息是否为空
			if (tbMember==null ||tbMember.getMemberId()==null || tbMember.getMemberId() < 0){
				return ResultVO.build(500, "请登录后在提交结算");
			}
			Integer memberId = tbMember.getMemberId();
			//如果list不为空，将list传入service层上传到redis中
			ResultVO vo = service.saveSettlementCartList(memberId,cartlist);
			System.out.println(vo);
			return vo;
		}else{
			return ResultVO.build(500, "传入的清单为空");
		}
	
	}
}
