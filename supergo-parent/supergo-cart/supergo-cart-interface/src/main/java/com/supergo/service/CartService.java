package com.supergo.service;

import java.util.List;

import com.supergo.pojo.ext.Cart;
import com.supergo.utils.ResultVO;

public interface CartService {
	/**
	 * 添加购物车
	 * 
	 * @return
	 */
	List<Cart> addToCartList(List<Cart> cartlist, Integer goodsId, Integer quantity);
	/**
	 * 将购物车信息存入redis
	 * 
	 * @return
	 */
	void saveCartListToRedis(Integer memberId, List<Cart> cartList);
	/**
	 * 查找购物车列表
	 * 
	 * @return
	 */
	List<Cart> queryCartListFromRedis(Integer memberId);
	/**
	 * 修改商品数量
	 * 
	 * @return
	 */
	ResultVO editGoodsToQuantity(List<Cart> cartList, Integer goodsId, Integer quantity);
	/**
	 * 查删除选中商品信息
	 * 
	 * @return
	 */
	List<Cart> deleteByIds(List<Integer> ids,List<Cart> cartList);
	/**
	 * 合并购物车
	 * 
	 */
	void combineCartList(List<Cart> Cookiecartlist,Integer memberId);
	/**
	 * 将结算商品信息存入redis
	 * 
	 * @return
	 */
	ResultVO saveSettlementCartList(Integer memberId, List<Cart> cartlist);
	/**
	 * 获取结算商品信息
	 * 
	 * @return
	 */
	ResultVO getSettlementCartList(Integer memberId);
	/**
	 * 将结算商品信息再redis中清除
	 * 
	 * @return
	 */
	ResultVO cleanSettlementCartList(Integer memberId);
	
	/**
	 * 存储用户的订单号
	 * @author 陈阳
	 * */
	ResultVO saveOrderId (Integer memberId,String orderId);
	
	/**
	 * 获取存储用户的订单号
	 * @author 陈阳
	 * */
	ResultVO getOrderId(Integer memberId);
	
	

}
