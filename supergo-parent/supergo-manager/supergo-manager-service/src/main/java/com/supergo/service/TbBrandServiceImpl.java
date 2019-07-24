package com.supergo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbBrandMapper;
import com.supergo.pojo.TbBrand;
import com.supergo.pojo.TbBrandExample;
import com.supergo.pojo.TbBrandExample.Criteria;
import com.supergo.pojo.TbSysuser;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 品牌管理
 * @author 范江浩
 *
 */
@Service
public class TbBrandServiceImpl implements TbBrandService {
	@Autowired
	private TbBrandMapper brandMapper;

	/**
	 * 品牌管理之分页查询
	 * 
	 * @author 范江浩
	 */
	@Override
	public PageVO<TbBrand> queryBrand(TbBrand brand, Integer page, Integer rows) {
		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 1;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		PageHelper.startPage(page, rows);

		TbBrandExample example = new TbBrandExample();
		example.setOrderByClause("update_time DESC");
		Criteria createCriteria = example.createCriteria();
		if (brand.getBrandName() != null && !"".equals(brand.getBrandName())) {
			createCriteria.andBrandNameLike("%" + brand.getBrandName() + "%");
		}
		createCriteria.andIsDeleteEqualTo("N");
		List<TbBrand> list = brandMapper.selectByExample(example);
		PageInfo<TbBrand> pageInfo = new PageInfo<>(list);
		PageVO<TbBrand> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}

	/**
	 * 品牌管理之新建
	 * 
	 * @author 范江浩
	 */
	@Override
	public ResultVO insertBrand(TbBrand brand, TbSysuser sysuser) {
		if (brand == null || "".equals(brand)) {
			return ResultVO.build(500, "新建失败");
		}
		brand.setIsDelete("N");
		brand.setCreateTime(new Date());
		brand.setCreateId(sysuser.getUserName());
		Integer i = brandMapper.insert(brand);
		if (i == 0) {
			return ResultVO.build(500, "新建失败");
		} else {
			return ResultVO.build(200, "新建成功");
		}
	}

	/**
	 * 品牌管理之删除
	 * 
	 * @author 范江浩
	 */
	@Override
	public ResultVO deleteBrand(Integer[] ids) {

		if (ids == null || ids.length <= 0) {
			return ResultVO.build(500, "删除失败");
		}

		List<Integer> list = new ArrayList<>();

		list = Arrays.asList(ids);
		TbBrandExample example = new TbBrandExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andBrandIdIn(list);
		TbBrand brand = new TbBrand();
		brand.setIsDelete("Y");
		Integer integer = brandMapper.updateByExampleSelective(brand, example);
		// UPDATE brand SET is_delete = Y where brandId in();
		// for (String id : ids) {
		// return brandMapper.deleteByPrimaryKey(Integer.parseInt(id));
		// }
		if (integer == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}

	}

	/**
	 * 品牌管理之修改
	 * 
	 * @author 范江浩
	 */
	@Override
	public ResultVO updateBrand(TbBrand brand, TbSysuser sysuser) {
		if (brand == null || "".equals(brand)) {
			return ResultVO.build(500, "修改失败");
		}
		if (brand.getBrandId() == null || "".equals(brand.getBrandId())) {
			return ResultVO.build(500, "修改失败");
		}
		brand.setUpdateTime(new Date());
		brand.setUpdateId(sysuser.getUserName());
		Integer i = brandMapper.updateByPrimaryKey(brand);
		if (i == 0) {
			return ResultVO.build(500, "修改失败");
		} else {
			return ResultVO.build(200, "修改成功");
		}
	}

	/**
	 * 品牌管理之修改回显
	 */

	@Override
	public TbBrand updateEcho(Integer brandId) {
		// TODO Auto-generated method stub
		TbBrand tbBrand = brandMapper.selectByPrimaryKey(brandId);
		return tbBrand;
	}

	/**
	 * 根据关键字模糊查询
	 */
	@Override
	public PageVO<TbBrand> queryAll(TbBrand brand) {
		// TODO Auto-generated method stub
		TbBrandExample example = new TbBrandExample();
		Criteria createCriteria = example.createCriteria();
		if (brand != null) {
			if (brand.getBrandName() != null && !"".equals(brand.getBrandName())) {
				createCriteria.andBrandNameLike("%" + brand.getBrandName() + "%");
			}
		}
		createCriteria.andIsDeleteEqualTo("N");
		List<TbBrand> list = brandMapper.selectByExample(example);
		PageVO<TbBrand> pageVO = new PageVO<>();
		pageVO.setRows(list);
		return pageVO;
	}

}
