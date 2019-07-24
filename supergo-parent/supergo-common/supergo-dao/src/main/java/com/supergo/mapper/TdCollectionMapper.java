package com.supergo.mapper;

import com.supergo.pojo.TdCollection;
import com.supergo.pojo.TdCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdCollectionMapper {
    int countByExample(TdCollectionExample example);

    int deleteByExample(TdCollectionExample example);

    int deleteByPrimaryKey(Integer collectionId);

    int insert(TdCollection record);

    int insertSelective(TdCollection record);

    List<TdCollection> selectByExample(TdCollectionExample example);

    TdCollection selectByPrimaryKey(Integer collectionId);

    int updateByExampleSelective(@Param("record") TdCollection record, @Param("example") TdCollectionExample example);

    int updateByExample(@Param("record") TdCollection record, @Param("example") TdCollectionExample example);

    int updateByPrimaryKeySelective(TdCollection record);

    int updateByPrimaryKey(TdCollection record);
}