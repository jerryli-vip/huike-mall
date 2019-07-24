package com.supergo.component.search.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.supergo.component.search.po.RequestVO;
import com.supergo.component.search.po.ResponseVO;
import com.supergo.component.search.util.ElasticSearchClientHelper;

@Component
public class ESSearchEngineComponent<T> implements SearchEngineComponent<T> {

	/** 日志记录 */
	public static final Logger logger = LoggerFactory.getLogger(ESSearchEngineComponent.class);

	// 创建访问ES服务器的客户端
	protected Client client = ElasticSearchClientHelper.getInstance().getClient();

	@Override
	public ResponseVO prepareMapping(String index, String type, String mapping) {
		try {
			client.admin().indices().preparePutMapping(index).setType(type).setSource(mapping, XContentType.JSON).get();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseVO.build(500, "设置Mapping失败:" + e.getMessage());
		}
		return ResponseVO.ok();
	}

	@Override
	public ResponseVO addDoc(String index, String type, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO bulkAddDocByMap(String index, String type, Map<String, T> dataMap) {
		// 获取批量请求构建器，存放单条请求
		BulkRequestBuilder builder = client.prepareBulk();
		// 计数器，用来控制批量数据的提交
		int count = 0;
		for (Entry<String, T> entry : dataMap.entrySet()) {
			if (StringUtils.isEmpty(entry.getKey()) || entry.getValue() == null) {
				continue;
			}
			try {
				// 将对象转成json字符串
				String json = JSON.toJSONString(entry.getValue());
				// 将每个要执行的请求，都放到批量请求构建器里面
				builder.add(client.prepareIndex(index, type, entry.getKey()).setSource(json, XContentType.JSON));
				// 每1000条刷新提交一次
				if (count % 1000 == 0) {
					// 执行批量操作
					BulkResponse response = builder.execute().actionGet();
					logger.debug("addDocByBulk index[{}] type[{}] num[{}] status[{}]", index, type, count, response.status());
				}
				count++;
			} catch (Exception e) {
				logger.error("{}", e);
				// 如果出现异常，继续执行其他的数据
				continue;
			}

		}
		BulkResponse response = builder.execute().actionGet();
		logger.debug("addDocByBulk index[{}] type[{}] num[{}] status[{}]", index, type, count, response.status());
		return ResponseVO.ok();
	}

	@Override
	public ResponseVO bulkAddDocByList(String index, String type, List<T> dataList) {
		// List<T> list
		BulkRequestBuilder builder = client.prepareBulk();
		// 批量添加
		int count = 0;
		for (T t : dataList) {
			if (t == null) {
				continue;
			}
			try {
				builder.add(client.prepareIndex(index, type).setSource(JSON.toJSONString(t), XContentType.JSON));
				// 每1000条刷新提交一次
				if (count % 1000 == 0) {
					builder.execute().actionGet();
					logger.info("提交了：" + count);
				}
				count++;
			} catch (Exception e) {
				logger.error("{}", e);
				continue;
			}
		}
		BulkResponse response = builder.execute().actionGet();
		logger.info("addDocByBulk response status {}", response.status());
		// 查看是否有失败情况
		if (response.hasFailures()) {
			logger.info("addDocByBulk 存在错误");
			logger.error("addDocByBulk ByList index[{}] type[{}] num[{}] status[{}] hasFailures[{}]", index, type,
					count, response.status(), response.hasFailures());
		}
		logger.debug("addDocByBulk ByList index[{}] type[{}] num[{}] status[{}] hasFailures[{}]", index, type, count,
				response.status(), response.hasFailures());
		// return response;
		return null;
	}

	@Override
	public ResponseVO delDocById(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO delDocByIds(String index, String type, String[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO searchById(String index, String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO search(String index, String type, String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseVO search(String index, String type, RequestVO requestVO) {
		/*
		 * // 索引名称 String index = "goods"; // 获取查询组装的对象 SearchRequestBuilder srb =
		 * EsClientTool.getClient().prepareSearch(index);
		 * 
		 * // String productId = "10000000"; // // if(productId!=null){ //
		 * MatchQueryBuilder qb = QueryBuilders.matchQuery("product_id", // productId);
		 * // srb.setQuery(qb); // }
		 *//**
			 * 添加查询条件
			 */
		/*
		 * // 模型 Object templateId = searchMap.get("template"); if (templateId != null)
		 * { MatchQueryBuilder qb = QueryBuilders.matchQuery("template", templateId);
		 * srb.setQuery(qb); } // 品牌 Object brandId = searchMap.get("brand"); if
		 * (brandId != null) { MatchQueryBuilder qb = QueryBuilders.matchQuery("brand",
		 * brandId); srb.setQuery(qb); }
		 * 
		 * // 关键字查询 Object keyTemp = searchMap.get("keywords"); if (keyTemp != null &&
		 * !"".equals(keyTemp)) { String key = (String) searchMap.get("keywords"); //
		 * name 和info 两个里边只要出现了关键字都出现 MultiMatchQueryBuilder qb =
		 * QueryBuilders.multiMatchQuery(key, "goods_name", "spec_info");
		 * srb.setQuery(qb); } // 商品总数 String productCount = "product_count"; String
		 * productIdFiled = "product_id"; // 聚合条件生成
		 *//**
			 * 等同于这个条件 POST /goods/type/_search { "query": { "multi_match": { "query" :
			 * "亮瓷黑", "fields" : ["goods_name", "spec_info"] } } }
			 */
		/*
		 * TermsAggregationBuilder productCountBuilder =
		 * AggregationBuilders.terms(productCount).field(productIdFiled);
		 * srb.addAggregation(productCountBuilder);
		 * 
		 * String brandCount = "brand_count"; String brandFiled = "brand";
		 * TermsAggregationBuilder brandBuilder =
		 * AggregationBuilders.terms(brandCount).field(brandFiled);
		 * srb.addAggregation(brandBuilder);
		 * 
		 * String templateCount = "template_count"; String templateFiled = "template";
		 * TermsAggregationBuilder templateBuilder =
		 * AggregationBuilders.terms(templateCount).field(templateFiled);
		 * srb.addAggregation(templateBuilder);
		 * 
		 * // 排序 根据前台传输的字段和类型排序 Object orderBy = searchMap.get("order"); if (orderBy !=
		 * null) { String orderStr = String.valueOf(orderBy); String[] orderStrs =
		 * orderStr.split(":"); SortOrder sortType = SortOrder.DESC; if (orderStrs[1] !=
		 * null && orderStrs[1].equals("asc")) { sortType = SortOrder.ASC; }
		 * srb.addSort(orderStrs[0], sortType); }
		 * 
		 * // 设置查询长度 Object querySizeO = searchMap.get("size"); int querySize = 20; if
		 * (querySizeO != null) { querySize =
		 * Integer.valueOf(String.valueOf(querySizeO)); }
		 * 
		 * // 获取查询结果 SearchResponse sr = srb.setSize(querySize).get();
		 * 
		 * SearchResponseVo responseVo = new SearchResponseVo(); // 格式化数据
		 * List<Map<String, Object>> valueList = EsClientTool.responseToList(sr);
		 * responseVo.setGoodsList(valueList); // 获取页数 Long size =
		 * sr.getHits().getTotalHits(); responseVo.setDataSize(size);
		 * 
		 * List<List<TypeCountResponseVo>> responsCountList = new
		 * ArrayList<List<TypeCountResponseVo>>();
		 *//**
			 * 聚合信息转换 brand template product
			 *//*
				 * List<TypeCountResponseVo> brandCountVo = new ArrayList<>(); Terms brandTerms
				 * = sr.getAggregations().get(brandCount); for (Terms.Bucket bucket :
				 * brandTerms.getBuckets()) { TypeCountResponseVo vo = new
				 * TypeCountResponseVo(); vo.setType(String.valueOf(bucket.getKey()));
				 * vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
				 * vo.setId(brandFiled); brandCountVo.add(vo); }
				 * responsCountList.add(brandCountVo); //
				 * responseVo.setTypeCountList(brandCountVo);
				 * 
				 * List<TypeCountResponseVo> templateCountVo = new ArrayList<>(); Terms
				 * templateTerms = sr.getAggregations().get(templateCount); for (Terms.Bucket
				 * bucket : templateTerms.getBuckets()) { TypeCountResponseVo vo = new
				 * TypeCountResponseVo(); vo.setType(String.valueOf(bucket.getKey()));
				 * vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
				 * vo.setId(templateFiled); templateCountVo.add(vo); }
				 * responsCountList.add(templateCountVo); //
				 * responseVo.setTypeCountList(templateCountVo);
				 * 
				 * List<TypeCountResponseVo> productCountVo = new ArrayList<>(); Terms terms1 =
				 * sr.getAggregations().get(productCount); for (Terms.Bucket bucket :
				 * terms1.getBuckets()) { TypeCountResponseVo vo = new TypeCountResponseVo();
				 * vo.setType(String.valueOf(bucket.getKey()));
				 * vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
				 * vo.setId(productIdFiled); productCountVo.add(vo); }
				 * responsCountList.add(productCountVo); // 返回值
				 * responseVo.setTypeCountList(responsCountList); return null;
				 */
		return null;
	}

}
