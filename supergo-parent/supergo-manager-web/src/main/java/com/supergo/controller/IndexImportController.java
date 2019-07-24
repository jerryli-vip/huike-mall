package com.supergo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.service.IndexService;

/**
 * 索引导入管理
 * 
 * @author think
 * 
 */
@RequestMapping(value = "index", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class IndexImportController {

	@Reference
	private IndexService service;

	/**
	 * 将全部商品数据导入solr库中
	 */
	@RequestMapping("importFullIndex/{index}")
	public String importFullData(@PathVariable String index) {
		System.out.println(index);
		return service.importFullData(index,null);
	}
}
