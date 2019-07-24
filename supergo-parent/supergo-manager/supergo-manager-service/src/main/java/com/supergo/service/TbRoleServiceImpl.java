package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.ext.TbRoleMapperExt;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbRoleAuthority;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbRoleServiceImpl implements TbRoleService {
	@Autowired
	private TbRoleMapperExt mapper;

	@Override
	public PageVO<TbRole> queryRole(Integer page, Integer rows, TbRole role) {
		// myBatis的第三方分页插件-----PageHelper
		// PageHelper分页插件初始化分页信息,切面式添加sql语句,语句一：查询总记录数，语句二：追加limit()条件
		PageHelper.startPage(page, rows);

		List<TbRole> roleList = mapper.queryRole(role);
		PageInfo<TbRole> pageInfo = new PageInfo<>(roleList);

		// 获取分页信息
		PageVO<TbRole> pageVo = new PageVO<>();
		pageVo.setPage(page);
		pageVo.setSize(rows);
		pageVo.setTotal(pageInfo.getTotal());
		pageVo.setRows(roleList);
		return pageVo;
	}

	@Override
	public ResultVO insertRole(TbRole role) {
		if (StringUtils.isEmpty(role.getRoleName()))
			return ResultVO.build(500, "角色名称为空");
		if (role.getParentId()==0||role.getParentId()==null)
			return ResultVO.build(500, "上级角色为空");
		Integer grade = mapper.selectGradeByParentId(role.getParentId());
		role.setGrade(grade+1);
		Date date = new Date();
		role.setCreateTime(date);
		role.setUpdateTime(date);
		role.setIsDelete("N");
		Integer i = mapper.insertRole(role);
		if (i == 0) {
			return ResultVO.build(500, "添加失败");
		} else {
			return ResultVO.build(200, "添加成功");
		}
	}

	@Override
	public ResultVO deleteManagerRole(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有删除的数据选项");
		for (Integer id : ids) {
			if(id == -1)
				return ResultVO.build(500, "超级管理员不能删除");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = mapper.batchManagerRole(list);
		if (i == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}
	}

	@Override
	public ResultVO updateRole(TbRole role) {
		if (StringUtils.isEmpty(role.getRoleName()))
			return ResultVO.build(500, "角色为空");
		if (role.getParentId()==0||role.getParentId()==null)
			return ResultVO.build(500, "上级角色为空");
		Integer grade = mapper.selectGradeByParentId(role.getParentId());
		role.setGrade(grade+1);
		Date date = new Date();
		role.setUpdateTime(date);
		Integer i = mapper.updateRole(role);
		if (i == 0) {
			return ResultVO.build(500, "修改错误");
		} else {
			return ResultVO.build(200, "修改成功");
		}
	}

	@Override
	public List<TbAuthority> queryAuthority(Integer type) {
		return mapper.queryAuthority(type);
	}

	@Override
	public ResultVO accredit(Integer[] authorityIds, Integer roleId) {
		try {
			mapper.deleteAllAuthorityByRoleId(roleId);
			TbRoleAuthority tra = new TbRoleAuthority();
			for (Integer authId : authorityIds) {
				tra.setRoleId(roleId);
				tra.setAuthorityId(authId);
				mapper.accreditRole(tra);
			}
			return ResultVO.build(200, "授权成功");
		} catch (Exception e) {
			return ResultVO.build(200, "授权失败");
		}
	}

	@Override
	public List<TbAuthority> showAuthority(Integer roleId) {
		return mapper.showAuthority(roleId);
	}

	@Override
	public List<TbRole> showParentRole(Integer type) {
		return mapper.showParentRole(type);
	}

	@Override
	public Integer selectGradeByParentId(Integer parentId) {
		return mapper.selectGradeByParentId(parentId);
	}

}
