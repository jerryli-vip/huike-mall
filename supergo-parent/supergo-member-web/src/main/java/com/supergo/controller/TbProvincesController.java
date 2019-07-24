package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbProvinces;
import com.supergo.service.TbProvincesService;

/**
 * 三级联动之省信息
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/provinces")
public class TbProvincesController {

	@Reference
	private TbProvincesService provinceService;
	/**
	 * 个人设置之三级联动省回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryProvince")
	public List<TbProvinces> queryProvince(){
		return provinceService.queryProvinces();
		
	}
	/**
	 * 个人设置之三级联动省回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryProvinceEcho")
	public List<TbProvinces> queryProvinceEcho(){
		return provinceService.queryProvincesEcho();
		
	}
}
