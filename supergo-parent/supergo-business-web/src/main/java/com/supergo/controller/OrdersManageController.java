package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.ext.TbOrderManage;
import com.supergo.service.OrdersManageService;
import com.supergo.utils.PageVO;

@RestController
@RequestMapping("orders")
public class OrdersManageController {

	@Reference
	private OrdersManageService service;

	@RequestMapping("querymanage/{page}/{rows}")
	public PageVO<TbOrderManage> queryGoods(@RequestBody(required = false) TbOrderManage manage,
			@PathVariable Integer page, @PathVariable Integer rows) {
		System.out.println(manage);
		return service.query(manage, page, rows);
	}

	
}
