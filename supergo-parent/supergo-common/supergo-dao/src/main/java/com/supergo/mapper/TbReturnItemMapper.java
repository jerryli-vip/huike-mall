package com.supergo.mapper;

import com.supergo.pojo.TbReturnItem;
import com.supergo.pojo.TbReturnItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReturnItemMapper {
    int countByExample(TbReturnItemExample example);

    int deleteByExample(TbReturnItemExample example);

    int deleteByPrimaryKey(Integer returnItemId);

    int insert(TbReturnItem record);

    int insertSelective(TbReturnItem record);

    List<TbReturnItem> selectByExample(TbReturnItemExample example);

    TbReturnItem selectByPrimaryKey(Integer returnItemId);

    int updateByExampleSelective(@Param("record") TbReturnItem record, @Param("example") TbReturnItemExample example);

    int updateByExample(@Param("record") TbReturnItem record, @Param("example") TbReturnItemExample example);

    int updateByPrimaryKeySelective(TbReturnItem record);

    int updateByPrimaryKey(TbReturnItem record);

	TbReturnItem selectByGoodsId(int goodsId);
}