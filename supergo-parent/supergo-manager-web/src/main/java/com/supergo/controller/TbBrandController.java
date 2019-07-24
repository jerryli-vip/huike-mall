package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbBrand;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbBrandService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;
/**
 * 品牌管理
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/brand")
public class TbBrandController {

	@Reference
	private TbBrandService brandService;
	/**
	 * 品牌管理之分页查询
	 * @author 范江浩
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbBrand> queryBrand(@RequestBody(required=false) TbBrand brand,@PathVariable Integer page,@PathVariable Integer rows){
		 
		return brandService.queryBrand(brand,page,rows);
		
	}
	/**
	 * 品牌管理之新建
	 * @author 范江浩
	 */
	@RequestMapping("/insert")
	public ResultVO insertBrand(@RequestBody(required=false) TbBrand brand,HttpSession session){
		TbSysuser sysuser=(TbSysuser)session.getAttribute("systemUser");
		return  brandService.insertBrand(brand,sysuser);
		
		
	}
	
	/**
	 * 品牌管理之删除
	 * @author 范江浩
	 */
	@RequestMapping("/delete")
	public ResultVO deleteBrand(@RequestBody(required=false) Integer[] ids){
		System.out.println(ids);
		return brandService.deleteBrand(ids);
		
		
		
	}
	/**
	 * 品牌管理之修改
	 * @author 范江浩
	 */
	@RequestMapping("/update")
	public ResultVO updateBrand(@RequestBody(required=false) TbBrand brand,HttpSession session){
		System.out.println(brand);
		TbSysuser sysuser=(TbSysuser)session.getAttribute("systemUser");
		return brandService.updateBrand(brand,sysuser);
		
		
	}
	/**
	 * 品牌管理之修改回显
	 */
	@RequestMapping("/echo")
	public TbBrand updateEcho(Integer brandId){
		TbBrand updateEcho = brandService.updateEcho(brandId);
		return updateEcho;
		
	}
	
	/**
	 * 根据关键子模糊查询品牌
	 * 
	 * */
	@RequestMapping("/queryAllBrands")
	public PageVO<TbBrand> queryAll(@RequestBody(required=false) TbBrand brand){
		PageVO<TbBrand> brands = brandService.queryAll(brand);
		return brands;
		
	}
	
}
