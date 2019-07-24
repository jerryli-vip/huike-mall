package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbSpec;
import com.supergo.pojo.ext.TbSpecVo;
import com.supergo.service.TbSpecService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

//相于Controller和ResponseBody的结合
@RestController
@RequestMapping("spec")
public class TbSpecController {

	@Reference
	private TbSpecService service;
	
	/**
	 * 修改--数据回显
	 * @param id
	 * @return
	 */
	
	@RequestMapping("/findSpec/{specId}")
	
	public TbSpecVo findSpec(@PathVariable int specId){
		return service.findSpec(specId);		
	}
	
	/**
	 * 商品规格添加
	 * @param spec
	 * @param specOption
	 * @return
	 */
	@RequestMapping("insertSpec")
	public ResultVO insertSpec(@RequestBody TbSpecVo vo){
		
		String str = service.insertSpec(vo);
		
		if (str == null || str.equals("")) {
			return ResultVO.build(-1, "添加失败");
		}
		return ResultVO.build(200, "添加成功");
		
	}
	/**
	 * 规格修改
	 * @param vo
	 * @return
	 */
	@RequestMapping("/update")
	public ResultVO update(@RequestBody TbSpecVo vo){
		try {
			return service.update(vo);
		} catch (Exception e) {
			return ResultVO.build(500, "发生异常");
		}
	}
	/**
	 * 商品规格分页查询
	 * @param page
	 * @param rowsPage	---rowsPage是每页记录数
	 * @return PageVO(total,rows) ---rows是分页记录集合
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbSpec> querySpec(@RequestBody(required=false) TbSpec spec ,@PathVariable Integer page,@PathVariable Integer rows){
		
		return service.querySpec(spec,page,rows);
	}
	
	/**
	 * 商品规格删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public ResultVO deleteSpec(@RequestBody(required=false) Integer[] ids){
		
		return service.deleteSpec(ids);
	
	}
	
	/**
	 * 规格关键字模糊查询
	 * */
	@RequestMapping("queryAll")
	public PageVO<TbSpec> queryAll(@RequestBody(required=false) TbSpec spec){
		
		return service.queryAll(spec);
	}
}







