package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbCities;
import com.supergo.pojo.TbProvinces;
import com.supergo.utils.ResultVO;

/**
 * 三级联动之市信息
 * 
 * @author 范江浩
 *
 */
public interface TbCitiesService {

	/**
	 * 个人设置之三级联动市信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbCities> queryCities(TbAddress address);

	/**
	 * 个人设置之三级联动市回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbCities> queryCitiesEcho(TbAddress address);

	/**
	 * 根据省份查询出对应的城市
	 * @author 陈阳
	 * */
	ResultVO getCities(TbProvinces province);
}
