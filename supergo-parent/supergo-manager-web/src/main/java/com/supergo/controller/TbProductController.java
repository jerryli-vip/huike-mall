package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbProduct;
import com.supergo.pojo.TbProductAuditing;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbProductService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;
/**
 * 产品审核
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/product")
public class TbProductController {

	@Reference
	private TbProductService productService;
	/**
	 * 产品审核之分页查询
	 * @author 范江浩
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbProduct> queryProduct(@RequestBody(required = false) TbProduct product,@PathVariable Integer page,@PathVariable Integer rows){
		PageVO<TbProduct> queryList = productService.queryProduct(product, page, rows);
		return queryList;
		
	}
	
	/**
	 * 产品审核之审核通过功能
	 * @author 范江浩
	 */
	@RequestMapping("/updateAuditingSuccess")
	public ResultVO updateAuditingSuccess(@RequestBody(required = false) Integer[] ids){
		return productService.updateAuditingSuccess(ids);
		
	}
	/**
	 * 产品审核之审核未通过功能
	 * @author 范江浩
	 */
	@RequestMapping("/updateAuditingFail")
	public ResultVO updateAuditingFail(@RequestBody(required = false) TbProductAuditing productAuditing,HttpSession session){
		TbSysuser sysuser = (TbSysuser)session.getAttribute("systemUser");
		return productService.updateAuditingFail(productAuditing,sysuser);
		
	}
	/**
	 * 产品审核之批量删除
	 * @author 范江浩
	 */
	@RequestMapping("/delete")
	public ResultVO deleteBatch(@RequestBody(required = false) Integer[] ids){
		System.out.println(ids.toString()+"------------------------");
		return productService.deleteBatch(ids);
	}
}
