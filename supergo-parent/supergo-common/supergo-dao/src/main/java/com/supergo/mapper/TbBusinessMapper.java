package com.supergo.mapper;

import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBusinessMapper {
    int countByExample(TbBusinessExample example);

    int deleteByExample(TbBusinessExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(TbBusiness record);

    int insertSelective(TbBusiness record);

    List<TbBusiness> selectByExample(TbBusinessExample example);

    TbBusiness selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") TbBusiness record, @Param("example") TbBusinessExample example);

    int updateByExample(@Param("record") TbBusiness record, @Param("example") TbBusinessExample example);

    int updateByPrimaryKeySelective(TbBusiness record);

    int updateByPrimaryKey(TbBusiness record);
}