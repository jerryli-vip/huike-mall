package com.supergo.mapper.ext;

import java.util.List;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShopUser;


public interface TbBusinessMapperExt {

	int insert(TbBusiness tbBusiness);

	

	int selectBusinessId(int userId);



	List<TbShopUser> queryAllShopUser(TbShopUser shopUser);



	void updateById(int tbShopId);



	void updateById(TbBusiness tbBusiness);


}
