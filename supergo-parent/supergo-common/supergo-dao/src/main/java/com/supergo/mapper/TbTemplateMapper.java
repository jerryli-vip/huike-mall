package com.supergo.mapper;

import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.TbTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTemplateMapper {
    int countByExample(TbTemplateExample example);

    int deleteByExample(TbTemplateExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(TbTemplate record);

    int insertSelective(TbTemplate record);

    List<TbTemplate> selectByExample(TbTemplateExample example);

    TbTemplate selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") TbTemplate record, @Param("example") TbTemplateExample example);

    int updateByExample(@Param("record") TbTemplate record, @Param("example") TbTemplateExample example);

    int updateByPrimaryKeySelective(TbTemplate record);

    int updateByPrimaryKey(TbTemplate record);
}