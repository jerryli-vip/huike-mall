package com.supergo.service;

import com.supergo.pojo.TbMember;
import com.supergo.utils.ResultVO;
/**
 * 设置之个人信息与安全管理
 * @author 范江浩
 *
 */
public interface TbMemberService {
	
	/**
	 * 个人设置之个人回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO queryInfo(TbMember member);
	/**
	 * 个人设置之个人信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO editInfo(TbMember member);
	/**
	 * 个人设置之修改密码信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO editPassword(TbMember member);
}
