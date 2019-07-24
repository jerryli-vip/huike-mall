package com.supergo.service;

import com.supergo.pojo.TbCategory;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 分类业务接口
 * 
 */
public interface TbCategoryService {

	/**
	 * 根据页面等级查询所属等级的分类列表
	 * 
	 */

	public PageVO<TbCategory> getCategory(TbCategory tbCategory, Integer page, Integer rows);

	/**
	 * 根据页面的输入信息添加新的分类
	 */

	public Integer insertCategory(TbCategory tbCategory);

	/**
	 * 修改分类
	 */
	public Integer updateCategory(TbCategory tbCategory);

	/**
	 * 删除分类
	 */
	public Integer deleteCategory(String[] categoryId);

	/**
	 * 根据parentId 获取分类，三级联动
	 */
	public PageVO<TbCategory> queryCategoryByParentId(Integer categoryId);
	
	
	/**
	 * 三级回显
	 * */
	
	public ResultVO queryCategoryByID(Integer categoryId);

}
