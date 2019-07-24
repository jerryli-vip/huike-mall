package com.supergo.service;

import java.util.List;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbSysuser;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;
public interface TbUserService {

	ResultVO insertUser(TbSysuser sysuser);

	ResultVO delete(Integer[] ids);

	ResultVO resetPassword(Integer[] ids);

	ResultVO updateById(TbSysuser sysuser);

	List<TbRole> queryRole(Integer type);

	PageVO<TbSysuser> queryUser(Integer page, Integer rows, TbSysuser sysuser);

	ResultVO accredit(Integer[] roleIds, Integer userId);

	List<TbRole> showRole(Integer userId);

	TbSysuser selectUserByUserName(String username);

	List<TbAuthority> queryAuthorityCode(String userName);
}
