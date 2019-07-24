package com.supergo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbCategory;
import com.supergo.pojo.TbProduct;
import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.ext.ProductRequestVO;
import com.supergo.service.TbProductService;
import com.supergo.utils.GetIdUtils;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RequestMapping("product")
@RestController
public class ProductManageController {

	@Reference
	private TbProductService productService;

	/**
	 * 新增产品 查询一二三级分类
	 * 
	 * @param categoryId
	 * @return
	 */
	@RequestMapping("queryClassify/{categoryId}")
	public List<TbCategory> queryClassify(@PathVariable Integer categoryId) {
		return productService.queryClassify(categoryId);
	}

	/**
	 * 新增产品 查询模板
	 * 
	 * @param categoryId
	 * @return
	 */
	@RequestMapping("queryTemplate/{categoryId}")
	public TbTemplate queryTemplate(@PathVariable Integer categoryId) {

		return productService.queryTemplate(categoryId);

	}

	/**
	 * 新增产品 产品添加
	 * 
	 * @param product
	 * @param productInfo
	 * @return
	 */
	@RequestMapping("insert/{templateId}")
	public ResultVO productAddServlet(@PathVariable Integer templateId,
			@RequestBody(required = false) ProductRequestVO product, HttpSession session) {
		// 从工具类中获取当前登录人信息。工具类由李聪安排编写。
		Integer shopId = GetIdUtils.getShopId(session);
		Integer userId = GetIdUtils.getShopUserId(session);
		try {
			return productService.insert(product, templateId, shopId, userId);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultVO.build(500, "系统服务层处理异常");
		}
	}

	/**
	 * 产品管理 结果查询
	 * 
	 * @param productStatus
	 * @param productName
	 * @param pageVO
	 * @return
	 */
	@RequestMapping("query/{page}/{size}")
	public PageVO<TbProduct> productListServlet(@PathVariable Integer page, @PathVariable Integer size,
			@RequestBody(required = false) TbProduct product, HttpSession session) {
		Integer shopId = GetIdUtils.getShopId(session);
		return productService.query(product, page, size, shopId);

	}

	/**
	 * 产品管理 删除产品
	 * 
	 * @param items
	 * @return
	 */
	@RequestMapping("delete")
	public ResultVO productDeleteServelt(@RequestBody(required = false) Integer[] ids) {

		try {
			return productService.delete(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultVO.build(500, "系统服务层处理异常");
		}
	}

	/**
	 * 产品管理 产品提审
	 * 
	 * @param items
	 * @return
	 */
	@RequestMapping("auditing")
	public ResultVO productAuditingServelt(@RequestBody(required = false) Integer[] ids) {

		try {
			return productService.auditing(ids);
		} catch (Exception e) {
			e.printStackTrace();
			return ResultVO.build(500, "系统服务层处理异常");
		}
	}

	/**
	 * 产品编辑信息回显
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("edit/{productId}")
	public ProductRequestVO productEditServelt(@PathVariable Integer productId) {

		try {
			return productService.echo(productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 产品编辑信息更新提交
	 * 
	 * @param productId
	 * @param classify1
	 * @param classify2
	 * @param classify3
	 * @param template
	 * @param brand
	 * @param productResultVO
	 * @return
	 */
	@RequestMapping("update/{productId}/{classify1}/{classify2}/{classify3}/{template}/{brand}")
	public ResultVO productUpdateServlet(@PathVariable Integer productId, @PathVariable Integer classify1,
			@PathVariable Integer classify2, @PathVariable Integer classify3, @PathVariable Integer template,
			@PathVariable Integer brand, @RequestBody(required = false) ProductRequestVO productResultVO,
			HttpSession session) {
		Integer shopId = GetIdUtils.getShopId(session);
		Integer userId = GetIdUtils.getShopUserId(session);
		try {
			return productService.update(productId, classify1, classify2, classify3, template, brand, productResultVO,
					shopId, userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(500, "系统服务层处理异常");

	}
}
