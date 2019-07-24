package com.supergo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.ext.TbIndexItemExtMapper;
import com.supergo.pojo.ext.TbIndexItemExt;

@Service
public class TbIndexServiceImpl implements TbIndexService {
	@Autowired
	private TbIndexItemExtMapper mapper;

	@Override
	public List<TbIndexItemExt>indexOperatorItem(String userName) {
		return mapper.queryOperatorItem(userName);
	}

	@Override
	public List<TbIndexItemExt> indexShopItem(String userName) {
		return mapper.queryShopItem(userName);
	}

//	@Override
//	public List<TbIndexItemExt> queryOneItem(String username) {
//		return mapper.queryOneItem(username);
//	}
//
//	@Override
//	public List<TbIndexItemExt> querySecondItem(String username) {
//		return mapper.querySecondItem(username);
//	}

}
