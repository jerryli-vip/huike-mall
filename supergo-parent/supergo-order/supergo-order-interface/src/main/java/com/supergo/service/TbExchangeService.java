package com.supergo.service;

import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbExchangeService {

	/**
	 * 按条件分页查询
	 */
	PageVO<TbExchangeGoodsExt> queryTbExchangeGoods(TbExchangeGoodsExt good, Integer page, Integer rows);

	/**
	 * 批量换货寄回
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO sendBack(String[] ids);

	/**
	 * 批量换货成功
	 */
	ResultVO exchangeSuccess(String[] ids);

	/**
	 * 批量换货取消
	 * 
	 */
	ResultVO exchangeCancel(String[] ids);

	/**
	 * 修改
	 */
	ResultVO exchangeUpdate(TbExchangeGoodsExt goods);
	/**
	 * 换货申请
	 * @param exchangeGoodsExt
	 * @return
	 */
	ResultVO updateExchange(TbExchangeGoodsExt exchangeGoodsExt);

}
