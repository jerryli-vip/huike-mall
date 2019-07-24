package com.supergo.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbGoodsMapper;
import com.supergo.mapper.TbOrderItemMapper;
import com.supergo.mapper.TbOrderMapper;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbGoods;
import com.supergo.pojo.TbGoodsExample;
import com.supergo.pojo.TbOrder;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.Cart;
import com.supergo.utils.ResultVO;


/**
 * 主订单业务实现类
 * 
 * @author 陈阳
 * */

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private TbOrderMapper orderMapper;
	
	@Autowired
	private TbOrderItemMapper orderItemMapper;
	
	@Autowired
	private TbSubOrderMapper subOrderMapper;
	
	@Autowired
	private TbGoodsMapper goodMapper;
	

	
	/**
	 * 添加主订单、子订单信息
	 * 
	 * @author 陈阳
	 * 
	 * */
	
	@Override
	public ResultVO addOrder(String string,List<Cart> orders, TbAddress tbAddress,String id,Integer tbMemberId) {
		// TODO Auto-generated method stub
		
	
			try {
				//新建TbOrder对象
				TbOrder order = new TbOrder();
				
				//设置主订单id属性
				order.setOrderId(id);
				
				//拼接地址
				String address = tbAddress.getProvince()+tbAddress.getCity()+tbAddress.getArea();
				//设置收货地址
				order.setAddress(address);
				//设置创建时间
				order.setCrateTime(new Date());
				//设置总价格
				Double totalMoney = 0.00;
				for (Cart cart : orders) {
					//遍历子订单
					for (TbOrderItem tbOrderItem : cart.getTbOrderItemlist()) {
						//金额累加
						 totalMoney += tbOrderItem.getActualPayment().doubleValue();
					}
				}
				//总价格
				BigDecimal money = new BigDecimal(totalMoney);
				order.setTotalmoney(money);
				
				//设置会员id 
				order.setMemberId(tbMemberId);
				
				orderMapper.insert(order);
				
				
				//添加子订单
				//设置发货状态
				for (Cart cart : orders) {
					//遍历子订单
					for(TbOrderItem orderItem : cart.getTbOrderItemlist()){
						//根据商品id查询商品规格
						TbGoodsExample goodsExample = new TbGoodsExample();
						com.supergo.pojo.TbGoodsExample.Criteria criteria = goodsExample.createCriteria();
						criteria.andGoodsIdEqualTo(orderItem.getGoodsId());
						List<TbGoods> goods = goodMapper.selectByExample(goodsExample);
						if(goods==null||goods.size()<1){
							return ResultVO.build(500, "没有id="+orderItem.getGoodsId()+"的商品");
						}
						for (TbGoods tbGoods : goods) {
							//设置商品规格
							orderItem.setGoodsType(tbGoods.getSpecInfo());
						}
						//设置是否优惠
						orderItem.setDiscount("N");
						//设置支付状态
						if(string.equals("1")){
							orderItem.setPayStatus("1");
							
						}else{
						//设置支付状态未支付
							orderItem.setPayStatus("2");
						
						}
						//设置发货状态
						orderItem.setItemStatus("1");
						//设置创建时间
						orderItem.setCreateTime(new Date());
						//设置创建人
						orderItem.setCreateId(tbMemberId);
						//调用dao层方法执行插入操作
						orderItemMapper.insert(orderItem);

					}
					
				}
				
				
				//添加商家子订单
				for(Cart cart : orders){
					
					for(TbOrderItem orderItem : cart.getTbOrderItemlist()){
						
						TbSubOrder subOrder = new TbSubOrder();
						//设置子订单id
						subOrder.setOrdersubId(orderItem.getOrdersubId());
						//设置主订单id
						subOrder.setOrderId(id);
						//设置店铺id
						subOrder.setShopId(cart.getShopId().toString());
						//设置店铺名称
						subOrder.setShopName(cart.getShopNmae());
						//设置会员id
						subOrder.setMemberId(tbMemberId);
						//设置店铺名称
						subOrder.setShopName(cart.getShopNmae());
						//设置订单创建时间
						subOrder.setCreateTime(orderItem.getCreateTime());
						//设置支付时间
						subOrder.setPayTime(new Date());
						//设置运费
						BigDecimal bd = new BigDecimal(0.00);
						subOrder.setExpressfee(bd);
						//设置支付总金额
						subOrder.setPaymoney(money);
						//设置收货地址
						subOrder.setAddress(address);
						//设置支付方式
						subOrder.setPayModel(string);
						if(string.equals("1")){
							subOrder.setPayStatus("0");
							subOrder.setOrderStatus("3");
						}else{
						//设置支付状态未支付
						subOrder.setPayStatus("3");
						subOrder.setOrderStatus("0");
						}
						
						//执行插入语句
						subOrderMapper.insert(subOrder);
						
					}

				}
				
				
				
				return ResultVO.build(200,"购买成功");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ResultVO.build(500, "购买失败");
			}
		
		
	}
	


	
	
}
