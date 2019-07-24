package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.ext.TbExchangeGoodsExt;
import com.supergo.service.TbExchangeService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("exchange")
public class TbExchangeController {

	@Reference
	private TbExchangeService service;

	/**
	 * 订单换货分页查询
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbExchangeGoodsExt> queryTbExchangeGoods(@RequestBody(required = false) TbExchangeGoodsExt good,
			@PathVariable Integer page, @PathVariable Integer rows) {
		
		return service.queryTbExchangeGoods(good, page, rows);

	}

	/**
	 * 修改换货寄回
	 */
	@RequestMapping("send")
	public ResultVO sendBack(@RequestBody(required = false) String[] ids) {

		return service.sendBack(ids);
	}

	/**
	 * 修改换货成功
	 */
	@RequestMapping("exchangesuccess")
	public ResultVO exchangeSuccess(@RequestBody(required = false) String[] ids) {

		return service.exchangeSuccess(ids);
	}

	/**
	 * 修改换货取消
	 */
	@RequestMapping("exchangecancel")
	public ResultVO exchangeCancel(@RequestBody(required = false) String[] ids) {

		return service.exchangeCancel(ids);
	}

	/***
	 * 修改
	 */
	@RequestMapping("edit")
	public ResultVO exchangeEdit(@RequestBody(required = false) TbExchangeGoodsExt goods) {

		return service.exchangeUpdate(goods);
	}

}
