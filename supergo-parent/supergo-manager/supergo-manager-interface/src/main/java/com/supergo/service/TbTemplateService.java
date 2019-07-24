package com.supergo.service;

import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.ext.TbTemplateExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 模版
 * 
 * @author leosam 陈阳
 */
public interface TbTemplateService {

	/**
	 * 查询模版
	 * 
	 * @param tbTemplate
	 * @param page
	 * @param rows
	 * @return
	 */
	public PageVO<TbTemplate> getTemplate(TbTemplate tbTemplate, Integer page, Integer rows);

	/**
	 * 根据页面的输入信息添加新的模版
	 * 
	 * @param tbTemExt
	 * @return
	 */
	public Integer insertTemplate(TbTemplateExt tbTemExt);

	/**
	 * 修改模版
	 * 
	 * @param tbTemExt
	 * @return
	 */
	public Integer updateTemplate(TbTemplateExt tbTemExt);

	/**
	 * 
	 * /** 删除模版
	 * 
	 * @param templateId
	 * @return
	 */
	public Integer deleteTemplate(String[] templateId);

	/**
	 * 根据主键查询模版
	 * 
	 * @param id
	 * @return
	 */
	public ResultVO queryByPK(Integer id);

	/**
	 * 根据id查询模版用来修改回显
	 * 
	 * @param templateId
	 * @return
	 */
	public ResultVO getTemplateById(Integer templateId);
	
	
	/**
	 * 查询分类id是否存在
	 * 
	 * */
	
	public ResultVO queryTemplate(Integer categoryId);

}
