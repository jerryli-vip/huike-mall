package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbProvincesMapper;
import com.supergo.pojo.TbProvinces;
import com.supergo.pojo.TbProvincesExample;

/**
 * 三级联动之省信息
 * 
 * @author 范江浩
 *
 */
@Service
public class TbProvincesServiceImpl implements TbProvincesService {
	@Autowired
	private TbProvincesMapper provincesMapper;

	/**
	 * 个人设置之三级联动省回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbProvinces> queryProvinces() {
		// TODO Auto-generated method stub
		TbProvincesExample example = new TbProvincesExample();
		List<TbProvinces> list = provincesMapper.selectByExample(example);
		return list;
	}

	/**
	 * 个人设置之三级联动省回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbProvinces> queryProvincesEcho() {
		// TODO Auto-generated method stub
		TbProvincesExample example = new TbProvincesExample();
		List<TbProvinces> list = provincesMapper.selectByExample(example);
		return list;
	}
}
