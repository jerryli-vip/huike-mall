package com.supergo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbSpecMapper;
import com.supergo.mapper.TbSpecOptionMapper;
import com.supergo.pojo.TbSpec;
import com.supergo.pojo.TbSpecExample;
import com.supergo.pojo.TbSpecExample.Criteria;
import com.supergo.pojo.TbSpecOption;
import com.supergo.pojo.TbSpecOptionExample;
import com.supergo.pojo.ext.TbSpecVo;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbSpecServiceImpl implements TbSpecService {

	@Autowired
	private TbSpecMapper specMapper;
	@Autowired
	private TbSpecOptionMapper specOptionMapper;

	/**
	 * 添加商品规格表
	 */
	@Override
	public String insertSpec(TbSpecVo vo) {

		int specNu = 0;
		TbSpec spec = vo.getSpec();

		if (vo != null) {

			if (spec != null) {
				specNu = specMapper.selectInsertId(spec);
			}
		}
		if (specNu != 0) {
			specOptionMapper.insertSpecOption(spec.getSpecId());
		}
		return "添加成功";
	}

	/**
	 * 商品规格更新
	 * 
	 * @return
	 */
	@Override
	public ResultVO update(TbSpecVo vo) {
		if (vo != null) {
			// 更新规格
			specMapper.updateByPrimaryKey(vo.getSpec());

			// 删除规格选项
			TbSpecOptionExample specOptionExample = new TbSpecOptionExample();
			com.supergo.pojo.TbSpecOptionExample.Criteria criteria = specOptionExample.createCriteria();
			criteria.andSpecIdEqualTo(vo.getSpec().getSpecId());

			specOptionMapper.deleteByExample(specOptionExample);

			// 插入规格选项
			List<TbSpecOption> specOptionList = vo.getSpecOptionList();
			for (TbSpecOption tbSpecOption : specOptionList) {
				tbSpecOption.setSpecId(vo.getSpec().getSpecId()); // 给规格鿉项设置规格id;
				specOptionMapper.insert(tbSpecOption);// 插入规格选项
			}
		}
		return ResultVO.build(200, "修改成功");
	}

	/**
	 * 添加商品规格分页查询
	 */
	@Override
	public PageVO<TbSpec> querySpec(TbSpec spec, Integer page, Integer rowsPage) {
		// mybatis的第三方分页插件 --- PageHelper
		PageHelper.startPage(page, rowsPage);

		TbSpecExample example = new TbSpecExample();

		Criteria criteria = example.createCriteria();

		if (spec != null) {
			if (StringUtils.isNotBlank(spec.getSpecName())) {
				criteria.andSpecNameLike("%" + spec.getSpecName() + "%");
			}
		}
		// TODO Auto-generated method stub
		List<TbSpec> list = specMapper.selectByExample(example);

		PageInfo<TbSpec> pageInfo = new PageInfo<>(list);

		PageVO<TbSpec> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rowsPage);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}

	/**
	 * 商品规格删除
	 */
	@Override
	public ResultVO deleteSpec(Integer[] ids) {

		if (ids == null || ids.length <= 0) {
			return ResultVO.build(500, "规格ID为空");
		}
		// 获取要删除规格的id集合
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(ids);// 将数组转化为list
		// 拼接删除条件
		TbSpecExample example = new TbSpecExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSpecIdIn(list);
		// 过滤被删除的规格
		TbSpec spec = new TbSpec();
		spec.setIsDelete("Y");

		Integer integer = specMapper.updateByExampleSelective(spec, example);
		if (integer != 0) {
			return ResultVO.build(200, "删除成功");
		} else {
			return ResultVO.build(500, "删除失败");
		}
	}

	/**
	 * 规格关键字模糊查询
	 */
	@Override
	public PageVO<TbSpec> queryAll(TbSpec spec) {

		TbSpecExample example = new TbSpecExample();

		Criteria criteria = example.createCriteria();

		if (spec != null) {
			if (StringUtils.isNotBlank(spec.getSpecName())) {
				criteria.andSpecNameLike("%" + spec.getSpecName() + "%");
			}
		}
		// TODO Auto-generated method stub
		List<TbSpec> list = specMapper.selectByExample(example);

		PageVO<TbSpec> pageVO = new PageVO<>();

		pageVO.setRows(list);
		return pageVO;
	}

	/**
	 * 修改--数据回显
	 */
	@Override
	public TbSpecVo findSpec(int specId) {
		// 查询规格
		TbSpec tbSpec = specMapper.selectByPrimaryKey(specId);

		// 查询规格选项
		TbSpecOptionExample specOptionExample = new TbSpecOptionExample();
		com.supergo.pojo.TbSpecOptionExample.Criteria criteria = specOptionExample.createCriteria();
		criteria.andSpecIdEqualTo(specId); // 指定条件：规格ID
		List<TbSpecOption> specOptionList = specOptionMapper.selectByExample(specOptionExample);

		// 封装到规格组合实体返囿
		TbSpecVo vo = new TbSpecVo();
		vo.setSpec(tbSpec);
		vo.setSpecOptionList(specOptionList);
		return vo;
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ResultVO queryBySpecId(Integer id) {
		if (id == null || id < 0) {
			return ResultVO.build(-1, "id不存在");
		}

		TbSpecOptionExample example = new TbSpecOptionExample();
		com.supergo.pojo.TbSpecOptionExample.Criteria criteria = example.createCriteria();
		criteria.andSpecIdEqualTo(id);
		List<TbSpecOption> list = specOptionMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return ResultVO.build(-1, "商品规格信息不存在");
		}

		return ResultVO.build(200, "查询成功", list);
	}

}
