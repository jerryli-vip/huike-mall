package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.ext.OrderListExt;


public interface DetailExtMapper {
	
	List<OrderListExt>  selectById(String ordersubId);
	
	OrderListExt  selectDeliveryById(String ordersubId);
	
	List<OrderListExt>  selectGoodsListById(String ordersubId);

	List<OrderListExt> selectItemListById(String ordersubId);
	
}
