package com.supergo.mapper.ext;

import java.util.ArrayList;
import java.util.List;

import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.TbSysuserRole;
import com.supergo.pojo.ext.TbRoleExt;

public interface TbSysuserMapperExt {

	Integer resetPassword(ArrayList<Integer> list);

	Integer batchdelete(ArrayList<Integer> list);

	Integer insertUser(TbSysuser user);

	Long selectByUsername(String userName);

	Integer updateUser(TbSysuser sysuser);

	List<TbSysuser> queryAllUser(TbSysuser sysuser);

	List<TbRoleExt> queryRoleByParentId(Integer roleId);

	List<TbRole> queryRole(Integer type);

	void deleteAllRoleByUserId(Integer userId);

	void accreditUser(TbSysuserRole tsr);

	List<TbRole> showRole(Integer userId);

	TbSysuser selectUserByUserName(String username);

	List<TbAuthority> queryAuthorityCode(String userName);

}