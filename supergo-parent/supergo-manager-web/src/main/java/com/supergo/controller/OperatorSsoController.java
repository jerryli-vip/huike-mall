package com.supergo.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supergo.pojo.TbSysuser;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/admin")
public class OperatorSsoController {
	/**
	 * 运营商登录
	 * 
	 * @param username
	 * @param password
	 * @param session
	 * @author 王斌
	 * @return
	 */
	@RequestMapping("login")
	public ResultVO login(String username, String password, HttpSession session) {
		if(username == null)
			return ResultVO.build(500, "用户名为空");
		if(password == null){
			return ResultVO.build(500, "密码为空");
		}
		password = DigestUtils.md5Hex(password);
		// shiro框架API使用
		// 获取Subject(状态为未认证)
		Subject subject = SecurityUtils.getSubject();
		// 创建登录令牌(用户名和密码)
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		try {
			// 执行shiro框架的登录操作
			subject.login(token);
		} catch (UnknownAccountException e) {
			e.printStackTrace();
			return ResultVO.build(500, "用户不存在");
		} catch (IncorrectCredentialsException e) {
			e.printStackTrace();
			return ResultVO.build(500, "密码不正确");
		}
		// 获取登录用户
		TbSysuser user = (TbSysuser) subject.getPrincipal();
		session.setAttribute("LastTime", new Date());
		session.setAttribute("systemUser", user);
		return ResultVO.build(200,"登录成功");
	}
	
	
	/**
	 * 退出登陆
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public ResultVO logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			// 消除session
			session.invalidate();
			// 消除cookie
			Cookie[] cookies = request.getCookies();
			if (null == cookies) {
				System.out.println("没有cookie");
			} else {
				for (Cookie cookie : cookies) {
					cookie.setValue(null);
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
			return ResultVO.build(200, "退出成功");
		} catch (Exception e) {
			return ResultVO.build(500, "退出失败");
		}
	}
}
