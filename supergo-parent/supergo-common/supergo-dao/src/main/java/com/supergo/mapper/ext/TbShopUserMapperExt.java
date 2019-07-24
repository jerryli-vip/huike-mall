package com.supergo.mapper.ext;

import java.util.ArrayList;
import java.util.List;

import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.TbShopUserRole;

public interface TbShopUserMapperExt {

	List<TbShop> queryAllShopUser(TbShop shopuser);

	Long selectByUsername(String shopUserName);

	Integer insertUser(TbShopUser user);

	List<TbShopUser> queryAllUser(TbShopUser shopUser);

	Integer batchdelete(ArrayList<Integer> list);

	Integer resetPassword(ArrayList<Integer> list);

	Integer updateUser(TbShopUser shopUser);

	List<TbRole> queryRole(Integer type);

	void deleteAllRoleByUserId(Integer userId);

	void accreditUser(TbShopUserRole tsr);

	List<TbRole> showRole(Integer userId);

	List<TbAuthority> queryAuthorityCode(String shopUserName);

}
