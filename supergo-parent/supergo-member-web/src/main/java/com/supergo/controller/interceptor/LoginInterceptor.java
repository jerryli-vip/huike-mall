package com.supergo.controller.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.service.SsoService;
import com.supergo.utils.CookieUtils;
import com.supergo.utils.ResultVO;
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Reference
	private SsoService service;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try{
		// 获取请求的URI
		String requestURI = request.getRequestURI();

		System.out.println("拦截URL:"+requestURI);

		// 1、 如果请求的URL是公开地址（无需登录就可以访问的URL），采取放行。
		if (requestURI.indexOf("login") > -1){return true;}
			
		// 2、 如果用户session存在，则放行。
		TbMember member = (TbMember) request.getSession().getAttribute("member");
		if (member != null && !member.equals("")){return true;}
			
		// 3、 如果用户session中不存在,则查询cookie中的令牌tokenId
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtils.getCookie(cookies, "tokenId");
		// 如果cookie为空，则放行
		if (cookie == null) {
			// 请求放行
			return true;
		}

		// 如果cookie不为空，再获取value值
		String value = cookie.getValue();
		// 如果value值为空，则放行
		if (value == null || "".equals(value)) {
			// 请求放行
			return true;
		}
		System.out.println("tokenId:"+value);
		// 取出Cookie中的tokenId,查询redis中是否存在
		ResultVO redisMember = service.getRedis(value);
		//如果不空，则将信息写入session
		if (redisMember.getData() != null) {
			request.getSession().setAttribute("member",redisMember.getData());
		}else {
			// 如果为空，则跳转到登录页面。
			response.sendRedirect("http://sso.supergo.com/login.html");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
