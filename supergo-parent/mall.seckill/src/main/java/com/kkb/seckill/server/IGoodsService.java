package com.kkb.seckill.server;

import java.util.List;

import com.kkb.seckill.vo.GoodsVo;

public interface IGoodsService {
	Boolean buyGoods(String uid,String goodsId);
	public List<GoodsVo> listGoodsVo() ;
	public GoodsVo getGoodsVoByGoodsId(long goodsId) ;
	public boolean reduceStock(GoodsVo goods) ;
}
