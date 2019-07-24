package com.supergo.mapper;

import com.supergo.pojo.TdFootmark;
import com.supergo.pojo.TdFootmarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdFootmarkMapper {
    int countByExample(TdFootmarkExample example);

    int deleteByExample(TdFootmarkExample example);

    int deleteByPrimaryKey(Integer footmarkId);

    int insert(TdFootmark record);

    int insertSelective(TdFootmark record);

    List<TdFootmark> selectByExample(TdFootmarkExample example);

    TdFootmark selectByPrimaryKey(Integer footmarkId);

    int updateByExampleSelective(@Param("record") TdFootmark record, @Param("example") TdFootmarkExample example);

    int updateByExample(@Param("record") TdFootmark record, @Param("example") TdFootmarkExample example);

    int updateByPrimaryKeySelective(TdFootmark record);

    int updateByPrimaryKey(TdFootmark record);
}