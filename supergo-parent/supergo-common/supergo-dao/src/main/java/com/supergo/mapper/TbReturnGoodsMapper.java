package com.supergo.mapper;

import com.supergo.pojo.TbReturnGoods;
import com.supergo.pojo.TbReturnGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReturnGoodsMapper {
    int countByExample(TbReturnGoodsExample example);

    int deleteByExample(TbReturnGoodsExample example);

    int deleteByPrimaryKey(Integer returnGoodsId);

    int insert(TbReturnGoods record);

    int insertSelective(TbReturnGoods record);

    List<TbReturnGoods> selectByExample(TbReturnGoodsExample example);

    TbReturnGoods selectByPrimaryKey(Integer returnGoodsId);

    int updateByExampleSelective(@Param("record") TbReturnGoods record, @Param("example") TbReturnGoodsExample example);

    int updateByExample(@Param("record") TbReturnGoods record, @Param("example") TbReturnGoodsExample example);

    int updateByPrimaryKeySelective(TbReturnGoods record);

    int updateByPrimaryKey(TbReturnGoods record);

}