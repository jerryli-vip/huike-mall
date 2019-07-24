//package com.kkb.seckill.init;
//
//import java.util.List;
//
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.jesper.seckill.redis.GoodsKey;
//import com.kkb.seckill.redis.RedisUtil;
//import com.kkb.seckill.server.IGoodsService;
//import com.kkb.seckill.vo.GoodsVo;
//
///**
// * 初始化加载类
// */
//public class Init implements InitializingBean {
//
//	@Autowired
//    private IGoodsService goodsService;
//	@Autowired
//	RedisUtil redis;
//	@Override
//	public void afterPropertiesSet() throws Exception {
//        List<GoodsVo> goodsVoList = goodsService.listGoodsVo();
//        if (goodsVoList == null) {
//            return;
//        }
//        for (GoodsVo goods : goodsVoList) {
//        	redis.set("goodsnum" + goods.getId(), goods.getStockCount());
//            /**
//             * 初始化商品状态
//             */
//            localOverMap.put(goods.getId(), false);
//        }
//    }
//
//}
