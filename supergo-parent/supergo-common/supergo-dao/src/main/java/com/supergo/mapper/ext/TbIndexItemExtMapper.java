package com.supergo.mapper.ext;

import java.util.List;
import com.supergo.pojo.ext.TbIndexItemExt;

public interface TbIndexItemExtMapper {

	List<TbIndexItemExt> queryOperatorItem(String userName);

	List<TbIndexItemExt> queryShopItem(String userName);

}
