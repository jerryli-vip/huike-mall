package com.supergo.mapper;

import com.supergo.pojo.TbPercentConversion;
import com.supergo.pojo.TbPercentConversionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPercentConversionMapper {
    int countByExample(TbPercentConversionExample example);

    int deleteByExample(TbPercentConversionExample example);

    int deleteByPrimaryKey(Integer percentConversionId);

    int insert(TbPercentConversion record);

    int insertSelective(TbPercentConversion record);

    List<TbPercentConversion> selectByExample(TbPercentConversionExample example);

    TbPercentConversion selectByPrimaryKey(Integer percentConversionId);

    int updateByExampleSelective(@Param("record") TbPercentConversion record, @Param("example") TbPercentConversionExample example);

    int updateByExample(@Param("record") TbPercentConversion record, @Param("example") TbPercentConversionExample example);

    int updateByPrimaryKeySelective(TbPercentConversion record);

    int updateByPrimaryKey(TbPercentConversion record);
}