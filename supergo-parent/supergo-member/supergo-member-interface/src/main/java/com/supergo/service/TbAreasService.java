package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbAreas;
import com.supergo.pojo.TbCities;
import com.supergo.utils.ResultVO;

/**
 * 三级联动区信息
 * 
 * @author 范江浩
 *
 */
public interface TbAreasService {

	/**
	 * 个人设置之三级联动区回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbAreas> queryArea(TbAddress address);

	/**
	 * 个人设置之三级联动区回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbAreas> queryAreaEcho(TbAddress address);
	
	/**
	 * 根据城市的值获取对应地区的集合
	 * @author 陈阳
	 * 
	 * */
	
	ResultVO getAreas(TbCities city);
}
