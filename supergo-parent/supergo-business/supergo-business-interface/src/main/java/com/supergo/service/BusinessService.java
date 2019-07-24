package com.supergo.service;

import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;

public interface BusinessService {
	
	/**
	 * 商家注册
	 * @param shopUserName
	 * @return
	 */
	
	String insert(TbBusiness tbBusiness, TbShop tbShop, TbShopUser tbShopUser);
	
	/**
	 * 根据店铺用户名称来获取用户信息，用来登陆
	 * @param shopUserName
	 * @return
	 */
	public TbShopUser selectByShopUserName(String shopUserName);
	/**
	 * 修改密码
	 * 
	 * @param newUser
	 * @return
	 */
	String updateByPassword(TbShopUser newUser);

	/**
	 * 修改资料
	 * 
	 * @param tbBusiness
	 * @return
	 */
	String updateData(TbBusiness tbBusiness);

	/**
	 * 回显
	 * 
	 * @param bussinessId
	 * @return
	 */
	TbBusiness selectById(Integer bussinessId);

	/**
	 * 查询商品Id
	 * 
	 * @param userId
	 * @return
	 */
	Integer selectBusinessId(Integer userId);


}
