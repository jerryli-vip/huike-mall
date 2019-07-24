package com.supergo.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;
import com.supergo.service.BusinessService;
import com.supergo.utils.ResultVO;

/**
 * 商家登陆注册
 * 
 * @author leosam
 *
 */
@RestController
public class BusinessSsoController {

	@Reference
	private BusinessService service;

	/**
	 * cxk
	 * 
	 * @param tbBusiness
	 * @param tbShopUser
	 * @param tbShop
	 * @return
	 */
	@RequestMapping("register")
	public ResultVO register(TbBusiness tbBusiness, TbShopUser tbShopUser, TbShop tbShop) {

		String result = service.insert(tbBusiness, tbShop, tbShopUser);

		if ("注册成功".equals(result)) {
			return ResultVO.build(200, result);
		}
		return ResultVO.build(-1, result);
	}

	/**
	 * 进行登陆 李聪
	 * 
	 * @param shopUserName
	 * @param shopUserPassword
	 * @param checkCode
	 * @param session
	 * @return
	 */
	@RequestMapping("login")
	public ResultVO login(String shopUserName, String shopUserPassword, String checkCode, HttpSession session) {

		// 处理验证码
		Object object = session.getAttribute("checkCode");
		// 销毁验证码
		session.removeAttribute("checkCode");

		System.out.println("checkCode" + checkCode);
		System.out.println("tmp" + (String) object);

		// 检验用户是否输入账号或者密码
		if (StringUtils.isEmpty(shopUserPassword) || StringUtils.isEmpty(shopUserName)) {
			return ResultVO.build(-1, "用户名或者密码为空");
		}
		// 检验是否输入验证码
		if (checkCode == null || checkCode.length() != 4 || object == null
				|| !checkCode.equalsIgnoreCase((String) object)) {
			return ResultVO.build(-1, "登录失败，未输验证码或验证码错误");
		}

		TbShopUser shopUser = service.selectByShopUserName(shopUserName);
//		// 检验用户是否存在
//		if (shopUser == null || !DigestUtils.md5Hex(shopUserPassword).equals(shopUser.getShopUserPassword())) {
//			return ResultVO.build(-1, "用户名或者密码错误");
//		}
		//检验用户是否审核通过
		if(shopUser != null && !DigestUtils.md5Hex(shopUserPassword).equals(shopUserPassword)&&shopUser.getBak1()=="N")
			return ResultVO.build(500, "商家待审核");
		String password = DigestUtils.md5Hex(shopUserPassword);
		// shiro框架API使用
		// 获取Subject(状态为未认证)
		Subject subject = SecurityUtils.getSubject();
		// 创建登录令牌(用户名和密码)
		UsernamePasswordToken token = new UsernamePasswordToken(shopUserName, password);
		try {
			// 执行shiro框架的登录操作
			subject.login(token);
		} catch (UnknownAccountException e) {
			e.printStackTrace();
			return ResultVO.build(500, "用户不存在或商家为入驻");
		} catch (IncorrectCredentialsException e) {
			e.printStackTrace();
			return ResultVO.build(500, "密码不正确");
		}
		// 登陆成功登陆成功后 写入Session
		shopUser.setLastLoginTime(new Date());
		session.setAttribute("shopUser", shopUser);
		return ResultVO.ok();
	}

	/**
	 * 退出登陆
	 * x
	 * @return
	 */
	@RequestMapping("logout")
	public ResultVO logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {

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
	}

	/**
	 * 后台首页的登陆后的回显 leosam
	 * 
	 * @param session
	 * @return
	 */
	@RequestMapping("info")
	public ResultVO info(HttpSession session) {
		if (session.getAttribute("shopUser") == null) {
			return ResultVO.build(-1, "用户未登录");
		}
		TbShopUser user = (TbShopUser) session.getAttribute("shopUser");
		TbShopUser tUser = new TbShopUser();
		tUser.setShopId(user.getShopId());
		tUser.setShopUserName(user.getShopUserName());
		tUser.setLastLoginTime(user.getLastLoginTime());
		return ResultVO.build(200, "退出成功", tUser);
	}

}
