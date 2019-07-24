package com.supergo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbGoodsMapper;
import com.supergo.mapper.ext.TbImageExtMapper;
import com.supergo.pojo.TbGoods;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.ext.Cart;
import com.supergo.utils.ResultVO;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private TbGoodsMapper mapper;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Autowired
	private TbImageExtMapper Imgmapper;
	/**
	 * 添加购物车
	 * 
	 * @return
	 */
	@Override
	public List<Cart> addToCartList(List<Cart> cartlist, Integer goodsId, Integer quantity) {
		if (cartlist == null) {
			cartlist = new ArrayList<>();
		}
		// 根据ID 查找商品
		TbGoods goods = mapper.selectByPrimaryKey(goodsId);
		if (goods == null) {
			return null;// 输出 未找到该商品
		}
		if (goods.getStatus().equals("1") || goods.getStatus().equals("2")) {
			return null;// 输出 商品已下架或不存在
		}
		// 获取商家ID
		Integer shopId = goods.getShopId();

		// 判断购物车列表中是否存在该商家的购物车
		Cart cart = searchCartListByShopId(cartlist, shopId);
		// 如果购物车为空
		if (cart == null) {
			if (quantity < 0) {
				return null;// 输出 数量不正确 （判断库存）
			}
			cart = new Cart();
			cart.setShopId(shopId);// 商家ID
			cart.setShopNmae(goods.getShopName());// 商家名称
			List<TbOrderItem> orderItemList = new ArrayList<>();// 构建购物车明细
			TbOrderItem orderItem = createOrderItem(goods, quantity, goodsId);

			orderItemList.add(orderItem);// 将新建的购物车明细加入明细列表
			cart.setTbOrderItemlist(orderItemList);// 新建的明细列表加入购物车
			cartlist.add(cart);// 将新建的购物车加入购物车集合中

		} else {
			// 根据商品ID查询购物车明细
			TbOrderItem orderItem = searchOrderItemByItemId(cart.getTbOrderItemlist(), goodsId);
			if (orderItem == null) {// 如果没有该商品明细，新增明细
				if (quantity < 0) {
					return null;// 输出 数量不正确 （判断库存）
				}
				orderItem = createOrderItem(goods, quantity, goodsId);// 构建购物车明细
				cart.getTbOrderItemlist().add(orderItem);// 加入购物车集合
			} else {// 如果已有该商品明细
				orderItem.setQuantity(quantity + orderItem.getQuantity());// 将数量相加
				// 修改添加后的金额
				BigDecimal num = new BigDecimal(Double.toString(orderItem.getQuantity()));
				orderItem.setActualPayment(new BigDecimal(num.multiply(orderItem.getSellPrice()).doubleValue()));
				// 如果修改后的数量为0，删除该商品num.multiply(orderItem.getSellPrice()).doubleValue()
				if (orderItem.getQuantity() <= 0) {
					cart.getTbOrderItemlist().remove(orderItem);
				}
				// 如果修改后，该商家没有商品信息，，删除商家对应购物车对象
				if (cart.getTbOrderItemlist().size() == 0) {
					cartlist.remove(cart);
				}
			}
		}
		System.out.println(cartlist);
		return cartlist;
	}

	/**
	 * 根据商品的id在购物车明细列表中查询明细对象
	 * 
	 * @param orderItemList
	 *            购物车明细列表
	 * @param goodsId
	 *            SKU ID
	 * @return 购物车明细对象
	 */
	private TbOrderItem searchOrderItemByItemId(List<TbOrderItem> tbOrderItemlist, Integer goodsId) {
		for (TbOrderItem orderItem : tbOrderItemlist) {
			if (orderItem.getGoodsId().intValue() == goodsId.intValue()) {
				return orderItem;
			}
		}
		return null;
	}

	/**
	 * 根据SKU构建新的购物车明细对象
	 * 
	 * @param goods
	 * @param num
	 * @return
	 */
	private TbOrderItem createOrderItem(TbGoods goods, Integer quantity, Integer goodsId) {
		TbOrderItem orderItem = new TbOrderItem();
		orderItem.setGoodsId(goods.getGoodsId());// 商品ID
		orderItem.setGoodsName(goods.getGoodsName());// 商品名称
		orderItem.setSellPrice(goods.getSellPrice());// 商品售价
		orderItem.setQuantity(quantity);// 商品数量
		orderItem.setActualPayment(new BigDecimal(goods.getSellPrice().doubleValue() * quantity));// 实际支付
		// 商品图片
		String tbimage = Imgmapper.selectImgByGoodsId(goodsId);
		orderItem.setBak2(tbimage);
		return orderItem;
	}

	/**
	 * 在购物车列表中根据商家ID查询购物车对象
	 * 
	 * @param cartList
	 * @param shopId
	 * @return
	 */
	private Cart searchCartListByShopId(List<Cart> cartList, Integer shopId) {
		for (Cart cart : cartList) {
			if (cart.getShopId().equals(shopId)) {
				return cart;
			}
		}
		return null;
	}
	/**
	 * 将购物车信息信息存入redis
	 * 
	 * @return
	 */
	@Override
	public void saveCartListToRedis(Integer memberId, List<Cart> cartList) {
		redisTemplate.boundHashOps("cartList").put(memberId, cartList);
	}
	/**
	 * 从redis中获取购物车信息
	 * 
	 * @return
	 */
	@Override
	public List<Cart> queryCartListFromRedis(Integer memberId) {
		List<Cart> cartList = (List<Cart>) redisTemplate.boundHashOps("cartList").get(memberId);
		if (cartList == null) {
			cartList = new ArrayList<Cart>();
		}
		return cartList;
	}
	/**
	 * 修改商品数量
	 * 
	 * @return
	 */
	@Override
	public ResultVO editGoodsToQuantity(List<Cart> cartList, Integer goodsId, Integer quantity) {
		if (cartList == null) {
			return ResultVO.build(-1, "没有购物车信息", null);
		}
		// 根据ID 查找商品
		TbGoods goods = mapper.selectByPrimaryKey(goodsId);
		if (goods == null) {
			return ResultVO.build(-1, "商品信息有误", null);
		}
		Integer shopId = goods.getShopId();

		Cart cart = searchCartListByShopId(cartList, shopId);
		// 如果购物车为空
		if (cart == null) {
			return ResultVO.build(-1, "没找到相关购物车信息", null);
		} else {
			// 根据商品ID查询购物车明细
			TbOrderItem orderItem = searchOrderItemByItemId(cart.getTbOrderItemlist(), goodsId);
			if (orderItem == null) {// 如果没有该商品明细，新增明细
				return ResultVO.build(-1, "没找到相关商家信息", null);
			} else {// 如果已有该商品明细
				orderItem.setQuantity(quantity);
				System.out.println(quantity);
				System.out.println(orderItem.getQuantity());
				// 修改添加后的金额
				BigDecimal num = new BigDecimal(Double.toString(orderItem.getQuantity()));
				orderItem.setActualPayment(new BigDecimal(num.multiply(orderItem.getSellPrice()).doubleValue()));
				// 如果修改后的数量为0，删除该商品
				// num.multiply(orderItem.getSellPrice()).doubleValue()
				if (orderItem.getQuantity() <= 0) {
					cart.getTbOrderItemlist().remove(orderItem);
				}
				// 如果修改后，该商家没有商品信息，，删除商家对应购物车对象
				if (cart.getTbOrderItemlist().size() == 0) {
					cartList.remove(cart);
				}
			}
		}
		return ResultVO.build(200, "商品信息有误", cartList);
	}
	/**
	 * 删除被选中的商品
	 * 
	 * @return
	 */
	@Override
	public List<Cart> deleteByIds(List<Integer> ids, List<Cart> cartList) {
		if (ids == null || ids.size() <= 0) {
			return null;
		}
		if (cartList == null) {
			return null;
		}

		cartList = deleteGoods(cartList, ids);
		if (cartList == null) {
			return null;
		}
		return cartList;
	}
	/**
	 * 遍历删除所有被选中的商品及店铺
	 * 
	 * @return
	 */
	private List<Cart> deleteGoods(List<Cart> cartList, List<Integer> ids) {
		for (Integer id : ids) {
			// 根据ID 查找商品
			TbGoods goods = mapper.selectByPrimaryKey(id);
			if (goods == null) {
				return null;// 输出 未找到该商品
			}
			if (goods.getStatus().equals("1") || goods.getStatus().equals("2")) {
				return null;// 输出 商品已下架或不存在
			}
			// 获取商家ID
			Integer shopId = goods.getShopId();

			// 判断购物车列表中是否存在该商家的购物车
			Cart cart = searchCartListByShopId(cartList, shopId);
			if (cart != null && cart.getTbOrderItemlist() != null) {

				TbOrderItem orderItem = searchOrderItemByItemId(cart.getTbOrderItemlist(), id);

				cart.getTbOrderItemlist().remove(orderItem);

				if (cart.getTbOrderItemlist().size() == 0) {
					cartList.remove(cart);
				}
			}
		}
		return cartList;
	}
	/**
	 * 合并购物车
	 * 
	 * @return
	 */
	@Override
	public void combineCartList(List<Cart> Cookiecartlist, Integer memberId) {
		if (Cookiecartlist != null && memberId != null && memberId > 0) {
			// 获取redis里的购物车信息
			List<Cart> redisCartList = (List<Cart>) redisTemplate.boundHashOps("cartList").get(memberId);
			// 合并购物车
			if (redisCartList == null) {
				redisCartList = new ArrayList<Cart>();
			}
			redisCartList.addAll(Cookiecartlist);
			// 将合并后的购物车存入Redis
			saveCartListToRedis(memberId, redisCartList);
		}
	}
	/**
	 * 将结算商品信息存入redis
	 * 
	 * @return
	 */
	@Override
	public ResultVO saveSettlementCartList(Integer memberId, List<Cart> cartlist) {
		redisTemplate.boundHashOps("SettlementCartList").put(memberId, cartlist);
		System.out.println("已存入redis");
		return ResultVO.build(200, "添加成功", cartlist);
	}
	/**
	 * 将结算商品信息在redis中取出
	 * 
	 * @return
	 */
	@Override
	public ResultVO getSettlementCartList(Integer memberId) {
		List<Cart> SettlementCartList = (List<Cart>) redisTemplate.boundHashOps("SettlementCartList").get(memberId);
		if (SettlementCartList == null || SettlementCartList.isEmpty()) {
			return ResultVO.build(-1, "查询失败", null);
		}
		return ResultVO.build(200, "查询成功", SettlementCartList);
	}
	/**
	 * 清除redis中的商品信息
	 * 
	 * @return
	 */
	@Override
	public ResultVO cleanSettlementCartList(Integer memberId) {
		Long result = redisTemplate.boundHashOps("SettlementCartList").delete(memberId);
		if (result > 0) {
			return ResultVO.build(200, "清除成功");
		} else {
			return ResultVO.build(-1, "清除失败");
		}
	}

	
	
	/**
	 * 存储用户的订单号
	 * @author 陈阳
	 * */
	@Override
	public ResultVO saveOrderId(Integer memberId, String orderId) {
		// TODO Auto-generated method stub
		redisTemplate.boundHashOps("orderId").put(memberId, orderId);
		System.out.println("已存入redis");
		return ResultVO.build(200, "添加成功");
	
	}

	
	
	/**
	 * 获取存储用户的订单号
	 * @author 陈阳
	 * */
	@Override
	public ResultVO getOrderId(Integer memberId) {
		// TODO Auto-generated method stub
		String orderId=(String) redisTemplate.boundHashOps("orderId").get(memberId);
		if(orderId!=null&&orderId.length()>0){
			return ResultVO.build(200, "查询成功",orderId);
		}else{
		return ResultVO.build(500, "未查询到该顾客的订单号");
		}
	}
}
