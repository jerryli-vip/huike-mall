package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.ext.TbItem;

public interface TbItemMapperExt {
	
	/**
	 * 获取所有的数据
	 * @return
	 */
	public List<TbItem> selectByExample() ;
	/**
	 * 根据产品id获取
	 * @param list
	 * @return
	 */
	public List<TbItem> selectByList(List<Integer> list);

}
