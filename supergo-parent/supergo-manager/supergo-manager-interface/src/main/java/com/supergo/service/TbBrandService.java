package com.supergo.service;


import com.supergo.pojo.TbBrand;
import com.supergo.pojo.TbSysuser;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 品牌管理
 * @author 范江浩
 *
 */
public interface TbBrandService {

	/**
	 * 品牌管理之分页查询
	 * @author 范江浩
	 */
	PageVO<TbBrand> queryBrand(TbBrand brand,Integer page,Integer rows);
	/**
	 * 品牌管理之新建
	 *  @author 范江浩
	 */
	ResultVO insertBrand(TbBrand brand,TbSysuser sysuser);
	/**
	 * 品牌管理之删除
	 * @author 范江浩
	 */
	ResultVO deleteBrand(Integer[] ids);
	/**
	 * 品牌管理之修改
	 * @author 范江浩
	 */
	ResultVO updateBrand(TbBrand brand,TbSysuser sysuser);
	/**
	 * 品牌管理之修改回显
	 */
	TbBrand updateEcho(Integer brandId);
	
	/**
	 * 根据关键字模糊查询
	 * */
	PageVO<TbBrand> queryAll(TbBrand brand);
}
