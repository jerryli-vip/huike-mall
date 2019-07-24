package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.ext.ItemListExt;

public interface ItemExtMapper {
	/**
	 * 查询商品详情
	 * @param goodsId
	 * @return
	 */
	ItemListExt  queryItemListById(Integer goodsId);
	/**
	 * 查询商品id的图片
	 * @param goodsId
	 * @return
	 */
	List<String> queryItemImg(Integer goodsId);
	/**
	 * 查询规格
	 * @param goodsId
	 * @return
	 */
	List<ItemListExt>  querySpecListById(Integer goodsId);

}
