package com.supergo.mapper;

import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopMapper {
    int countByExample(TbShopExample example);

    int deleteByExample(TbShopExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(TbShop record);

    int insertSelective(TbShop record);

    List<TbShop> selectByExample(TbShopExample example);

    TbShop selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") TbShop record, @Param("example") TbShopExample example);

    int updateByExample(@Param("record") TbShop record, @Param("example") TbShopExample example);

    int updateByPrimaryKeySelective(TbShop record);

    int updateByPrimaryKey(TbShop record);
}