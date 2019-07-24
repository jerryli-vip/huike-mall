package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbAdCategory;
import com.supergo.service.TbADCategoryService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 广告分类管理控制层
 */
@RestController
@RequestMapping("/adCategory")
public class TbADCategoryController {

	@Reference
	private TbADCategoryService service;

	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbAdCategory> queryGoods(@PathVariable Integer page, @PathVariable Integer rows,
			@RequestBody(required = false) TbAdCategory tbAdCategory) {
		try {
			return service.query(page, rows, tbAdCategory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new PageVO<>();

	}

	@RequestMapping("queryAll")
	public ResultVO queryAll() {
		try {
			return service.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出现错误");
	}

	/**
	 * 新增
	 * 
	 * @param tbAdCategory
	 * @return
	 */
	@RequestMapping("add")
	public ResultVO add(@RequestBody(required = false) TbAdCategory tbAdCategory) {
		try {
			return service.add(tbAdCategory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出现错误");

	}

	/**
	 * 编辑
	 * 
	 * @param tbAdCategory
	 * @return
	 */
	@RequestMapping("edit")
	public ResultVO edit(@RequestBody(required = false) TbAdCategory tbAdCategory) {
		try {
			return service.edit(tbAdCategory);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出现错误");

	}

	@RequestMapping("delete")
	public ResultVO delete(@RequestBody(required = false) Integer[] ids) {

		try {
			return service.deleteByIds(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 开启
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("puton")
	public ResultVO putOn(@RequestBody(required = false) Integer[] ids) {

		try {
			return service.putOn(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 屏蔽
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("putoff")
	public ResultVO putOff(@RequestBody(required = false) Integer[] ids) {

		try {
			return service.putOff(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}
	
	/**
	 * 查询所有广告分类
	 * 
	 * */
	@RequestMapping("/queryAllCategory")
	public List<TbAdCategory> queryAllCategory(){
		
		return  service.queryAllCategory();
		
	}

}
