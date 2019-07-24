package com.supergo.service;

import com.supergo.pojo.ext.TbRefundExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbRefundService {
	/**
	 * 按条件分页查询
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	PageVO<TbRefundExt> queryTbRefund(TbRefundExt refund, Integer page, Integer rows);

	/**
	 * 修改退款处理中状态
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO refundBack(String[] ids);

	/**
	 * 修改退款成功状态
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO refundSuccess(String[] ids);

	/**
	 * 修改退款失败状态
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO refundFail(String[] ids);

	/**
	 * 修改退款取消状态
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO refundCancel(String[] ids);

}
