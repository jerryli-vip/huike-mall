package com.supergo.shiro;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.noggit.JSONUtil;
import com.supergo.utils.ResultVO;

public class ShiroLoginFilter extends FormAuthenticationFilter{
	
	@Override
	protected boolean onAccessDenied(ServletRequest request,ServletResponse response) throws IOException{
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		if(isAjax(request)){
			httpServletResponse.setCharacterEncoding("UTF-8");
			httpServletResponse.setContentType("application/json");
			ResultVO vo = new ResultVO();
			vo.setStatus(500);
			vo.setMsg("认证失败，请重新登录");
			httpServletResponse.getWriter().write(JSONUtil.toJSON(vo).toString());
		}else{
			httpServletResponse.sendRedirect("/shoplogin.html");
		}
		return false;
	}
	private boolean isAjax(ServletRequest request){
		String header = ((HttpServletRequest)request).getHeader("X-Requested-With");
		if("XMLHttpRequest".equalsIgnoreCase(header)){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
