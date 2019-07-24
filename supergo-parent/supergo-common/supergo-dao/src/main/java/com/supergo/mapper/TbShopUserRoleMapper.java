package com.supergo.mapper;

import com.supergo.pojo.TbShopUserRoleExample;
import com.supergo.pojo.TbShopUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopUserRoleMapper {
    int countByExample(TbShopUserRoleExample example);

    int deleteByExample(TbShopUserRoleExample example);

    int deleteByPrimaryKey(TbShopUserRoleKey key);

    int insert(TbShopUserRoleKey record);

    int insertSelective(TbShopUserRoleKey record);

    List<TbShopUserRoleKey> selectByExample(TbShopUserRoleExample example);

    int updateByExampleSelective(@Param("record") TbShopUserRoleKey record, @Param("example") TbShopUserRoleExample example);

    int updateByExample(@Param("record") TbShopUserRoleKey record, @Param("example") TbShopUserRoleExample example);
}