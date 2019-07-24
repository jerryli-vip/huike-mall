package com.supergo.service;

import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;

public interface BusinessCmsService {
	String insert(TbBusiness tbBusiness, TbShop tbShop, TbShopUser tbShopUser);

}
