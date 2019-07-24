package com.kkb.seckill.server;

import com.kkb.seckill.entity.OrderInfo;
import com.kkb.seckill.vo.GoodsVo;

public interface IOrderService {

	long getSeckillResult(String uid, Long goodsId);
	public OrderInfo seckill(String uid, GoodsVo goods);

}
