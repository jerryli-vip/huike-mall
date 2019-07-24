package com.kkb.seckill.server.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkb.seckill.entity.OrderInfo;
import com.kkb.seckill.entity.SeckillOrder;
import com.kkb.seckill.mapper.OrderMapper;
import com.kkb.seckill.redis.OrderKey;
import com.kkb.seckill.redis.RedisService;
import com.kkb.seckill.redis.SeckillKey;
import com.kkb.seckill.server.IGoodsService;
import com.kkb.seckill.server.IOrderService;
import com.kkb.seckill.vo.GoodsVo;

@Service("orderServiceImpl")
public class OrderServiceImpl implements IOrderService{
	 @Autowired
    OrderMapper orderMapper;

    @Autowired
    RedisService redisService;
    
    @Autowired
    IGoodsService goodsService;
	/**
     * 获取秒杀状态
     */
    public long getSeckillResult(String userId, Long goodsId){
        SeckillOrder order = redisService.get(OrderKey.getSeckillOrderByUidGid, "" + userId + "_" + goodsId, SeckillOrder.class);
        if (order != null){
            return order.getOrderId();
        }else{
            boolean isOver = getGoodsOver(goodsId);
            if(isOver) {
                return -1;
            }else {
                return 0;
            }
        }
    }
    
    private void setGoodsOver(Long goodsId) {
        redisService.set(SeckillKey.isGoodsOver, ""+goodsId, true);
    }

    private boolean getGoodsOver(long goodsId) {
        return redisService.exists(SeckillKey.isGoodsOver, ""+goodsId);
    }
    
    //保证这三个操作，减库存 下订单 写入秒杀订单是一个事物
    @Transactional
    public OrderInfo seckill(String uid, GoodsVo goods){
        /**
         * 数据库真实减库存
         */
        boolean success = goodsService.reduceStock(goods);
        if (success){
            /**
             * 生成订单
             * 里边的两步，订单主表和秒杀表也需要事务
             */
            return createOrder(uid, goods);
        }else {
            setGoodsOver(goods.getId());
            return null;
        }
    }
    public OrderInfo getOrderById(long orderId) {
        return orderMapper.getOrderById(orderId);
    }

    /**
     * 因为要同时分别在订单详情表和秒杀订单表都新增一条数据，所以要保证两个操作是一个事物
     */
    @Transactional
    public OrderInfo createOrder(String uid, GoodsVo goods) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setCreateDate(new Date());
        orderInfo.setDeliveryAddrId(0L);
        orderInfo.setGoodsCount(1);
        orderInfo.setGoodsId(goods.getId());
        orderInfo.setGoodsName(goods.getGoodsName());
        orderInfo.setGoodsPrice(goods.getGoodsPrice());
        orderInfo.setOrderChannel(1);
        orderInfo.setStatus(0);
        orderInfo.setUserId(Long.valueOf(uid));
        orderMapper.insert(orderInfo);

        SeckillOrder seckillOrder = new SeckillOrder();
        seckillOrder.setGoodsId(goods.getId());
        seckillOrder.setOrderId(orderInfo.getId());
        seckillOrder.setUserId(Long.valueOf(uid));
        orderMapper.insertSeckillOrder(seckillOrder);

        redisService.set(OrderKey.getSeckillOrderByUidGid, "" +Long.valueOf(uid)+ "_" + goods.getId(), seckillOrder);

        return orderInfo;
    }
}
