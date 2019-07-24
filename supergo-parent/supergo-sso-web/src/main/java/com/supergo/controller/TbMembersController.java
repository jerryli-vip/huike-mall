package com.supergo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.service.SsoService;
import com.supergo.utils.CookieUtils;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("member")
public class TbMembersController {

	@Reference
	private SsoService service;

	@Resource(name = "jmsTemplate")
	private JmsTemplate jmsTemplate;

	@Resource(name = "queueDestination")
	private Destination destination;

	/**
	 * 短信验证码
	 * 
	 * @param mobile
	 * @return
	 */
	@RequestMapping("sendCode/{mobile}")
	public ResultVO sendCode(@PathVariable String mobile, HttpSession session) {

		if (mobile == null || mobile.length() != 11) {
			return ResultVO.build(-1, "请输入正确的手机号111");
		}
		// 短信模板和短信签名
		String smsTemplateCode = "SMS_135797105";
		String smsSignName = "猎豹云算力CTCM";

		// 生成验证码 并放入session
		String message = (long) (Math.random() * 1000000) + "";
		session.setAttribute("message", message);
		System.out.println("验证码：" + message);

		Map<String, String> map = new HashMap<String, String>();
		map.put("mobile", mobile);
		map.put("template_code", smsTemplateCode);
		map.put("sign_name", smsSignName);
		map.put("param", "{\"code\":\"" + message + "\"}");
		// 将目的地的数据发送给activeMQ-----》阿里云服务平台------》手机收到验证码
		this.jmsTemplate.convertAndSend(destination, map);

		return ResultVO.ok();

	}

	/**
	 * 注册
	 * 
	 * @param member
	 * @param smscode
	 * @param session
	 * @return
	 */
	@RequestMapping("register/{smscode}")
	public ResultVO register(@RequestBody(required = false) TbMember member, String smscode, HttpSession session) {
		if (session.getAttribute("message") != smscode) {
			ResultVO.build(-1, "验证码不正确,请重新输入");
		}
		// 清空session
		session.invalidate();
		try {
			// 记录注册时间
			member.setCreateTime(new Date());
			member.setUpdateTime(new Date());
			// 加密密码
			member.setPassword(DigestUtils.md5Hex(member.getPassword()));

			// 存入
			service.register(member);
			return ResultVO.build(200, "注册成功");
		} catch (Exception e) {

			e.printStackTrace();
			return ResultVO.build(-1, "注册失败");
		}
	}

	/**
	 * 登录
	 * 
	 * @param members
	 * @param session
	 * @return
	 */
	@RequestMapping("login")
	public ResultVO login(@RequestBody(required = false) TbMember member, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) {
		try {
			// 1.传入账户信息,进行登录
			TbMember members = service.checkLogin(member);
			if(members==null){
				return ResultVO.build(-1, "用户名不存在");
			}
			
			if (member == null) {
				return ResultVO.build(-1, "用户名或密码为空");
			}
			if (member.getPassword() == null) {
				return ResultVO.build(-1, "密码为空");
			}
			// 校验密码
			if (!DigestUtils.md5Hex(member.getPassword()).equals(members.getPassword())) {
				return ResultVO.build(-1, "密码错误");
			}
			// 2.登录成功，生成令牌
			String tokenId = UUID.randomUUID().toString();

			// 3.将用户信息放入redis，key为tokenId，value为member对象转成jession
			member.setPassword(null);
			service.saveRedis(tokenId, members);

			// 4.将tokenId，写入cookie
			Cookie cookie = new Cookie("tokenId", tokenId);

			// 可在同一应用服务器内共享方法
			cookie.setPath("/");
			// 在.supergo.com下的所有服务器下的文件都可以调用cookie.
			cookie.setDomain(".supergo.com");
			response.addCookie(cookie);

			// 5.将用户称放入session
			request.getSession().setAttribute("member", members);

		} catch (Exception e) {
			e.printStackTrace();
			return ResultVO.build(-1, "登陆失败");
		}
		return ResultVO.ok();
	}

	@RequestMapping("loginOut")
	public ResultVO loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		try {
			// 1.首先获取session中的用户登录信息
			TbMember member = (TbMember) request.getSession().getAttribute("member");
			
			// 2.如果用户session存在，则清空session
			if (member != null) {
				request.getSession().invalidate();
			}
			
			// 3.如果用户session中不存在,则获取cookie中的令牌tokenId
			Cookie[] cookies = request.getCookies();
			Cookie cookie = CookieUtils.getCookie(cookies, "tokenId");
			String tokenIdVal = cookie.getValue();

			// 4.如果cookie不为空，获取tokenId值,查询Redis中是否存在
			if (tokenIdVal == null || "".equals(tokenIdVal)) {
				// 取出Cookie中的tokenId
				ResultVO redisMember = service.getRedis(tokenIdVal);

				if (redisMember.getData() != null) {
					service.delRedis(tokenIdVal);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResultVO.build(-1, "退出异常");

	}

}