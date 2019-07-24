package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.ext.TbReturnGoodsExt;
import com.supergo.service.ReturnGoodService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 订单退换货
 * 
 * @author leosam
 *
 */
@RequestMapping("orders")
@RestController
public class ReturnGoodsController {

	@Reference
	private ReturnGoodService service;

	/**
	 * 条件分页查询
	 * 
	 * @param returngoods
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("returngoods/{page}/{rows}")
	public PageVO<TbReturnGoodsExt> returngoods(@RequestBody(required = false) TbReturnGoodsExt returngoods,
			@PathVariable Integer page, @PathVariable Integer rows) {
		return service.query(returngoods, page, rows);
	}

	/**
	 * 修改已确认待收货
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("return")
	public ResultVO changeReturn(@RequestBody(required = false) String[] ids) {
		return service.updateReturn(ids);
	}

	/**
	 * 修改验货成功
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("success")
	public ResultVO changeSuccess(@RequestBody(required = false) String[] ids) {
		return service.updateSuccess(ids);
	}

	/**
	 * 修改退货成功
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("cancel")
	public ResultVO changeCancel(@RequestBody(required = false) String[] ids) {
		return service.updateCancel(ids);
	}

	/**
	 * 修改退货时间和状态
	 * 
	 * @param tbReturnGoods
	 * @return
	 */
	@RequestMapping("edit")
	public ResultVO edit(@RequestBody(required = false) TbReturnGoodsExt returngoods) {

		try {
			return service.update(returngoods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 订单管理之退货
	 * 
	 * @author
	 */
	@RequestMapping("updateRetuen")
	public ResultVO updateRetuen(@RequestBody(required = false) TbReturnGoodsExt returnGoods) {
		return service.updateRetuen(returnGoods);

	}

}
