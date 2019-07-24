package com.kkb.seckill.server.impl;

import java.util.List;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.kkb.seckill.entity.SeckillGoods;
import com.kkb.seckill.entity.SeckillOrder;
import com.kkb.seckill.mapper.GoodsMapper;
import com.kkb.seckill.mq.SeckillMessage;
import com.kkb.seckill.redis.GoodsKey;
import com.kkb.seckill.redis.OrderKey;
import com.kkb.seckill.redis.RedisService;
import com.kkb.seckill.server.IGoodsService;
import com.kkb.seckill.until.SeckillUtil;
import com.kkb.seckill.vo.GoodsVo;
@Service("goodsServiceImpl")
public class GoodsServiceImpl implements IGoodsService{
	
	 @Autowired
	    RedisService redis;
	
	 //乐观锁冲突最大重试次数
    private static final int DEFAULT_MAX_RETRIES = 5;

    @Autowired
    GoodsMapper goodsMapper;
	
    @Autowired
    private Queue queue;
    
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    
	@Override
	public Boolean buyGoods(String uid, String goodsId) {
		//减库存
		Long num = redis.decr(GoodsKey.getGoodsStock, "" + goodsId);//10
		if(num>0){
			
			//重复验证
			SeckillOrder order = redis.get(OrderKey.getSeckillOrderByUidGid, "" + uid + "_" + goodsId, SeckillOrder.class);
			//已经有订单在内存中
			if (order != null) {
	            return false;
	        }
			
			//同步写入消息队列
			/**
	         * 放入到消息队列中去
	         */
	        SeckillMessage message = new SeckillMessage();
	        message.setUid(uid);
	        message.setGoodsId(Long.valueOf(goodsId));
	        String msg = RedisService.beanToString(message);
	        jmsMessagingTemplate.convertAndSend(this.queue,msg);
			return true;
		}else{
			SeckillUtil.overstepMap.put(Long.valueOf(goodsId), true);
            return false;
		}
	}
	/**
     * 查询商品列表
     *
     * @return
     */
    public List<GoodsVo> listGoodsVo() {
        return goodsMapper.listGoodsVo();
    }

    /**
     * 根据id查询指定商品
     *
     * @return
     */
    public GoodsVo getGoodsVoByGoodsId(long goodsId) {
        return goodsMapper.getGoodsVoByGoodsId(goodsId);
    }

    /**
     * 减少库存，每次减一
     *
     * @return
     */
    public boolean reduceStock(GoodsVo goods) {
        int numAttempts = 0;
        int ret = 0;
        SeckillGoods sg = new SeckillGoods();
        sg.setGoodsId(goods.getId());
        sg.setVersion(goods.getVersion());
        do {
            numAttempts++;
            try {
                sg.setVersion(goodsMapper.getVersionByGoodsId(goods.getId()));
                ret = goodsMapper.reduceStockByVersion(sg);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (ret != 0)
                break;
        } while (numAttempts < DEFAULT_MAX_RETRIES);

        return ret > 0;
    }
}
