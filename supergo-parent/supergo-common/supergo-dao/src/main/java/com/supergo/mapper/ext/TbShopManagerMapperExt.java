package com.supergo.mapper.ext;

import java.util.List;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;

public interface TbShopManagerMapperExt {

	List<TbShop> selectShop(TbBusiness business);

	List<TbShopUser> selectShopUserIdByBusinessId(Integer businessId);

	void accreditRole(Integer shopUserId);
}
