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

			TbMember member = (TbMember) request.getSession().getAttribute("member");
			Cookie[] cookies = request.getCookies();
			Cookie cookie = CookieUtils.getCookie(cookies, "tokenId");
			ResultVO vo = null;
			if (member == null && cookie != null && !StringUtils.isEmpty(cookie.getValue())) {
				System.out.println("首次跨域登录成功");
				vo = service.getRedis(cookie.getValue());
			}
			if (vo !=null && vo.getData() != null) {
				request.getSession().setAttribute("member", vo.getData());
				System.out.println("session用户写入成功 ");
				return true;
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
