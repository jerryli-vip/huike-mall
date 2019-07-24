package com.kkb.seckill.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.kkb.seckill.entity.SeckillOrder;
import com.kkb.seckill.redis.OrderKey;
import com.kkb.seckill.redis.RedisService;
import com.kkb.seckill.server.IGoodsService;
import com.kkb.seckill.server.IOrderService;
import com.kkb.seckill.vo.GoodsVo;
@Service
public class Receiver {

    private static Logger log = LoggerFactory.getLogger(Receiver.class);


    @Autowired
    RedisService redisService;

    @Autowired
    IGoodsService goodsService;

    @Autowired
    IOrderService orderService;

    @Autowired
    RedisService redis;

    @JmsListener(destination="kkb.active.queue")
    public void receive(String message){
        log.info("receive message:"+message);
        SeckillMessage m = RedisService.stringToBean(message, SeckillMessage.class);
        String uid = m.getUid();
        long goodsId = m.getGoodsId();

        GoodsVo goodsVo = goodsService.getGoodsVoByGoodsId(goodsId);
        int stock = goodsVo.getStockCount();
        if(stock <= 0){
            return;
        }

        //判断重复秒杀
        SeckillOrder order = redis.get(OrderKey.getSeckillOrderByUidGid, "" + uid + "_" + goodsId, SeckillOrder.class);
		 if(order != null) {
            return;
        }

        //减库存 下订单 写入秒杀订单
		 orderService.seckill(uid, goodsVo);
    }

//    @RabbitListener(queues = MQConfig.TOPIC_QUEUE1)
//    public void receiveTopic1(String message) {
//        log.info(" topic  queue1 message:" + message);
//    }
//
//    @RabbitListener(queues = MQConfig.TOPIC_QUEUE2)
//    public void receiveTopic2(String message) {
//        log.info(" topic  queue2 message:" + message);
//    }
}
