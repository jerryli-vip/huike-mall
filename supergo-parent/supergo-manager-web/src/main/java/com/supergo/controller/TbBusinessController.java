package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.service.TbBusinessService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;
/**
 * 商家管理和商家审核
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/business")
public class TbBusinessController {
	
	@Reference
	private TbBusinessService businessService;
	
	/**
	 * 商家审核之分页查询
	 * @author 范江浩
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbBusiness> queryBusiness(@RequestBody(required = false) TbBusiness business,@PathVariable Integer page,@PathVariable Integer rows){
		//page是当前页，rows是每页多少行
		return businessService.queryBusiness(business, page, rows);
		
	}
	
	/**
	 * 商家审核之审核通过功能
	 * @author 范江浩
	 */
	@RequestMapping("/updateAuditingSuccess")
	public ResultVO updateAuditingSuccess(@RequestBody(required = false) TbBusiness business){
		System.out.println(business.getBusinessId());
		return businessService.updateAuditingSuccess(business);
	}
	/**
	 * 商家审核之审核未通过功能
	 * @author 范江浩
	 */
	@RequestMapping("/updateAuditingFail")
	public ResultVO updateAuditingFail(@RequestBody(required = false) TbBusiness business){
		System.out.println(business.getBusinessId());
		return businessService.updateAuditingFail(business);
	}
	/**
	 * 商家管理之关闭商家功能
	 * @author 范江浩
	 */
	@RequestMapping("/updateCloseBusiness")
	public ResultVO updateCloseBusiness(@RequestBody(required = false) TbBusiness business){
		return businessService.updateCloseBusiness(business);
	}
	/**
	 * 商家管理之查看店铺功能
	 * @author 范江浩
	 */
	@RequestMapping("/queryShop")
	public List<TbShop> queryShop(@RequestBody(required = false) TbBusiness business){
		System.out.println(business.getBusinessId());
		return businessService.queryShop(business);
	}
}
