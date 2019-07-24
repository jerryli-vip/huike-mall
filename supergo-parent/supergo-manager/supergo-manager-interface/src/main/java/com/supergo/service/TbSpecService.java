package com.supergo.service;

import com.supergo.pojo.TbSpec;
import com.supergo.pojo.ext.TbSpecVo;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 商品规格管理
 * 
 * @author leosam
 *
 */
public interface TbSpecService {

	/**
	 * 商品规格添加
	 * 
	 * @param spce
	 * @return
	 */
	public String insertSpec(TbSpecVo vo);

	/**
	 * 商品规格删除
	 * 
	 * @param ids
	 * @return
	 */
	public ResultVO deleteSpec(Integer[] ids);

	/**
	 * 商品规格更新
	 * 
	 * @param vo
	 * @return
	 */
	public ResultVO update(TbSpecVo vo);

	/**
	 * 商品规格分页查询
	 * 
	 * @param page
	 * @param rowsPage
	 * @return
	 */
	public PageVO<TbSpec> querySpec(TbSpec spec, Integer page, Integer rowsPage);

	/**
	 * 规格关键字模糊查询
	 */

	public PageVO<TbSpec> queryAll(TbSpec spec);

	/**
	 * 修改--数据回显
	 * 
	 * @param id
	 * @return
	 */
	public TbSpecVo findSpec(int specId);

	/**
	 * 只按id进行查询 李聪
	 * 
	 * @param id
	 * @return
	 */
	ResultVO queryBySpecId(Integer id);

}
