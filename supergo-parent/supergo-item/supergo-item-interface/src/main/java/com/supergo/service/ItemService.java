package com.supergo.service;

import com.supergo.pojo.ext.ItemListExt;

public interface ItemService {
	public String hello(String str);

	ItemListExt queryItemList(Integer goodsId);

}
