package com.supergo.mapper.ext;

import java.util.ArrayList;
import java.util.List;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbRoleAuthority;

public interface TbRoleMapperExt {

	List<TbRole> queryRole(TbRole role);

	Integer insertRole(TbRole role);

	Integer updateRole(TbRole role);

	List<TbAuthority> queryAuthority(Integer type);

	void deleteAllAuthorityByRoleId(Integer roleId);

	void accreditRole(TbRoleAuthority tra);

	List<TbAuthority> showAuthority(Integer roleId);

	Integer batchManagerRole(ArrayList<Integer> list);

	List<TbRole> showParentRole(Integer type);

	Integer selectGradeByParentId(Integer parentId);

	Integer batchBusinessRole(ArrayList<Integer> list);

}
