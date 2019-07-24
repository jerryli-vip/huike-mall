package com.supergo.mapper;

import com.supergo.pojo.TbProductAuditing;
import com.supergo.pojo.TbProductAuditingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductAuditingMapper {
    int countByExample(TbProductAuditingExample example);

    int deleteByExample(TbProductAuditingExample example);

    int deleteByPrimaryKey(Integer productAuditingId);

    int insert(TbProductAuditing record);

    int insertSelective(TbProductAuditing record);

    List<TbProductAuditing> selectByExample(TbProductAuditingExample example);

    TbProductAuditing selectByPrimaryKey(Integer productAuditingId);

    int updateByExampleSelective(@Param("record") TbProductAuditing record, @Param("example") TbProductAuditingExample example);

    int updateByExample(@Param("record") TbProductAuditing record, @Param("example") TbProductAuditingExample example);

    int updateByPrimaryKeySelective(TbProductAuditing record);

    int updateByPrimaryKey(TbProductAuditing record);
}