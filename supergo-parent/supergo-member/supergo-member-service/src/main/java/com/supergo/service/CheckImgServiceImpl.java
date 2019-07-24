package com.supergo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.utils.ResultVO;

/**
 * 设置之验证身份
 * 
 * @author 范江浩
 *
 */
@Service
public class CheckImgServiceImpl implements CheckImgService {

	/**
	 * 个人设置之验证码信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	// public ResultVO checkImg(String checkImg, String attribute) {
	public ResultVO checkImg(String checkImg, String checkCode) {
		// TODO Auto-generated method stub
		if (checkImg == null || "".equals(checkImg)) {
			return ResultVO.build(500, "操作失败");
		}

		if (checkImg.equals(checkCode) == true) {
			return ResultVO.build(200, "验证成功");
		}
		return ResultVO.build(500, "操作失败");

	}

}
