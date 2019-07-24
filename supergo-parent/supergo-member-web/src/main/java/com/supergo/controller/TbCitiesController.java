package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbCities;
import com.supergo.pojo.TbProvinces;
import com.supergo.service.TbCitiesService;
import com.supergo.utils.ResultVO;

/**
 * 三级联动之市信息
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/cities")
public class TbCitiesController {

	@Reference
	private TbCitiesService citiesService;
	
	/**
	 * 个人设置之三级联动市回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryCities")
	public List<TbCities> queryCities(@RequestBody(required=false) TbAddress address){
		return citiesService.queryCities(address);
	}
	/**
	 * 个人设置之三级联动市回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryCitiesEcho")
	public List<TbCities> queryCitiesEcho(@RequestBody(required=false) TbAddress address){
		return citiesService.queryCitiesEcho(address);
	}
	
	
	/**
	 * 根据省份查询出对应的城市
	 * @author 陈阳
	 * */
	@RequestMapping("/getCities")
	public ResultVO getCities(@RequestBody(required=false) TbProvinces province){
		
		return citiesService.getCities(province);
		
		
	}
	
	
	
}
