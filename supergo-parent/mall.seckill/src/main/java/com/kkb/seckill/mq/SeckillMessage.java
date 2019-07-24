package com.kkb.seckill.mq;

/**
 * Created by coder on 2018/11/29.
 *
 * 消息体
 */
public class SeckillMessage {

    private String uid;
    private long goodsId;


    public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
