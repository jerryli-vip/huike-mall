package com.supergo.mapper;

import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.TbSysuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysuserMapper {
    int countByExample(TbSysuserExample example);

    int deleteByExample(TbSysuserExample example);

    int deleteByPrimaryKey(Integer sysuserId);

    int insert(TbSysuser record);

    int insertSelective(TbSysuser record);

    List<TbSysuser> selectByExample(TbSysuserExample example);

    TbSysuser selectByPrimaryKey(Integer sysuserId);

    int updateByExampleSelective(@Param("record") TbSysuser record, @Param("example") TbSysuserExample example);

    int updateByExample(@Param("record") TbSysuser record, @Param("example") TbSysuserExample example);

    int updateByPrimaryKeySelective(TbSysuser record);

    int updateByPrimaryKey(TbSysuser record);
}