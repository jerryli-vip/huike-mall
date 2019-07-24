package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbSubOrderExt;
import com.supergo.service.TbSubOrderService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 会员后台的订单
 * 
 * @author leosam
 *
 */
@RestController
public class MemberOrderController {

	@Reference
	private TbSubOrderService service;

	/**
	 * 订单中心的查询结果
	 * 
	 * @param page
	 * @param rows
	 * @param tbSubOrder
	 * @param session
	 * @return
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbSubOrderExt> query(@PathVariable Integer page, @PathVariable Integer rows,
			@RequestBody(required = false) TbSubOrder tbSubOrder, HttpSession session) {
		try {
			TbMember member = (TbMember) session.getAttribute("member");
			// 判断是否登陆
			if (member == null || member.getMemberId() == null || member.getMemberId() < 0) {
				return new PageVO<>();
			}

			if (tbSubOrder == null) {
				tbSubOrder = new TbSubOrder();
			}
			// 查询条件设置用户id
			tbSubOrder.setMemberId(member.getMemberId());

			return service.query(page, rows, tbSubOrder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new PageVO<>();

	}

	/**
	 * 根据订单id查询详细信息
	 * 
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping("orderDetail/{id}")
	public ResultVO query(@PathVariable String id, HttpSession session) {
		try {
			TbMember member = (TbMember) session.getAttribute("member");
			if (member == null || member.getMemberId() == null || member.getMemberId() < 0) {
				return ResultVO.build(-1, "用户未登录");
			}

			TbSubOrder tbSubOrder = new TbSubOrder();
			// 查询条件设置用户id
			tbSubOrder.setMemberId(member.getMemberId());

			return service.orderDetail(id, tbSubOrder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错");

	}

}
