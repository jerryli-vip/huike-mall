package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbCitiesMapper;
import com.supergo.mapper.TbProvincesMapper;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbCities;
import com.supergo.pojo.TbCitiesExample;
import com.supergo.pojo.TbCitiesExample.Criteria;
import com.supergo.pojo.TbProvinces;
import com.supergo.pojo.TbProvincesExample;
import com.supergo.utils.ResultVO;

/**
 * 三级联动之市信息
 * 
 * @author 范江浩
 *
 */
@Service
public class TbCitiesServiceImpl implements TbCitiesService {

	@Autowired
	private TbCitiesMapper citiesMapper;
	@Autowired
	private TbProvincesMapper provinceMapper;

	/**
	 * 个人设置之三级联动市回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbCities> queryCities(TbAddress address) {
		// TODO Auto-generated method stub
		TbProvincesExample examplePrivince = new TbProvincesExample();
		com.supergo.pojo.TbProvincesExample.Criteria createCriteriaProvince = examplePrivince.createCriteria();
		if (address.getProvince() != null && !"".equals(address.getProvince())) {
			createCriteriaProvince.andProvinceEqualTo(address.getProvince());
		}
		List<TbProvinces> listProvince = provinceMapper.selectByExample(examplePrivince);

		TbCitiesExample example = new TbCitiesExample();
		Criteria createCriteria = example.createCriteria();
		if (listProvince.get(0).getProvinceid() != null && !"".equals(listProvince.get(0).getProvinceid())) {
			createCriteria.andProvinceidEqualTo(listProvince.get(0).getProvinceid());
		}
		List<TbCities> list = citiesMapper.selectByExample(example);
		return list;
	}

	/**
	 * 个人设置之三级联动市回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbCities> queryCitiesEcho(TbAddress address) {
		// TODO Auto-generated method stub
		TbProvincesExample examplePrivince = new TbProvincesExample();
		com.supergo.pojo.TbProvincesExample.Criteria createCriteriaProvince = examplePrivince.createCriteria();
		if (address.getProvince() != null && !"".equals(address.getProvince())) {
			createCriteriaProvince.andProvinceEqualTo(address.getProvince());
		}
		List<TbProvinces> listProvince = provinceMapper.selectByExample(examplePrivince);

		TbCitiesExample example = new TbCitiesExample();
		Criteria createCriteria = example.createCriteria();
		if (listProvince.get(0).getProvinceid() != null && !"".equals(listProvince.get(0).getProvinceid())) {
			createCriteria.andProvinceidEqualTo(listProvince.get(0).getProvinceid());
		}
		List<TbCities> list = citiesMapper.selectByExample(example);
		return list;
	}
	
	
	/**
	 * 根据省份查询出对应的城市
	 * @author 陈阳
	 * */

	@Override
	public ResultVO getCities(TbProvinces province) {
		// TODO Auto-generated method stub
		//判断province是否为空
		if(province==null||province.getProvinceid()==null||province.getProvince().length()<1){
			return ResultVO.build(500, "未传入省份或者省份id没有传入");
		}
		
		//获取省份id
		String provinceid = province.getProvinceid();
		//编写查询条件
		TbCitiesExample example = new TbCitiesExample();
		Criteria criteria = example.createCriteria();
		criteria.andProvinceidEqualTo(provinceid);
		//获得查询结果
		List<TbCities> list = citiesMapper.selectByExample(example);
		//判断list是否有值
		if(list==null||list.size()<1){
			return ResultVO.build(500, "没有获取到该省份的所属城市");
		}
		
		return ResultVO.build(200, "获取对应省份成功", list);
	}

}
