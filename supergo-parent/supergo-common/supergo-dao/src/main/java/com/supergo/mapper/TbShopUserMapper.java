package com.supergo.mapper;

import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.TbShopUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopUserMapper {
    int countByExample(TbShopUserExample example);

    int deleteByExample(TbShopUserExample example);

    int deleteByPrimaryKey(Integer shopUserId);

    int insert(TbShopUser record);

    int insertSelective(TbShopUser record);

    List<TbShopUser> selectByExample(TbShopUserExample example);

    TbShopUser selectByPrimaryKey(Integer shopUserId);

    int updateByExampleSelective(@Param("record") TbShopUser record, @Param("example") TbShopUserExample example);

    int updateByExample(@Param("record") TbShopUser record, @Param("example") TbShopUserExample example);

    int updateByPrimaryKeySelective(TbShopUser record);

    int updateByPrimaryKey(TbShopUser record);

}