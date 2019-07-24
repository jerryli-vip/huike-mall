package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.service.TbTemplateService;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/template")
public class TbTemplateController {

	@Reference
	private TbTemplateService templateService;

	/**
	 * 按照主键id查询
	 * 
	 * @param tbTemplate
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{id}")

	public ResultVO getTemplates(@PathVariable Integer id) {

		try {
			return templateService.queryByPK(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错");
	}

}
