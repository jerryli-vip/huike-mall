package com.supergo.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AllowOriginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// http://namezhou.iteye.com/blog/2384434
		response.setContentType("textml;charset=UTF-8");
		// 允许哪一个URL 访问 request.getHeader("Origin") 根据请求来的url动态允许
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		// 允许那种请求方法
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "0");
		// 允许请求头里的参数列表包含啥（我猜的）
		response.setHeader("Access-Control-Allow-Headers",
				"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
		// 允许对方带cookie访问
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("XDomainRequestAllowed", "1");
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

}
