package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAddress;
import com.supergo.pojo.ext.Cart;
import com.supergo.utils.ResultVO;

public interface OrderService {
	
	/**
	 * 添加主订单数据
	 * 
	 * @author 陈阳
	 * @param orders 
	 * @param id 
	 * @param integer 
	 * */
	ResultVO addOrder(String string, List<Cart> orders, TbAddress address, String id, Integer integer);
	

	

}
