package com.supergo.mapper;

import com.supergo.pojo.TbExchangeGoods;
import com.supergo.pojo.TbExchangeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExchangeGoodsMapper {
    int countByExample(TbExchangeGoodsExample example);

    int deleteByExample(TbExchangeGoodsExample example);

    int deleteByPrimaryKey(Integer exchangeGoodsId);

    int insert(TbExchangeGoods record);

    int insertSelective(TbExchangeGoods record);

    List<TbExchangeGoods> selectByExample(TbExchangeGoodsExample example);

    TbExchangeGoods selectByPrimaryKey(Integer exchangeGoodsId);

    int updateByExampleSelective(@Param("record") TbExchangeGoods record, @Param("example") TbExchangeGoodsExample example);

    int updateByExample(@Param("record") TbExchangeGoods record, @Param("example") TbExchangeGoodsExample example);

    int updateByPrimaryKeySelective(TbExchangeGoods record);

    int updateByPrimaryKey(TbExchangeGoods record);
}