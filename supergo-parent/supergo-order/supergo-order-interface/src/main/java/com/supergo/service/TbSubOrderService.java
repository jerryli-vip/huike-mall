package com.supergo.service;

import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbSubOrderExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 子订单查询
 * 
 * @author leosam
 *
 */
public interface TbSubOrderService {

	/**
	 * 分页查询子订单
	 * 
	 * @param page
	 * @param rows
	 * @param tbSubOrder
	 * @return
	 */
	public PageVO<TbSubOrderExt> query(Integer page, Integer rows, TbSubOrder tbSubOrder);

	/**
	 * 查询订单详细信息
	 * 
	 * @param id
	 * @param tbSubOrder
	 * @return
	 */
	public ResultVO orderDetail(String id, TbSubOrder tbSubOrder);

}
