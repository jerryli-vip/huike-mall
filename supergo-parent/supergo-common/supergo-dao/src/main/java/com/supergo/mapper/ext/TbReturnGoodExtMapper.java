package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.ext.TbReturnGoodsExt;

public interface TbReturnGoodExtMapper {

	List<TbReturnGoodsExt> selectByManage(TbReturnGoodsExt returngoods);

	int updateByPrimaryKey(TbReturnGoodsExt returngoods);

}
