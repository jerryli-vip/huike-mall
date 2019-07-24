package com.supergo.mapper;

import com.supergo.pojo.TbSpec;
import com.supergo.pojo.TbSpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecMapper {
    int countByExample(TbSpecExample example);

    int deleteByExample(TbSpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(TbSpec record);

    int insertSelective(TbSpec record);

    List<TbSpec> selectByExample(TbSpecExample example);

    TbSpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") TbSpec record, @Param("example") TbSpecExample example);

    int updateByExample(@Param("record") TbSpec record, @Param("example") TbSpecExample example);

    int updateByPrimaryKeySelective(TbSpec record);

    int updateByPrimaryKey(TbSpec record);

	int selectInsertId(TbSpec spec);
}