package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbProvinces;

/**
 * 三级联动之省信息
 * 
 * @author 范江浩
 *
 */
public interface TbProvincesService {

	/**
	 * 个人设置之三级联动省回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbProvinces> queryProvinces();

	/**
	 * 个人设置之三级联动省回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	List<TbProvinces> queryProvincesEcho();
}
