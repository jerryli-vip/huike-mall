package com.kkb.seckill.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.google.common.util.concurrent.RateLimiter;
import com.kkb.seckill.redis.GoodsKey;
import com.kkb.seckill.redis.RedisUtil;
import com.kkb.seckill.server.IGoodsService;
import com.kkb.seckill.server.IOrderService;
import com.kkb.seckill.until.SeckillUtil;
import com.kkb.seckill.vo.GoodsVo;

@RestController
public class GoodsController  implements InitializingBean {

	@Autowired
    private IGoodsService goodsService;
	
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	RedisUtil redis;
	
	/**
	 * 令牌桶算法的限流实现类
	 */
    RateLimiter rateLimiter = RateLimiter.create(10);
	
    
	
	@RequestMapping(value="/seckill",method=RequestMethod.GET)
	public String add(String value) {
		
		/**
    	 * 令牌桶过滤
    	 */
        if (!rateLimiter.tryAcquire(1000, TimeUnit.MILLISECONDS)) {
            return  "访问超限";
        }
        JSONObject returnJson = new JSONObject();
		JSONObject jo = JSONObject.parseObject(value);
		String uid = jo.getString("uid");
		String goodsId = jo.getString("goodsId");
		
		//内存标记，减少redis访问
        boolean over = SeckillUtil.overstepMap.get(goodsId);
        if (over) {
            return "已经卖完了";
        }
		
        
        
		Boolean isOK = goodsService.buyGoods(uid, goodsId);
		
		returnJson.put("success", isOK);
		return returnJson.toJSONString();
	}
	
	/**
	 * 单独放起来或者起程序更好
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
        List<GoodsVo> goodsVoList = goodsService.listGoodsVo();
        if (goodsVoList == null) {
            return;
        }
        for (GoodsVo goods : goodsVoList) {
        	redis.set(GoodsKey.getGoodsStock, "" + goods.getId(), goods.getStockCount());
            /**
             * 初始化商品状态
             */
        	SeckillUtil.overstepMap.put(goods.getId(), false);
        }
    }
	
	 /**
     * orderId：成功
     * -1：秒杀失败
     * 0： 排队中
     * 
     * 获取秒杀结果
     */
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    @ResponseBody
    public Long seckillResult(String value) {
		JSONObject jo = JSONObject.parseObject(value);
		String uid = jo.getString("uid");
		String goodsId = jo.getString("goodsId");
        long orderId = orderService.getSeckillResult(uid, Long.valueOf(goodsId));
        return orderId;
    }
}
