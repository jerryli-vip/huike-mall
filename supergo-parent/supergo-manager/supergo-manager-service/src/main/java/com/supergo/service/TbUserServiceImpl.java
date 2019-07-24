package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.ext.TbSysuserMapperExt;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.TbSysuserRole;
import com.supergo.service.TbUserService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbUserServiceImpl implements TbUserService {

	@Autowired
	private TbSysuserMapperExt mapper;
	/**
	 * 新增用户
	 */
	@Override
	public ResultVO insertUser(TbSysuser user) {
		// 检验用户是否输入账号或者密码
		if (StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword()))
			return ResultVO.build(500, "用户名或者密码为空");
		// 校验密码和确认密码是否相同
		if (!user.getCfmPassword().equals(user.getPassword()))
			return ResultVO.build(500, "两次密码输入不一致");
		// 检验用户是否输入手机号
		if (StringUtils.isEmpty(user.getMobile()))
			return ResultVO.build(500, "手机号为空");
		// 检验用户是否输入中文名称
		if (StringUtils.isEmpty(user.getName()))
			return ResultVO.build(500, "中文名称为空");
		Long result = mapper.selectByUsername(user.getUserName());
		if (result > 0)
			return ResultVO.build(500, "该用户名已存在,请重新输入");
		Date date = new Date();
		user.setCreateTime(date);
		user.setUpdateTime(date);
		user.setIsDelete("N");
		user.setStatus("1");
		user.setPassword(DigestUtils.md5Hex(user.getPassword()));
		Integer i = mapper.insertUser(user);
		if (i == 0) {
			return ResultVO.build(500, "添加失败");
		} else {
			return ResultVO.build(200, "添加成功");
		}
	}

	/**
	 * 查询用户
	 */
	@Override
	public PageVO<TbSysuser> queryUser(Integer page, Integer rows, TbSysuser sysuser) {
		// myBatis的第三方分页插件-----PageHelper
		// PageHelper分页插件初始化分页信息,切面式添加sql语句,语句一：查询总记录数，语句二：追加limit()条件
		PageHelper.startPage(page, rows);

		// 不分页的分页实现
		List<TbSysuser> queryUser = mapper.queryAllUser(sysuser);

		// 获取分页信息
		PageInfo<TbSysuser> pageInfo = new PageInfo<>(queryUser);
		// 获取分页总记录数
		System.out.println(pageInfo.getTotal());
		// 获取分页总页数
		System.out.println(pageInfo.getPages());

		PageVO<TbSysuser> pageVo = new PageVO<>();
		pageVo.setPage(page);
		pageVo.setSize(rows);
		pageVo.setTotal(pageInfo.getTotal());
		pageVo.setRows(queryUser);
		return pageVo;
	}

	@Override
	public ResultVO delete(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有删除的数据选项");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = mapper.batchdelete(list);
		if (i == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}
	}

	@Override
	public ResultVO resetPassword(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有重置的密码选项");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = mapper.resetPassword(list);
		if (i == 0) {
			return ResultVO.build(500, "重置密码失败");
		} else {
			return ResultVO.build(200, "重置密码成功");
		}
	}

	// 修改
	@Override
	public ResultVO updateById(TbSysuser sysuser) {
		// 检验用户是否输入账号或者密码
		if (StringUtils.isEmpty(sysuser.getUserName()))
			return ResultVO.build(500, "用户名为空");
		// 检验用户是否输入手机号
		if (StringUtils.isEmpty(sysuser.getMobile()))
			return ResultVO.build(500, "手机号为空");
		// 检验用户是否输入中文名称
		if (StringUtils.isEmpty(sysuser.getName()))
			return ResultVO.build(500, "中文名称为空");
		Date date = new Date();
		sysuser.setUpdateTime(date);
		Integer i = mapper.updateUser(sysuser);
		if (i == 0) {
			return ResultVO.build(500, "修改失败");
		} else {
			return ResultVO.build(200, "修改成功");
		}
	}

	@Override
	public List<TbRole> queryRole(Integer type) {
		return mapper.queryRole(type);
	}

	@Override
	public ResultVO accredit(Integer[] roleIds, Integer userId) {
		try {
			mapper.deleteAllRoleByUserId(userId);
			TbSysuserRole tsr = new TbSysuserRole();
			for (Integer role : roleIds) {
				tsr.setSysuserId(userId);
				tsr.setRoleId(role);
				mapper.accreditUser(tsr);
			}
			return ResultVO.build(200, "授权成功");
		} catch (Exception e) {
			return ResultVO.build(200, "授权失败");
		}
	}

	@Override
	public List<TbRole> showRole(Integer userId) {
		return mapper.showRole(userId);
	}

	@Override
	public TbSysuser selectUserByUserName(String username) {
		return mapper.selectUserByUserName(username);
	}

	@Override
	public List<TbAuthority> queryAuthorityCode(String userName) {
		return mapper.queryAuthorityCode(userName);
	}


	// @Override
	// public List<TbRoleExt> queryRole() {
	// // 取出需求数据role_id,role_name,parent_id,grade
	// Integer roleId = null;
	// List<TbRoleExt> roleList = mapper.queryRoleByParentId(roleId);
	// for (TbRoleExt role : roleList) {
	// List<TbRoleExt> roleList1 = mapper.queryRoleByParentId(role.getRoleId());
	// if (roleList1.size() > 0) {
	// for (TbRoleExt role1 : roleList1) {
	// List<TbRoleExt> roleList2 =
	// mapper.queryRoleByParentId(role1.getRoleId());
	// if (roleList2.size() > 0) {
	// role1.setChild(roleList2);
	// }
	// }
	// role.setChild(roleList1);
	// }
	// }
	// return roleList;
	// }
}
