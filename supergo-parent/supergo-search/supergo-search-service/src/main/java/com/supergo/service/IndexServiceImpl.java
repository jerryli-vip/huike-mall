package com.supergo.service;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.common.Strings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.search.suggest.Suggest;
import org.elasticsearch.search.suggest.SuggestBuilder;
import org.elasticsearch.search.suggest.completion.CompletionSuggestion;
import org.elasticsearch.search.suggest.completion.CompletionSuggestionBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.component.search.po.RequestVO;
import com.supergo.component.search.po.ResponseVO;
import com.supergo.component.search.service.SearchEngineComponent;
import com.supergo.mapper.EsMapper;
import com.supergo.mapper.TbBrandMapper;
import com.supergo.mapper.TbTemplateMapper;
import com.supergo.pojo.GoodsEs;
import com.supergo.service.es.EsClientTool;
import com.supergo.service.util.Constants.COMMON_TYPE;
import com.supergo.vo.SearchResponseVo;
import com.supergo.vo.TypeCountResponseVo;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private TbTemplateMapper templateMapper;

	@Autowired
	private TbBrandMapper brandMapper;

	@Autowired
	private EsMapper esMapper;

	@Autowired
	private SearchEngineComponent<GoodsEs> searchEngineComponent;

	@Override
	public ResponseVO search(Map<String, Object> searchMap) {
		RequestVO requestVO = new RequestVO();
		return searchEngineComponent.search("", "", requestVO);

	}

	public SearchResponseVo search(Map<String, Object> searchMap) {
		// 索引名称
		String index = "goods";
		// 获取查询组装的对象
		SearchRequestBuilder srb = EsClientTool.getClient().prepareSearch(index);

		// String productId = "10000000";
		//
		// if(productId!=null){
		// MatchQueryBuilder qb = QueryBuilders.matchQuery("product_id",
		// productId);
		// srb.setQuery(qb);
		// }
		/**
		 * 添加查询条件
		 */
		// 模型
		Object templateId = searchMap.get("template");
		if (templateId != null) {
			MatchQueryBuilder qb = QueryBuilders.matchQuery("template", templateId);
			srb.setQuery(qb);
		}
		// 品牌
		Object brandId = searchMap.get("brand");
		if (brandId != null) {
			MatchQueryBuilder qb = QueryBuilders.matchQuery("brand", brandId);
			srb.setQuery(qb);
		}

		// 关键字查询
		Object keyTemp = searchMap.get("keywords");
		if (keyTemp != null && !"".equals(keyTemp)) {
			String key = (String) searchMap.get("keywords");
			// name 和info 两个里边只要出现了关键字都出现
			MultiMatchQueryBuilder qb = QueryBuilders.multiMatchQuery(key, "goods_name", "product_name");
			srb.setQuery(qb);
		}
		//高亮显示
		HighlightBuilder highlightBuilder=new HighlightBuilder();
	    highlightBuilder.preTags("<span class='aaa'>");
	    highlightBuilder.postTags("</span>");
	    highlightBuilder.field("product_name");
		srb.highlighter(highlightBuilder);
		
		// 商品总数
		String productCount = "product_count";
		String productIdFiled = "product_id";
		// 聚合条件生成
		/**
		 * 等同于这个条件 POST /goods/type/_search { "query": { "multi_match": { "query" :
		 * "亮瓷黑", "fields" : ["goods_name", "spec_info"] } } }
		 */
		TermsAggregationBuilder productCountBuilder = AggregationBuilders.terms(productCount).field(productIdFiled);
		srb.addAggregation(productCountBuilder);

		String brandCount = "brand_count";
		String brandFiled = "brand";
		TermsAggregationBuilder brandBuilder = AggregationBuilders.terms(brandCount).field(brandFiled);
		srb.addAggregation(brandBuilder);

		String templateCount = "template_count";
		String templateFiled = "template";
		TermsAggregationBuilder templateBuilder = AggregationBuilders.terms(templateCount).field(templateFiled);
		srb.addAggregation(templateBuilder);

		// 排序 根据前台传输的字段和类型排序
		Object orderBy = searchMap.get("order");
		if (orderBy != null) {
			String orderStr = String.valueOf(orderBy);
			String[] orderStrs = orderStr.split(":");
			SortOrder sortType = SortOrder.DESC;
			if (orderStrs[1] != null && orderStrs[1].equals("asc")) {
				sortType = SortOrder.ASC;
			}
			srb.addSort(orderStrs[0], sortType);
		}
		// 设置查询长度
		Object querySizeO = searchMap.get("size");
		int querySize = 20;
		if (querySizeO != null) {
			querySize = Integer.valueOf(String.valueOf(querySizeO));
		}
		// 获取查询结果
		SearchResponse sr = srb.setSize(querySize).get();

		SearchResponseVo responseVo = new SearchResponseVo();
		
		
		// 格式化数据
		List<Map<String, Object>> valueList = EsClientTool.responseToList(sr);
		
		responseVo.setGoodsList(valueList);
		// 获取页数
		Long size = sr.getHits().getTotalHits();
		responseVo.setDataSize(size);

		List<List<TypeCountResponseVo>> responsCountList = new ArrayList<List<TypeCountResponseVo>>();
		/**
		 * 聚合信息转换 brand template product
		 */
		List<TypeCountResponseVo> brandCountVo = new ArrayList<>();
		Terms brandTerms = sr.getAggregations().get(brandCount);
		for (Terms.Bucket bucket : brandTerms.getBuckets()) {
			TypeCountResponseVo vo = new TypeCountResponseVo();
			vo.setType(String.valueOf(bucket.getKey()));
			vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
			vo.setId(brandFiled);
			brandCountVo.add(vo);
		}
		responsCountList.add(brandCountVo);
		// responseVo.setTypeCountList(brandCountVo);

		List<TypeCountResponseVo> templateCountVo = new ArrayList<>();
		Terms templateTerms = sr.getAggregations().get(templateCount);
		for (Terms.Bucket bucket : templateTerms.getBuckets()) {
			TypeCountResponseVo vo = new TypeCountResponseVo();
			vo.setType(String.valueOf(bucket.getKey()));
			vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
			vo.setId(templateFiled);
			templateCountVo.add(vo);
		}
		responsCountList.add(templateCountVo);
		// responseVo.setTypeCountList(templateCountVo);

		List<TypeCountResponseVo> productCountVo = new ArrayList<>();
		Terms terms1 = sr.getAggregations().get(productCount);
		for (Terms.Bucket bucket : terms1.getBuckets()) {
			TypeCountResponseVo vo = new TypeCountResponseVo();
			vo.setType(String.valueOf(bucket.getKey()));
			vo.setCount(Integer.valueOf(String.valueOf(bucket.getDocCount())));
			vo.setId(productIdFiled);
			productCountVo.add(vo);
		}
		responsCountList.add(productCountVo);
		// 返回值
		responseVo.setTypeCountList(responsCountList);
		return responseVo;
	}

	public String getCommonData(Integer typeId) {
		String returnStr = "";
		switch (typeId) {
		case COMMON_TYPE.TEMPLATE: {
			List<?> list = templateMapper.selectByExample(null);
			if (list != null) {
				returnStr = JSONObject.toJSONString(list);
			}
			break;
		}
		case COMMON_TYPE.BRAND: {
			List<?> list = brandMapper.selectByExample(null);
			if (list != null) {
				returnStr = JSONObject.toJSONString(list);
			}
			break;
		}

		default:
			break;
		}

		return returnStr;
	}

	@Override
	public String importFullData(String index, String type) {

		try {
			// 获取Mapping信息
			String mapping = getMapping();
			searchEngineComponent.prepareMapping(index, type, mapping);
			// 获取要导入的数据
			List<GoodsEs> dataList = esMapper.selectAllGoods();
			// 通过搜索引擎组件，导入到索引库
			searchEngineComponent.bulkAddDocByList(index, type, dataList);

		} catch (IOException e) {
			e.printStackTrace();
			return "导入失败";
		}

		return "导入成功";
	}

	private String getMapping() throws IOException {
		// 设置mapping
		// 直接针对Mapping去创建一个PO类，初始化该PO类，最终是要json工具类将PO类直接转成json字符串

		XContentBuilder builder = jsonBuilder()
				// select
				// g.goods_id,g.goods_name,g.product_id,g.shop_id,g.shop_id,g.cost_price,
				// g.sell_price,g.inventory,g.is_specification,g.spec_info,g.create_time
				// ,p.brand,classify1,classify2,classify3
				// from tb_goods g
				// left JOIN tb_product p on g.product_id = p.product_id
				// ;

				.startObject().startObject("properties").startObject("goods_id").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// 字段加分词器 boost加权
				.startObject("goods_name").field("type", "text").field("boost", 2).field("analyzer", "ik_max_word")
				.field("search_analyzer", "ik_max_word").endObject()

				.startObject("suggest").field("type", "completion").field("analyzer", "ik_max_word").endObject()

				.startObject("product_id").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				.startObject("shop_id").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// cost_price,
				.startObject("cost_price").field("type", "double")
				// .field("index","not_analyzed")
				.endObject()

				// g.sell_price,
				.startObject("sell_price").field("type", "double")
				// .field("index","not_analyzed")
				.endObject()

				// g.inventory,
				.startObject("inventory").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// g.is_specification,
				// g.spec_info,
				.startObject("spec_info").field("type", "text").field("boost", 2).field("analyzer", "ik_max_word")
				.field("search_analyzer", "ik_max_word").endObject()

				// g.create_time date_hour_minute_second_fraction

				.startObject("create_time")
				// 格式化时间
				.field("type", "date").field("format", "yyyy-MM-dd HH:mm:ss")
				// .field("format", "strict_date_optional_time||epoch_millis")
				.endObject()

				// ,p.brand,
				.startObject("brand").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// classify1,
				.startObject("classify1").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// classify2,
				.startObject("classify2").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// classify3
				.startObject("classify3").field("type", "long")
				// .field("index","not_analyzed")
				.endObject()

				// subtitle,p.product_name
				.startObject("subtitle").field("type", "text").field("analyzer", "ik_max_word")
				.field("search_analyzer", "ik_max_word").field("boost", 1).endObject()

				// product_name
				.startObject("product_name").field("type", "text").field("analyzer", "ik_max_word")
				.field("search_analyzer", "ik_max_word").field("boost", 1).endObject()

				.startObject("img_path").field("type", "text")
				// .field("index","not_analyzed")
				.endObject()

				// g.template,
				.startObject("template").field("type", "long")
				// .field("index","not_analyzed")
				.endObject().endObject().endObject();
		String json = Strings.toString(builder);
		return json;
	}

	/**
	 * 搜索补全查询 { "size": 0, "suggest": { "my-suggest-1": { "prefix": "***" #搜索值,
	 * "analyzer": "ik_max_word"
	 * 
	 * } } } }
	 */
	@Override
	public List<String> suggest(String index, String suggestStr) {
		// 查询条件生成对象
		CompletionSuggestionBuilder suggestionBuilder = new CompletionSuggestionBuilder("suggest");
		// 设置分词查询类型
		suggestionBuilder.analyzer("ik_max_word");
		suggestionBuilder.text(suggestStr);
		// 查询值
		SearchResponse response = EsClientTool.getClient().prepareSearch(index).setTypes("type")
				.setQuery(QueryBuilders.matchAllQuery())
				.suggest(new SuggestBuilder().addSuggestion("my-suggest-1", suggestionBuilder)).get();
		/**
		 * 格式化值
		 */
		Suggest suggest = response.getSuggest();
		CompletionSuggestion suggestion = suggest.getSuggestion("my-suggest-1");
		List<CompletionSuggestion.Entry> list = suggestion.getEntries();
		ArrayList<String> returnList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			List<CompletionSuggestion.Entry.Option> options = list.get(i).getOptions();
			for (int j = 0; j < options.size(); j++) {
				if (options.get(j) instanceof CompletionSuggestion.Entry.Option) {
					CompletionSuggestion.Entry.Option op = options.get(j);
					returnList.add(op.getText().toString());
					System.out.println(op.getScore() + "--" + op.getText());
				}
			}
		}
		return returnList;
	}

}