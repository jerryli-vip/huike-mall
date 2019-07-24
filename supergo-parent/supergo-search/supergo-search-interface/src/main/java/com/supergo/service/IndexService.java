package com.supergo.service;

import java.util.List;
import java.util.Map;

import com.supergo.vo.SearchResponseVo;

/**
 * 索引服务
 * 
 * @author think
 *
 */
public interface IndexService {

	/**
	 * 根据条件去索引库中搜索数据
	 * 
	 * @param queryConditions
	 *            查询条件
	 * @return 搜索结果封装对象
	 */
	SearchResponseVo search(Map<String, Object> queryConditions);

	public String getCommonData(Integer typeId);

	/**
	 * 往索引库中导入全量数据
	 * 
	 * @param index
	 * @param type
	 * @return
	 */
	String importFullData(String index, String type);

	List<String> suggest(String index, String suggest);

}
