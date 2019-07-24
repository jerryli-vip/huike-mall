package com.supergo.mapper;

import com.supergo.pojo.TbPvstatistics;
import com.supergo.pojo.TbPvstatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPvstatisticsMapper {
    int countByExample(TbPvstatisticsExample example);

    int deleteByExample(TbPvstatisticsExample example);

    int deleteByPrimaryKey(Integer pvstatisticsId);

    int insert(TbPvstatistics record);

    int insertSelective(TbPvstatistics record);

    List<TbPvstatistics> selectByExample(TbPvstatisticsExample example);

    TbPvstatistics selectByPrimaryKey(Integer pvstatisticsId);

    int updateByExampleSelective(@Param("record") TbPvstatistics record, @Param("example") TbPvstatisticsExample example);

    int updateByExample(@Param("record") TbPvstatistics record, @Param("example") TbPvstatisticsExample example);

    int updateByPrimaryKeySelective(TbPvstatistics record);

    int updateByPrimaryKey(TbPvstatistics record);
}