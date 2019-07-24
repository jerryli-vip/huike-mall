package com.supergo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.service.IndexService;
import com.supergo.vo.SearchResponseVo;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "itemsearch", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ItemSearchController {

	/**
	 * 索引服务
	 */
	@Reference
	private IndexService indexService;

	/**
	 * 查询商品列表 只允许post方式提交 searchMap={ "keywords":""
	 * ,"category":"","brand":"","spec":{} , "page":"" }
	 * 
	 * @param searchMap
	 * @return
	 */
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public SearchResponseVo search(@RequestBody(required = false) Map<String, Object> searchMap) {

		return indexService.search(searchMap);
	}

	@RequestMapping(value="/getCommonData/{typeId}",method=RequestMethod.GET)
	public String getCommonData(@PathVariable("typeId") Integer typeId) {
		return indexService.getCommonData(typeId);
	}

	@RequestMapping(value="/getSuggest",method=RequestMethod.POST)
	public List<String> getSuggest(@RequestBody String suggestStr) {
		return indexService.suggest("goods", suggestStr);
	}
}
