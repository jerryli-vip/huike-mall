package com.supergo.mapper;

import com.supergo.pojo.TbAdCategory;
import com.supergo.pojo.TbAdCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdCategoryMapper {
    int countByExample(TbAdCategoryExample example);

    int deleteByExample(TbAdCategoryExample example);

    int deleteByPrimaryKey(Integer adCategoryId);

    int insert(TbAdCategory record);

    int insertSelective(TbAdCategory record);

    List<TbAdCategory> selectByExample(TbAdCategoryExample example);

    TbAdCategory selectByPrimaryKey(Integer adCategoryId);

    int updateByExampleSelective(@Param("record") TbAdCategory record, @Param("example") TbAdCategoryExample example);

    int updateByExample(@Param("record") TbAdCategory record, @Param("example") TbAdCategoryExample example);

    int updateByPrimaryKeySelective(TbAdCategory record);

    int updateByPrimaryKey(TbAdCategory record);
}