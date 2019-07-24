package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.service.CheckImgService;
import com.supergo.utils.ResultVO;
/**
 * 设置之验证身份
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/check")
public class CheckImgController {

	@Reference
	private CheckImgService checkImgService;

	/**
	 * 个人设置之验证码信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/checkImg")
	public ResultVO checkImg(@RequestBody(required = false) String checkImg, HttpSession session) {
		try {
			String  checkCode = (String) session.getAttribute("checkCode");
			System.out.println("验证码"+checkCode);
			// if (attribute == null || "".equals(attribute)) {
			// return ResultVO.build(500, "没有数值");
			// }
			// System.out.println(attribute.toString());
			return checkImgService.checkImg(checkImg,checkCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultVO.build(500, "没有数值");

	}

}
