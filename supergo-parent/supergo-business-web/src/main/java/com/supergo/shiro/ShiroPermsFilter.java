package com.supergo.shiro;

import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.ResultVO;

public class ShiroPermsFilter extends PermissionsAuthorizationFilter{
	@Override
	protected boolean onAccessDenied(ServletRequest servletRequest,ServletResponse servletResponse) throws IOException{
		HttpServletResponse httpServetResonse = (HttpServletResponse)servletResponse;
		if(isAjax(servletRequest)){
			httpServetResonse.setCharacterEncoding("UTF-8");
			httpServetResonse.setContentType("application/json");
			ResultVO vo = new  ResultVO();
			vo.setStatus(500);
			vo.setMsg("您的权限不足");
			httpServetResonse.getWriter().write(JsonUtils.objectToJson(vo));
		}else{
			httpServetResonse.sendRedirect("/unauthorized.html");
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
