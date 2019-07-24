package com.supergo.service;

import java.util.List;
import com.supergo.pojo.ext.TbIndexItemExt;

/**
 * 待修改，该接口主要是获取首页菜单栏数据
 * 
 * @author think
 *
 */
public interface TbIndexService {

	// List<TbIndexItemExt> queryOneItem(String username);

	// List<TbIndexItemExt> querySecondItem(String username);

	List<TbIndexItemExt> indexOperatorItem(String userName);

	List<TbIndexItemExt> indexShopItem(String shopUserName);

}
