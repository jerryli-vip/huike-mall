package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.ext.TbTemplateExt;
import com.supergo.service.TbTemplateService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 模版分类的控制类
 * 
 * */

@RestController
@RequestMapping("/template")
public class TbTemplateController {
	
@Reference
private TbTemplateService templateService;
	
	
	/**
	 * 查询模版列表
	 * */
	@RequestMapping("/getTemplates/{page}/{rows}")
	
	public PageVO<TbTemplate> getTemplates(@RequestBody(required=false) TbTemplate tbTemplate, @PathVariable Integer page ,@PathVariable Integer rows){
		

		
		PageVO<TbTemplate> Templates = templateService.getTemplate(tbTemplate,page,rows); 
		
		return Templates;
		
		
	}
	
	/**
	 * 根据模版id查询模版用于页面修改回显
	 * */
	@RequestMapping("/getTemplateById/{templateId}")
	public ResultVO getTemplateById(@PathVariable Integer templateId){
		
		return templateService.getTemplateById(templateId);
		
		 
	}
	
	
	
	/**
	 * 添加新的模版
	 * */
	@RequestMapping("/insterTemplate")
	
	public ResultVO insterTemplate(@RequestBody(required=false) TbTemplateExt tbTemExt ){
		
	
		
		Integer integer = templateService.insertTemplate(tbTemExt);
		
		if(integer == 0){
			return ResultVO.build(500, "新建失败");
		}else{
			return ResultVO.build(200, "新建成功");
		}
		
	}
	
	/**
	 * 修改分类
	 * */
	@RequestMapping("/updateTemplate")
	
	public ResultVO updateTemplate(@RequestBody(required=false) TbTemplateExt tbTemExt){
		
		Integer integer = templateService.updateTemplate(tbTemExt);
		
		if(integer == 0){
			return ResultVO.build(500, "修改失败");
		}else{
			return ResultVO.build(200, "修改成功");
		}
		
	}
	
	/**
	 * 删除模版
	 * */
	@RequestMapping("/deleteTemplate")
	
	public ResultVO deleteTemplate(@RequestBody(required=false) String[] TemplateId){
		
		Integer integer = templateService.deleteTemplate(TemplateId);
		
		if(integer == 0){
			return ResultVO.build(500, "删除失败");
		}else{
			return ResultVO.build(200, "删除成功");
		}
		
	}
	
	/**
	 * 按照主键id查询
	 * 
	 * @param tbTemplate
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{id}")

	public ResultVO getTemplates(@PathVariable Integer id) {

		try {
			return templateService.queryByPK(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错");
	}

	/**
	 * 查询分类id是否已经存在
	 * 
	 * */
	@RequestMapping("/queryTemplate")
	
	public ResultVO queryTemplate(@RequestBody(required=false) Integer categoryId){
		

		return templateService.queryTemplate(categoryId);
		
	}

}
