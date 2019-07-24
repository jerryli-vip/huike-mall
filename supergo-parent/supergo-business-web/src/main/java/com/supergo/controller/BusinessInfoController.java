package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShopUser;
import com.supergo.service.BusinessService;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("businessinfo")
public class BusinessInfoController {

	@Reference
	private BusinessService inforService;

	/**
	 * 修改密码
	 * 
	 * @param shopUserName
	 * @param shopUserPassword
	 * @param session
	 * @return
	 */
	@RequestMapping("updatepassword")
	public ResultVO updatepassword(String oldPassword, String newPassword, String confirmnewPassword,
			HttpSession session) {

		// 检验原密码 新密码和去人人新密码是否为空
		if (StringUtils.isEmpty(oldPassword) || StringUtils.isEmpty(newPassword)
				|| StringUtils.isEmpty(confirmnewPassword)) {
			return ResultVO.build(-1, "原密码或者新密码为空");
		}
		// 检验新密码两次输入是否一致
		if (!confirmnewPassword.equals(newPassword)) {
			return ResultVO.build(-1, "新密码两次输入不一致");
		}
		// 检验新旧密码是否输入一致
		if (newPassword.equals(oldPassword) && confirmnewPassword.equals(oldPassword)) {
			return ResultVO.build(-1, "新旧密码输入一致请重新输入新密码");
		}

		// 找到保存到session中的登录用户
		TbShopUser user = (TbShopUser) session.getAttribute("shopUser");
		if (!DigestUtils.md5Hex(oldPassword).equals(user.getShopUserPassword())) {
			return ResultVO.build(-1, "旧密码输入输入错误");
		}

		TbShopUser newUser = new TbShopUser();
		newUser.setShopId(user.getShopUserId());
		newUser.setShopUserPassword(DigestUtils.md5Hex(newPassword));
		
		

		String result =inforService.updateByPassword(newUser);
		if (result.equals("修改成功")) {
			return ResultVO.build(200, result);
		} else {
			return ResultVO.build(-1, result);
		}

		 
	}

	/**
	 * 资料回显
	 * 
	 * @param
	 * @param
	 * @param
	 * @return
	 */

	@RequestMapping("updatedata")
	public ResultVO updatedata( HttpSession session) {

		TbShopUser user = (TbShopUser) session.getAttribute("shopUser");

		if (!(user.getShopUserId() == null)) {

			Integer userId = user.getShopUserId();

			Integer bussinessId = inforService.selectBusinessId(userId);

			TbBusiness business = inforService.selectById(bussinessId);

			
			return ResultVO.build(200, "显示成功", business);
		}

	

		return ResultVO.build(-1, "显示失败");

	}
	/**
	 * 
	 * @param tbBusinesss
	 * @return
	 */
	@RequestMapping("edit")
	public ResultVO edit(@RequestBody(required = false) TbBusiness tbBusinesss) {
	
			String result = inforService.updateData(tbBusinesss);
			if (result.equals("修改成功")) {
				return ResultVO.build(200, result);
			} else {
				return ResultVO.build(-1, result);
			}

		
	}
}
