package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbShopUser;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbShopUserService {

	/**
	 * 根据店铺用户名称来获取用户信息，用来登陆
	 * 
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
	Integer updateByPassword(TbShopUser newUser);

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

	ResultVO insertUser(TbShopUser shopUser);

	PageVO<TbShopUser> queryUser(Integer page, Integer rows, TbShopUser shopUser);

	ResultVO updateById(TbShopUser shopUser);

	ResultVO delete(Integer[] ids);

	ResultVO resetPassword(Integer[] ids);

	List<TbRole> queryRole(Integer type);

	ResultVO accredit(Integer[] roleIds, Integer userId);

	List<TbRole> showRole(Integer userId);

	List<TbAuthority> queryAuthorityCode(String shopUserName);

}
