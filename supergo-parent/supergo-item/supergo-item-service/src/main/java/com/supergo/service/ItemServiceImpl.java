package com.supergo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbBusinessMapper;
import com.supergo.mapper.ext.ItemExtMapper;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.ext.ItemListExt;
import com.supergo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbBusinessMapper mapper;

	@Autowired
	private ItemExtMapper extmapper;

	@Override
	public String hello(String str) {
		TbBusiness business = mapper.selectByPrimaryKey(1);
		System.out.println(business);
		return business.toString();
	}

	@Override
	public ItemListExt queryItemList(Integer goodsId) {

		if (goodsId == null || goodsId < 0) {
			return null;
		}
		return extmapper.queryItemListById(goodsId);
	}

}
