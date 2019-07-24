package com.supergo.service;

import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbMember;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbAddressService {

	/**
	 * 个人设置之地址分页查询信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO queryAddress(TbMember aMember);

	/**
	 * 个人设置之添加地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO insertAddress(TbAddress address, TbMember aMember);

	/**
	 * 个人设置之删除地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO deleteAddress(TbAddress address);

	/**
	 * 个人设置之修改地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO editAddress(TbAddress address);

	/**
	 * 根据会员id查询所属收货地址
	 * 
	 * @author 陈阳
	 */
	PageVO<TbAddress> queryAllAddress(Integer id);

	/**
	 * 个人设置之添加默认地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	ResultVO editDefault(TbAddress address);
}
