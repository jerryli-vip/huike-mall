package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.TbProduct;


public interface TbProductMapperExt {
	List<TbProduct> selectByProduct(TbProduct product);
	
	TbProduct selectByPrimaryKey(Integer productId);

	int insert(TbProduct record);
	
	List<TbProduct> selectProduct(TbProduct product);
}
