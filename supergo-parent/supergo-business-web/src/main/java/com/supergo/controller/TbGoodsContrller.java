package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbGoods;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.ext.GoodsVO;
import com.supergo.service.TbGoodsService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 商品的增删查改
 * 
 * @author leosam
 *
 */
@RestController
@RequestMapping("goods")
public class TbGoodsContrller {

	@Reference
	private TbGoodsService service;

	/**
	 * 分页查询主键
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("query/{page}/{rows}")
	public PageVO<TbGoods> queryGoods(@PathVariable Integer page, @PathVariable Integer rows,
			@RequestBody(required = false) TbGoods tbGoods, HttpSession session) {
		if (session.getAttribute("shopUser") == null) {
			return new PageVO<>();
		}
		TbShopUser user = (TbShopUser) session.getAttribute("shopUser");
		if (tbGoods == null) {
			tbGoods = new TbGoods();
		}
		tbGoods.setShopId(user.getShopId());
		try {
			return service.query(page, rows, tbGoods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new PageVO<>();
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */

	@RequestMapping("delete")
	public ResultVO delete(@RequestBody(required = false) Integer[] ids) {

		// System.out.println(ids + "####################");
		try {
			return service.deleteByIds(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 上架
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("puton")
	public ResultVO putOnSale(@RequestBody(required = false) Integer[] ids) {

		try {
			return service.putOnSale(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 下架
	 * 
	 * @param ids
	 * @return
	 */

	@RequestMapping("putoff")
	public ResultVO putOffSale(@RequestBody(required = false) Integer[] ids) {

		try {
			return service.putOffSale(ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 修改库存
	 * 
	 * @param price
	 * @param ids
	 * @return
	 */
	@RequestMapping("stock/{stocknum}")
	public ResultVO changeStock(@PathVariable Integer stocknum, @RequestBody(required = false) Integer[] ids) {

		try {
			return service.updateStock(stocknum, ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 修改价格
	 * 
	 * @param price
	 * @param ids
	 * @return
	 */
	@RequestMapping("price/{price:.+}")
	public ResultVO changeStock(@PathVariable String price, @RequestBody(required = false) Integer[] ids) {

		System.out.println("价格为" + price);
		try {
			return service.updatePrice(price, ids);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	/**
	 * 商品编辑
	 * 
	 * @param tbGoods
	 * @return
	 */

	@RequestMapping("edit")
	public ResultVO edit(@RequestBody(required = false) TbGoods tbGoods) {

		try {
			return service.update(tbGoods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}

	@RequestMapping("save")
	public ResultVO save(@RequestBody(required = false) GoodsVO vo, HttpSession session) {
		if (session.getAttribute("shopUser") == null) {
			return ResultVO.build(-1, "用户未登录");
		}
		TbShopUser user = (TbShopUser) session.getAttribute("shopUser");
		vo.setShopId(user.getShopId());
		System.out.println(vo);
		try {
			return service.insert(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错，请重试");
	}
}
