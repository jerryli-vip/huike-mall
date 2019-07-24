package com.supergo.service;

import java.util.List;

import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 商家审核与商家管理
 * @author 范江浩
 *
 */
public interface TbBusinessService {

	/**
	 * 商家审核之分页查询
	 * @author 范江浩
	 */
	PageVO<TbBusiness> queryBusiness(TbBusiness business,Integer page,Integer rows);
	/**
	 * 商家审核之审核通过功能
	 * @author 范江浩
	 */
	ResultVO updateAuditingSuccess(TbBusiness business);
	/**
	 * 商家审核之审核未通过功能
	 * @author 范江浩
	 */
	ResultVO updateAuditingFail(TbBusiness business);
	/**
	 * 商家管理之关闭商家功能
	 * @author 范江浩
	 */
	ResultVO updateCloseBusiness(TbBusiness business);
	/**
	 * 商家管理之店铺展示功能
	 * @author 范江浩
	 */
	List<TbShop> queryShop(TbBusiness business);
}
