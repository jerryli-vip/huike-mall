package com.supergo.mapper;

import com.supergo.pojo.TbRefund;
import com.supergo.pojo.TbRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRefundMapper {
    int countByExample(TbRefundExample example);

    int deleteByExample(TbRefundExample example);

    int deleteByPrimaryKey(String refundId);

    int insert(TbRefund record);

    int insertSelective(TbRefund record);

    List<TbRefund> selectByExample(TbRefundExample example);

    TbRefund selectByPrimaryKey(String refundId);

    int updateByExampleSelective(@Param("record") TbRefund record, @Param("example") TbRefundExample example);

    int updateByExample(@Param("record") TbRefund record, @Param("example") TbRefundExample example);

    int updateByPrimaryKeySelective(TbRefund record);

    int updateByPrimaryKey(TbRefund record);
}