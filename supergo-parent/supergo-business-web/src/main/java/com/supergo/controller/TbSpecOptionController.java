package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.service.TbSpecService;
import com.supergo.utils.ResultVO;

/**
 * 商品规格信息
 * 
 * @author leosam
 *
 */
@RestController
@RequestMapping("specoption")
public class TbSpecOptionController {

	@Reference
	private TbSpecService service;

	/**
	 * 商品规格信息 根据商品规格id来查询
	 * 
	 * @param specid
	 * @return
	 */
	@RequestMapping("/query/{specid}")
	public ResultVO getTemplates(@PathVariable Integer specid) {

		try {
			return service.queryBySpecId(specid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错");
	}

}
