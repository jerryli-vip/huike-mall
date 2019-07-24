package com.supergo.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbCategory;
import com.supergo.service.TbCategoryService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;



/**
 * 分类控制层
 * 
 * */
@RestController
@RequestMapping("/category")
public class TbCategoryController {
	
	@Reference 
	private TbCategoryService categoryService;
	
	
	/**
	 * 获取页面分类的等级或者页数查询分类列表
	 * */
	@RequestMapping("/getCategorys/{page}/{rows}")
	
	public PageVO<TbCategory> getCategorys(@RequestBody(required=false) TbCategory tbCategory,@PathVariable Integer page ,@PathVariable Integer rows){
		
		PageVO<TbCategory> categorys = categoryService.getCategory(tbCategory,page,rows); 
		
		return categorys;
		
		
	}
	
	
	/**
	 * 添加新的分类
	 * */
	@RequestMapping("/insterCategory")
	
	public ResultVO insterCategory(@RequestBody(required=false) TbCategory tbCategory){
		
		
		
		
		
		Integer integer = categoryService.insertCategory(tbCategory);
		
		if(integer == 0){
			return ResultVO.build(500, "新建失败");
		}else{
			return ResultVO.build(200, "新建成功");
		}
		
	}
	
	/**
	 * 修改分类
	 * */
	@RequestMapping("/updateCategory")
	
	public ResultVO updateCategory(@RequestBody(required=false) TbCategory tbCategory){
		
		Integer integer = categoryService.updateCategory(tbCategory);
		
		if(integer == 0){
			return ResultVO.build(500, "修改失败");
		}else{
			return ResultVO.build(200, "修改成功");
		}
		
	}
	
	/**
	 * 删除分类
	 * */
	@RequestMapping("/deleteCategory")
	
	public ResultVO deleteCategory(@RequestBody(required=false) String[] categoryId){
		
		
		Integer integer = categoryService.deleteCategory(categoryId);
		
		if(integer == 0){
			return ResultVO.build(500, "删除失败");
		}else{
			return ResultVO.build(200, "删除成功");
		}
		
	}
	
	
	/**
	 * 分类三级联动
	 * 
	 * */
	@RequestMapping("/queryCategoryByOnChange/{categoryId}")
	public PageVO<TbCategory> queryCategoryByOnChange(@PathVariable Integer categoryId){
		
		PageVO<TbCategory> categorys = categoryService.queryCategoryByParentId(categoryId);
		
		return categorys;
	}
	
	/**
	 * 分类三级回显
	 * */
	@RequestMapping("/queryCategoryByID")
	public ResultVO queryCategoryByID(@RequestBody(required=false) Integer categoryId){
		
		ResultVO re = categoryService.queryCategoryByID(categoryId);
		
		return re;
		
		
	}

}
