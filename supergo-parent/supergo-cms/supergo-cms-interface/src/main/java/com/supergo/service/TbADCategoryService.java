package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAdCategory;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbADCategoryService {

	/**
	 * 查询所有广告分类
	 */

	PageVO<TbAdCategory> query(Integer page, Integer rows, TbAdCategory tbAdCategory);
	
	ResultVO queryAll();


	/**
	 * 添加
	 * 
	 * @param tbAdCategory
	 * @return
	 */
	ResultVO add(TbAdCategory tbAdCategory);

	/**
	 * 批量按id进行删除
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO deleteByIds(Integer[] ids);

	/**
	 * 批量开启
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO putOn(Integer[] ids);

	/**
	 * 批量屏蔽
	 * 
	 * @param ids
	 * @return
	 */
	ResultVO putOff(Integer[] ids);

	/**
	 * 编辑
	 * @param tbAdCategory
	 * @return
	 */
	ResultVO edit(TbAdCategory tbAdCategory);

	List<TbAdCategory> queryAllCategory();

	
}
