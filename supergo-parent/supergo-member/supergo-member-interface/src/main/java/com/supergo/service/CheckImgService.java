package com.supergo.service;

import com.supergo.utils.ResultVO;

/**
 * 设置之验证身份
 * 
 * @author 范江浩
 *
 */
public interface CheckImgService {
	/**
	 * 个人设置之验证码信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	// ResultVO checkImg(String checkImg,String attribute);
	ResultVO checkImg(String checkImg, String checkCode);
}
