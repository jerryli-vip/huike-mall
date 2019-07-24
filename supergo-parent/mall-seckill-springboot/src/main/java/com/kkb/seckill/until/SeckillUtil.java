package com.kkb.seckill.until;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SeckillUtil {

	 /**
     * 做标记，判断该商品是否被处理过了
     *  我们在本地缓存中加入一层记录，记录商品是否卖完了，这样超卖后我们会减少到redis的访问流量
     */
    public static ConcurrentMap<Long, Boolean> overstepMap ;
    static{
    	overstepMap = new ConcurrentHashMap<Long, Boolean>();
    }
}
