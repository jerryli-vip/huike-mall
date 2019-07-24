package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.ext.TbAuthorityMapperExt;
import com.supergo.pojo.TbAuthority;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbAuthorityServiceImpl implements TbAuthorityService {

	@Autowired
	private TbAuthorityMapperExt mapper;

	@Override
	public PageVO<TbAuthority> queryUser(Integer page, Integer rows, TbAuthority authority) {
		// myBatis的第三方分页插件-----PageHelper
		// PageHelper分页插件初始化分页信息,切面式添加sql语句,语句一：查询总记录数，语句二：追加limit()条件
		PageHelper.startPage(page, rows);
		// 不分页的分页实现
		List<TbAuthority> queryAuthority = mapper.queryAuthority(authority);
		// 获取分页信息
		PageInfo<TbAuthority> pageInfo = new PageInfo<>(queryAuthority);
		// 获取分页总记录数
		System.out.println(pageInfo.getTotal());
		// 获取分页总页数
		System.out.println(pageInfo.getPages());
		PageVO<TbAuthority> pageVo = new PageVO<>();
		pageVo.setPage(page);
		pageVo.setSize(rows);
		pageVo.setTotal(pageInfo.getTotal());
		pageVo.setRows(queryAuthority);
		return pageVo;
	}

	@Override
	public ResultVO deleteManagerAuthority(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有删除的数据选项");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = mapper.batchManagerDelete(list);
		if (i == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}
	}

	@Override
	public ResultVO insertAuthority(TbAuthority authority) {
		if (StringUtils.isEmpty(authority.getAuthorityName()))
			return ResultVO.build(500, "权限名称为空");
		if (StringUtils.isEmpty(authority.getCode()))
			return ResultVO.build(500, "权限编码为空");
		if (authority.getParentId()==0||authority.getParentId()==null)
			return ResultVO.build(500, "上级权限为空");
		Integer grade = mapper.selectGradeByParentId(authority.getParentId());
		authority.setAuthorityPriority(grade+1);
		if(grade == 2){
			authority.setIsItem("N");
		}else{
			authority.setIsItem("Y");
		}
		Date date = new Date();
		authority.setCreateTime(date);
		authority.setUpdateTime(date);
		authority.setIsDelete("N");
		Integer i = mapper.insertAuthority(authority);
		if (i == 0) {
			return ResultVO.build(500, "添加失败");
		} else {
			return ResultVO.build(200, "添加成功");
		}
	}

	@Override
	public ResultVO updateAuthority(TbAuthority authority) {
		if (StringUtils.isEmpty(authority.getAuthorityName()))
			return ResultVO.build(500, "权限名称为空");
		if (StringUtils.isEmpty(authority.getCode()))
			return ResultVO.build(500, "权限编码为空");
		if (authority.getParentId()==0||authority.getParentId()==0)
			return ResultVO.build(500, "上级权限为空");
		if (StringUtils.isEmpty(authority.getUrl()))
			return ResultVO.build(500, "权限URL为空");
		Integer grade = mapper.selectGradeByParentId(authority.getParentId());
		authority.setAuthorityPriority(grade+1);
		if(grade == 2){
			authority.setIsItem("N");
		}else{
			authority.setIsItem("Y");
		}
		Date date = new Date();
		authority.setUpdateTime(date);
		Integer i = mapper.updateAuthority(authority);
		System.out.println("wodaozhele-----");
		System.out.print(authority);
		if (i == 0) {
			return ResultVO.build(500, "修改失败");
		} else {
			return ResultVO.build(200, "修改成功");
		}
	}

	@Override
	public List<TbAuthority> queryParentAuthority(Integer type) {
		return mapper.queryParentAuthority(type);
	}

}
