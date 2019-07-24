package com.supergo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbAreas;
import com.supergo.pojo.TbCities;
import com.supergo.service.TbAreasService;
import com.supergo.utils.ResultVO;

/**
 * 三级联动之区信息
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/area")
public class TbAreasController {
	@Reference
	private TbAreasService areasService;
	
	/**	
	 * 个人设置之三级联动区回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryArea")
	public List<TbAreas> queryArea(@RequestBody(required=false) TbAddress address){
		return areasService.queryArea(address);
	}
	/**
	 * 个人设置之三级联动区回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryAreaEcho")
	public List<TbAreas> queryAreaEcho(@RequestBody(required=false) TbAddress address){
		return areasService.queryArea(address);
	}
	
	/**
	 * 根据城市的值获取对应地区的集合
	 * @author 陈阳
	 * 
	 * */
	@RequestMapping("/getAreas")
	public ResultVO getAreas(@RequestBody(required=false) TbCities city){
		
		return areasService.getAreas(city);
		
	}
	
}
