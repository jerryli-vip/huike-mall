package com.supergo.mapper;

import com.supergo.pojo.TbImage;
import com.supergo.pojo.TbImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbImageMapper {
    int countByExample(TbImageExample example);

    int deleteByExample(TbImageExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(TbImage record);

    int insertSelective(TbImage record);

    List<TbImage> selectByExample(TbImageExample example);

    TbImage selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") TbImage record, @Param("example") TbImageExample example);

    int updateByExample(@Param("record") TbImage record, @Param("example") TbImageExample example);

    int updateByPrimaryKeySelective(TbImage record);

    int updateByPrimaryKey(TbImage record);
}