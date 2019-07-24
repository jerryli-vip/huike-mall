package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.ext.TbRefundExt;
import com.supergo.service.TbRefundService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("refund")
public class TbRefundController {

	@Reference
	private TbRefundService service;

	
	/**
	 * 退款单查询分页
	 * @param refund
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbRefundExt> queryTbRefund(@RequestBody(required = false) TbRefundExt refund,@PathVariable Integer page, @PathVariable Integer rows) {

		return service.queryTbRefund(refund,page, rows);
	}
	/**
	 * 修改退款进行中
	 * @param ids
	 * @return
	 */
	@RequestMapping("refunding")
	public ResultVO refundBack(@RequestBody(required=false) String[] ids){
	
		return service.refundBack(ids);

	}
	/**
	 * 修改退款成功
	 * @param ids
	 * @return
	 */
	@RequestMapping("refundsuccess")
	public ResultVO refundSuccess(@RequestBody(required=false) String[] ids){
	
		
		return service.refundSuccess(ids);
	
	
	
	}
	/**
	 * 修改退款失败
	 * @param ids
	 * @return
	 */
	@RequestMapping("refundfail")
	@ResponseBody
	public ResultVO refundFail(@RequestBody(required=false) String[] ids){
		return service.refundFail(ids);

	}
	/**
	 * 修改退款取消
	 * @param ids
	 * @return
	 */
	@RequestMapping("refundcancel")
	@ResponseBody
	public ResultVO refundCancel(@RequestBody(required=false) String[] ids){
	
		
		return service.refundCancel(ids);
	
	
	
	}
	

	
	
	
}
