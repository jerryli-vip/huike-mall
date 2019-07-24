package com.kkb.seckill.redis;

public class GoodsKey extends BasePrefix {

	/**
	 * 
     * 创建一个新的实例 GoodsKey.  
     * @param expireSeconds 存活时间
     * @param prefix 前缀标识
	 */
    private GoodsKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60, "gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
    public static GoodsKey getGoodsStock = new GoodsKey(0, "gs");
}
