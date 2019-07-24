package com.supergo.mapper.ext;

import java.util.ArrayList;
import java.util.List;

import com.supergo.pojo.TbAuthority;

public interface TbAuthorityMapperExt {

	List<TbAuthority> queryAuthority(TbAuthority authority);

	Integer insertAuthority(TbAuthority authority);

	Integer updateAuthority(TbAuthority authority);

	Integer batchManagerDelete(ArrayList<Integer> list);

	List<TbAuthority> queryParentAuthority(Integer type);

	Integer selectGradeByParentId(Integer parentId);

}
