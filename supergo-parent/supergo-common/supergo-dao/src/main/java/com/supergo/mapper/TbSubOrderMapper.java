package com.supergo.mapper;

import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.TbSubOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSubOrderMapper {
    int countByExample(TbSubOrderExample example);

    int deleteByExample(TbSubOrderExample example);

    int deleteByPrimaryKey(String ordersubId);

    int insert(TbSubOrder record);

    int insertSelective(TbSubOrder record);

    List<TbSubOrder> selectByExample(TbSubOrderExample example);

    TbSubOrder selectByPrimaryKey(String ordersubId);

    int updateByExampleSelective(@Param("record") TbSubOrder record, @Param("example") TbSubOrderExample example);

    int updateByExample(@Param("record") TbSubOrder record, @Param("example") TbSubOrderExample example);

    int updateByPrimaryKeySelective(TbSubOrder record);

    int updateByPrimaryKey(TbSubOrder record);

}