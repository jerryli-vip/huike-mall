package com.supergo.mapper;

import com.supergo.pojo.TbRoleAuthority;
import com.supergo.pojo.TbRoleAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleAuthorityMapper {
    int countByExample(TbRoleAuthorityExample example);

    int deleteByExample(TbRoleAuthorityExample example);

    int deleteByPrimaryKey(Integer roleAuthorityId);

    int insert(TbRoleAuthority record);

    int insertSelective(TbRoleAuthority record);

    List<TbRoleAuthority> selectByExample(TbRoleAuthorityExample example);

    TbRoleAuthority selectByPrimaryKey(Integer roleAuthorityId);

    int updateByExampleSelective(@Param("record") TbRoleAuthority record, @Param("example") TbRoleAuthorityExample example);

    int updateByExample(@Param("record") TbRoleAuthority record, @Param("example") TbRoleAuthorityExample example);

    int updateByPrimaryKeySelective(TbRoleAuthority record);

    int updateByPrimaryKey(TbRoleAuthority record);
}