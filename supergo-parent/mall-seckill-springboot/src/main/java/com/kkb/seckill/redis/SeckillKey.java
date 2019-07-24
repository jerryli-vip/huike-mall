package com.kkb.seckill.redis;

/**
 * Created by coder on 2018/11/29.
 */
public class SeckillKey extends BasePrefix {
    private SeckillKey(String prefix) {
        super(prefix);
    }

    public static SeckillKey isGoodsOver = new SeckillKey("go");
}
