package com.supergo.controller.interceptor;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.ext.Cart;
import com.supergo.service.CartService;
import com.supergo.utils.CookieUtils;
import com.supergo.utils.JsonUtils;

public class MergeCartIntercepto implements HandlerInterceptor {

	@Reference
	private CartService service;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 1-获取session信息
		TbMember member = (TbMember) request.getSession().getAttribute("member");
		// 如果session为空说明未登录
		if (member == null) {
			return true;
		}
		// 2-获取cookie中的令牌tokenId
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtils.getCookie(cookies, "tokenId");
		// 如果cookie中的令牌tokenId为空，则不能合并
		if (cookie == null) {
			return true;
		}
		// 获取cookie中的购物车信息
		String cartListJson = CookieUtils.getCookieValue(request, "cartList",true);
		if (cartListJson == null || cartListJson.equals("")) {
			cartListJson = "[]";
		}
		// 获取购物车列表
		List<Cart> cookieCartList = JsonUtils.jsonToList(cartListJson, Cart.class);
		// 如果cookie中的购物车信息为空，则不需要合并
		if (cookieCartList == null) {
			return true;
		} else {
			// 若上面通过 则进行合并
			if (member != null) {
				Integer memberId = member.getMemberId();
				if (memberId != null) {
					service.combineCartList(cookieCartList, memberId);
					// 清空cookie中的购物车数据数据
					CookieUtils.deleteCookie(request, response, "cartList");
					System.out.println("111111111111111111111111");
				}
				
			}

		}

		return true;
	}
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
