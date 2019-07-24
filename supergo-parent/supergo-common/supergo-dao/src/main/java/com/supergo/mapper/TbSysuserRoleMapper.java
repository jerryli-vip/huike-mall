package com.supergo.mapper;

import com.supergo.pojo.TbSysuserRole;
import com.supergo.pojo.TbSysuserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysuserRoleMapper {
    int countByExample(TbSysuserRoleExample example);

    int deleteByExample(TbSysuserRoleExample example);

    int deleteByPrimaryKey(Integer sysuserRoleId);

    int insert(TbSysuserRole record);

    int insertSelective(TbSysuserRole record);

    List<TbSysuserRole> selectByExample(TbSysuserRoleExample example);

    TbSysuserRole selectByPrimaryKey(Integer sysuserRoleId);

    int updateByExampleSelective(@Param("record") TbSysuserRole record, @Param("example") TbSysuserRoleExample example);

    int updateByExample(@Param("record") TbSysuserRole record, @Param("example") TbSysuserRoleExample example);

    int updateByPrimaryKeySelective(TbSysuserRole record);

    int updateByPrimaryKey(TbSysuserRole record);
}