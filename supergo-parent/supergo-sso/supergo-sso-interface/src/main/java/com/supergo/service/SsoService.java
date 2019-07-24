package com.supergo.service;

import com.supergo.pojo.TbMember;
import com.supergo.utils.ResultVO;

public interface SsoService {
	/**
	 * 注册用户
	 * @param member
	 */
	void register(TbMember member);
	/**
	 * 用户登录
	 * @param password 
	 * @param memberName 
	 * @param members
	 * @return
	 */

	TbMember checkLogin(TbMember member);
	/**
	 * 存入登录信息到redis
	 * @param tokenId
	 * @param members
	 */
	void saveRedis(String tokenId, TbMember members);
	/**
	 * 获取存入redis的用户信息
	 * @param tokenId
	 * @return
	 */
	ResultVO getRedis(String tokenId);
	/**
	 * 删除redis中用户信息
	 * @param tokenIdVal
	 * @return
	 */
	void delRedis(String tokenIdVal);
	
	
}
