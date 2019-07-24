package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.ext.TbExchangeGoodsExt;

public interface TbExchangeGoodsExtMapper {
	/**
	 * 分页查询详情
	 * @param good
	 * @return
	 */
	List<TbExchangeGoodsExt> selectByExt(TbExchangeGoodsExt good);

	/**
	 * 根据状态查询
	 * @param ordersubId
	 * @return
	 */
	TbExchangeGoodsExt selectStatusById(String ordersubId);

	/**
	 * 更新信息
	 * @param goods
	 * @return
	 */
	int updateById(TbExchangeGoodsExt goods);

}
