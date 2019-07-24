package com.supergo.mapper;

import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMemberMapper {
    int countByExample(TbMemberExample example);

    int deleteByExample(TbMemberExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(TbMember record);

    int insertSelective(TbMember record);

    List<TbMember> selectByExample(TbMemberExample example);

    TbMember selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") TbMember record, @Param("example") TbMemberExample example);

    int updateByExample(@Param("record") TbMember record, @Param("example") TbMemberExample example);

    int updateByPrimaryKeySelective(TbMember record);

    int updateByPrimaryKey(TbMember record);
}