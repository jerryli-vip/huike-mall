package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbAreasMapper;
import com.supergo.mapper.TbCitiesMapper;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbAreas;
import com.supergo.pojo.TbAreasExample;
import com.supergo.pojo.TbAreasExample.Criteria;
import com.supergo.pojo.TbCities;
import com.supergo.pojo.TbCitiesExample;
import com.supergo.utils.ResultVO;

/**
 * 三级联动之区信息
 * 
 * @author 范江浩
 *
 */
@Service
public class TbAreasServiceImpl implements TbAreasService {

	@Autowired
	private TbAreasMapper areasMapper;
	@Autowired
	private TbCitiesMapper citiesMapper;

	/**
	 * 个人设置之三级联动区回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbAreas> queryArea(TbAddress address) {
		// TODO Auto-generated method stub

		TbCitiesExample exampleCity = new TbCitiesExample();
		com.supergo.pojo.TbCitiesExample.Criteria createCriteriaCity = exampleCity.createCriteria();
		if (address.getCity() != null && !"".equals(address.getCity())) {
			createCriteriaCity.andCityEqualTo(address.getCity());
		}
		List<TbCities> listCity = citiesMapper.selectByExample(exampleCity);

		TbAreasExample example = new TbAreasExample();
		Criteria createCriteria = example.createCriteria();
		if (listCity.get(0).getCityid() != null && !"".equals(listCity.get(0).getCityid())) {
			createCriteria.andCityidEqualTo(listCity.get(0).getCityid());
		}
		return areasMapper.selectByExample(example);
	}

	/**
	 * 个人设置之三级联动区回显信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public List<TbAreas> queryAreaEcho(TbAddress address) {
		// TODO Auto-generated method stub
		TbCitiesExample exampleCity = new TbCitiesExample();
		com.supergo.pojo.TbCitiesExample.Criteria createCriteriaCity = exampleCity.createCriteria();
		if (address.getCity() != null && !"".equals(address.getCity())) {
			createCriteriaCity.andCityEqualTo(address.getCity());
		}
		List<TbCities> listCity = citiesMapper.selectByExample(exampleCity);

		TbAreasExample example = new TbAreasExample();
		Criteria createCriteria = example.createCriteria();
		if (listCity.get(0).getCityid() != null && !"".equals(listCity.get(0).getCityid())) {
			createCriteria.andCityidEqualTo(listCity.get(0).getCityid());
		}
		return areasMapper.selectByExample(example);
	}

	
	/**
	 * 根据城市的值获取对应地区的集合
	 * @author 陈阳
	 * 
	 * */
	@Override
	public ResultVO getAreas(TbCities city) {
		// TODO Auto-generated method stub
		//判断城市是否为空
		if(city==null||city.getCityid()==null){
			return ResultVO.build(500, "未获取到城市或者未传入城市的id");
		}
		//获取city的cityid
		String cityid = city.getCityid();
		//编写查询条件
		TbAreasExample example = new TbAreasExample();
		Criteria criteria = example.createCriteria();
		criteria.andCityidEqualTo(cityid);
		//执行sql语句获取到该城市所属的地区
		List<TbAreas> list = areasMapper.selectByExample(example);
		//判断list是否为空
		if(list == null || list.size()<1){
			return ResultVO.build(500, "该城市没有所属地区");
		}
		
		return ResultVO.build(200, "查询成功", list);
	}

}
