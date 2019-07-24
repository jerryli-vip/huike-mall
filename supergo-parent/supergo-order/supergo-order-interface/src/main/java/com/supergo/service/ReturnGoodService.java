package com.supergo.service;

import com.supergo.pojo.ext.TbReturnGoodsExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface ReturnGoodService {
	/**
	 * 
	 * 换货单分页查询
	 */
	PageVO<TbReturnGoodsExt> query(TbReturnGoodsExt returngoods, Integer page, Integer rows);

	/**
	 * 
	 * 批量修改状态-已确认待收货
	 */
	ResultVO updateReturn(String[] ids);

	/**
	 * 
	 * 批量修改状态-验货成功
	 */
	ResultVO updateSuccess(String[] ids);

	/**
	 * 
	 * 批量修改状态-退货成功
	 */
	ResultVO updateCancel(String[] ids);

	/**
	 * 
	 * 修改退货单状态
	 */
	ResultVO update(TbReturnGoodsExt returngoods);

	/**
	 * 
	 * 退货申请
	 */
	ResultVO updateRetuen(TbReturnGoodsExt returnGoods);
}
