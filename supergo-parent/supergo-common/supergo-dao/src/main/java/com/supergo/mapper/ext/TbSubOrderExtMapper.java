package com.supergo.mapper.ext;

import java.util.List;

import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbSubOrderExt;

public interface TbSubOrderExtMapper {
	public List<TbSubOrderExt> query(TbSubOrder tbSubOrder);
}
