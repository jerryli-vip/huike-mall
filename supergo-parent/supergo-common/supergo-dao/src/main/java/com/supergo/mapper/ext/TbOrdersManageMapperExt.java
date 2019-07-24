package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.TbOrder;
import com.supergo.pojo.TbReturnGoods;
import com.supergo.pojo.ext.TbOrderManage;

public interface TbOrdersManageMapperExt {

	List<TbOrderManage> selectByoManage(TbOrderManage manages);

	Integer update1ByStatus(String ordersubId);

	Integer update2ByStatus(String ordersubId);

	int update1ByReason(TbReturnGoods tbReturnGoods);

	int update2ByReason(TbReturnGoods tbReturnGoods);

	TbOrder selectOrderByKey(String ordersubId);

	List<TbOrderManage> selectOrderItem(String ordersubId);
}
