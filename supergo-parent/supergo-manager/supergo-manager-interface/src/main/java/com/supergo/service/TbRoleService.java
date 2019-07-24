package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbRoleService {

	PageVO<TbRole> queryRole(Integer page, Integer rows, TbRole role);

	ResultVO insertRole(TbRole role);

	ResultVO updateRole(TbRole role);

	List<TbAuthority> queryAuthority(Integer type);

	ResultVO accredit(Integer[] ids, Integer roleId);

	List<TbAuthority> showAuthority(Integer roleId);

	ResultVO deleteManagerRole(Integer[] ids);

	List<TbRole> showParentRole(Integer type);

	Integer selectGradeByParentId(Integer parentId);

}
