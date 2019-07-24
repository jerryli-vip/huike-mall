package com.kkb.seckill.redis;

/**
 * Created by coder on 2018/11/29.
 */
public class OrderKey extends BasePrefix {

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getSeckillOrderByUidGid = new OrderKey("seckill");
}
