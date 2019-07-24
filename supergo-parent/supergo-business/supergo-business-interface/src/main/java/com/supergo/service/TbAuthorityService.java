package com.supergo.service;

import java.util.List;
import com.supergo.pojo.TbAuthority;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbAuthorityService {

	PageVO<TbAuthority> queryUser(Integer page, Integer rows, TbAuthority authority);


	ResultVO insertAuthority(TbAuthority authority);


	ResultVO updateAuthority(TbAuthority authority);


	ResultVO deleteManagerAuthority(Integer[] ids);


	List<TbAuthority> queryParentAuthority(Integer type);

}
