package com.supergo.mapper.ext;

import java.util.List;


import com.supergo.pojo.ext.TbRefundExt;

public interface TbRefundExtMapper {
	 List<TbRefundExt>  selectByExt(TbRefundExt ext);
	 
	 TbRefundExt  selectRefundStatusById(String ordersubId);
}
