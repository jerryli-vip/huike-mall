package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbAdCategoryMapper;
import com.supergo.pojo.TbAdCategory;
import com.supergo.pojo.TbAdCategoryExample;
import com.supergo.pojo.TbAdCategoryExample.Criteria;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 广告分类管理实现类
 * 
 * @author 陈阳
 */
@Service
public class TbADCategoryServiceImpl implements TbADCategoryService {

	// 装配广告分类mappper
	@Autowired
	TbAdCategoryMapper mapper;

	@Override
	public PageVO<TbAdCategory> query(Integer page, Integer rows, TbAdCategory tbAdCategory) {
		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}

		// 开启分页插件
		PageHelper.startPage(page, rows);

		// 设置查询条件
		TbAdCategoryExample example = new TbAdCategoryExample();
		Criteria criteria = example.createCriteria();
		// 判断tbAdCategory是否为空，
		if (tbAdCategory != null && StringUtils.isNotBlank(tbAdCategory.getCategoryName())) {
			criteria.andCategoryNameLike("%" + tbAdCategory.getCategoryName() + "%");
		}

		// 查询出广告分类集合
		List<TbAdCategory> list = mapper.selectByExample(example);

		// 获取分页后的信息
		PageInfo<TbAdCategory> pageInfo = new PageInfo<>(list);

		// 创建PageVO对象
		PageVO<TbAdCategory> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;

	}

	@Override
	public ResultVO queryAll() {
		// 设置查询条件
		TbAdCategoryExample example = new TbAdCategoryExample();
		Criteria criteria = example.createCriteria();
		// 有效
		criteria.andStatusEqualTo("1");
		// 查询出广告分类集合
		List<TbAdCategory> list = mapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return ResultVO.ok(list);

		}
		return ResultVO.build(-1, "查询失败");
	}

	@Override
	public ResultVO add(TbAdCategory tbAdCategory) {
		if (tbAdCategory == null) {
			return ResultVO.build(-1, "广告分类未提交");
		}
		if (StringUtils.isBlank(tbAdCategory.getCategoryName())) {
			return ResultVO.build(-1, "分类名称不能为空");
		}

		if (StringUtils.isBlank(tbAdCategory.getGroupname())) {
			return ResultVO.build(-1, "分类不能为空");
		}
		if (StringUtils.isBlank(tbAdCategory.getCode())) {
			return ResultVO.build(-1, "KEY不能为空");
		}
		if (StringUtils.isBlank(tbAdCategory.getStatus())) {
			tbAdCategory.setStatus("0");
		}
		// 初始化其他数据
		tbAdCategory.setIsDelete("N");
		tbAdCategory.setCreateTime(new Date());
		tbAdCategory.setUpdateTime(new Date());
		int line = mapper.insertSelective(tbAdCategory);
		if (line > 0) {
			return ResultVO.build(200, "插入成功");
		}
		return ResultVO.build(-1, "插入失败,请检查数据");
	}

	@Override
	public ResultVO edit(TbAdCategory tbAdCategory) {
		if (tbAdCategory == null) {
			return ResultVO.build(-1, "广告分类未提交");
		}
		if (tbAdCategory.getAdCategoryId() == null) {
			return ResultVO.build(-1, "广告分类ID未知");
		}
		if (StringUtils.isBlank(tbAdCategory.getCategoryName())) {
			return ResultVO.build(-1, "分类名称不能为空");
		}

		if (StringUtils.isBlank(tbAdCategory.getGroupname())) {
			return ResultVO.build(-1, "分类不能为空");
		}
		if (StringUtils.isBlank(tbAdCategory.getCode())) {
			return ResultVO.build(-1, "KEY不能为空");
		}
		if (StringUtils.isBlank(tbAdCategory.getStatus())) {
			tbAdCategory.setStatus("0");
		}
		// 初始化其他数据
		if ("2".equals(tbAdCategory.getStatus())) {
			tbAdCategory.setIsDelete("Y");
		} else {
			tbAdCategory.setIsDelete("N");
		}
		tbAdCategory.setUpdateTime(new Date());

		int line = mapper.updateByPrimaryKeySelective(tbAdCategory);
		if (line > 0) {
			return ResultVO.build(200, "更新成功");
		}
		return ResultVO.build(-1, "更新失败,请检查数据");
	}

	@Override
	public ResultVO deleteByIds(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbAdCategory record = new TbAdCategory();
		record.setStatus("2");
		record.setIsDelete("Y");
		record.setUpdateTime(new Date());
		TbAdCategoryExample example = new TbAdCategoryExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andAdCategoryIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "删除成功，共删除" + line + "个商品");
		}
		return ResultVO.build(-1, "删除失败，请重试");
	}

	@Override
	public ResultVO putOn(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbAdCategory record = new TbAdCategory();
		record.setStatus("1");
		record.setIsDelete("N");
		record.setUpdateTime(new Date());
		TbAdCategoryExample example = new TbAdCategoryExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andAdCategoryIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "开启成功，共开启" + line + "个商品");
		}
		return ResultVO.build(-1, "开启失败，请重试");
	}

	@Override
	public ResultVO putOff(Integer[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要删除的数据");
		}

		TbAdCategory record = new TbAdCategory();
		record.setStatus("0");
		record.setIsDelete("N");
		record.setUpdateTime(new Date());
		TbAdCategoryExample example = new TbAdCategoryExample();
		Criteria criteria = example.createCriteria();
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer id : ids) {
			list.add(id);
		}
		criteria.andAdCategoryIdIn(list);

		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "屏蔽成功，共屏蔽" + line + "个商品");
		}
		return ResultVO.build(-1, "屏蔽失败，请重试");
	}

	/**
	 * 查询所有广告分类
	 * 
	 * 
	 */

	@Override
	public List<TbAdCategory> queryAllCategory() {
		// 查询出广告分类集合
		List<TbAdCategory> list = mapper.selectByExample(new TbAdCategoryExample());
		return list;
	}

}
