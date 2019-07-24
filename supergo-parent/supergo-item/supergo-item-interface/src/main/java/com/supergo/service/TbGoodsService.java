package com.supergo.service;

import com.supergo.pojo.TbGoods;
import com.supergo.pojo.ext.GoodsVO;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbGoodsService {

	/**
	 * 按条件查询
	 * 
	 * @param page
	 * @param rows
	 * @param tbGoods
	 * @return
	 */
	PageVO<TbGoods> query(Integer page, Integer rows, TbGoods tbGoods);

	/**
	 * 按id进行批量删除
	 * 
	 * @param ids
	 * @return
	 */

	ResultVO deleteByIds(Integer[] ids);

	/**
	 * 上架
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO putOnSale(Integer[] ids);

	/**
	 * 下架
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO putOffSale(Integer[] ids);

	/**
	 * 批量修改库存
	 * 
	 * @param stocknum
	 * @param ids
	 * @return
	 */
	ResultVO updateStock(Integer stocknum, Integer[] ids);

	/**
	 * 批量修改价格
	 * 
	 * @param price
	 * @param ids
	 * @return
	 */
	ResultVO updatePrice(String price, Integer[] ids);

	/**
	 * 按商品更新数据
	 * 
	 * @param tbGoods
	 * @return
	 */
	ResultVO update(TbGoods tbGoods);

	/**
	 * 插入商品数据
	 * 
	 * @param vo
	 * @return
	 */
	ResultVO insert(GoodsVO vo);

}
