package com.supergo.controller.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
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

		try {
			// 如果第一次请求跨域的话 会先用OPTIONS请求方法测试一下，所以放行
			if (request.getMethod().equalsIgnoreCase("OPTIONS")) {
				return true;
			}
			// 获取请求的URI
			String requestURI = request.getRequestURI();

			System.out.println("拦截URL:" + requestURI);

			// 1、 如果请求的URL是公开地址（无需登录就可以访问的URL），采取放行。
			// if (requestURI.indexOf("login") > -1) {
			// return true;
			// }

			// 2、 如果用户session存在，则放行。
			TbMember member = (TbMember) request.getSession().getAttribute("member");
			if (member != null && member.getMemberId() != null && member.getMemberId() >= 0) {
				System.out.println("有session" + member);
				return true;
			}
			// 3、 如果用户session中不存在,则查询cookie中的令牌tokenId
			Cookie[] cookies = request.getCookies();
			Cookie cookie = CookieUtils.getCookie(cookies, "tokenId");
			// 如果cookie为空，则跳转到登录页面。
			if (cookie == null) {
				// 如果为空，则跳转到登录页面。
				System.out.println("cookie 为空1");
				response.sendRedirect("http://sso.supergo.com/login.html");
				return false;
			}
			System.out.println("有cookie" + cookie);
			// 如果cookie不为空，再获取value值
			String value = cookie.getValue();
			// 如果value值为空，则放行
			if (StringUtils.isBlank(value) || value.trim().length() < 10) {
				// 如果为空，则跳转到登录页面。
				System.out.println("cookie 为空2");
				response.sendRedirect("http://sso.supergo.com/login.html");
				return false;
			}

			System.out.println("tokenId:" + value);
			// 取出Cookie中的tokenId,查询redis中是否存在
			ResultVO redisMember = service.getRedis(value);
			// 如果不空，则将信息写入session
			if (redisMember.getStatus() == 200) {
				request.getSession().setAttribute("member", redisMember.getData());
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
