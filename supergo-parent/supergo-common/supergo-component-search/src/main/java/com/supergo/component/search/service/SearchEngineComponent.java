package com.supergo.component.search.service;

import java.util.List;
import java.util.Map;

import com.supergo.component.search.po.RequestVO;
import com.supergo.component.search.po.ResponseVO;

/**
 * 搜索引擎接口
 * 
 * @author think
 *
 */
public interface SearchEngineComponent<T> {

	/**
	 * 设置Mapping
	 * 
	 * @param index
	 *            索引库名称
	 * @param type
	 *            表名称
	 * @param mapping
	 *            映射，该参数是个json串
	 * @return
	 */
	ResponseVO prepareMapping(String index, String type, String mapping);

	// 添加索引
	ResponseVO addDoc(String index, String type, T t);

	/**
	 * 批量添加索引，id是指定的值
	 * 
	 * @param docMap
	 *            key为id，value为存储的对象
	 * @return
	 */
	ResponseVO bulkAddDocByMap(String index, String type, Map<String, T> dataMap);

	/**
	 * 批量添加索引，id是由搜索服务生成的值
	 * 
	 * @param dataList
	 *            要存储的数据集合
	 * @return
	 */
	ResponseVO bulkAddDocByList(String index, String type, List<T> dataList);

	// 删除索引
	/**
	 * 根据ID删除索引
	 * 
	 * @param id
	 * @return
	 */
	ResponseVO delDocById(String index, String type, String id);

	/**
	 * 根据ID批量删除索引
	 * 
	 * @param ids
	 * @return
	 */
	ResponseVO delDocByIds(String index, String type, String[] ids);

	// 修改索引
	// 搜索索引
	/**
	 * 根据ID搜索数据
	 * 
	 * @param id
	 * @return
	 */
	ResponseVO searchById(String index, String type, String id);

	/**
	 * 根据搜索关键字搜索数据
	 * 
	 * @param id
	 * @return
	 */
	ResponseVO search(String index, String type, String keywords);

	/**
	 * 根据负责查询条件，查询结果
	 * 
	 * @param requestVO
	 * @return
	 */
	ResponseVO search(String index, String type, RequestVO requestVO);
}
