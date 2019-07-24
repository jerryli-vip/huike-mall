package com.supergo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbAuthorityService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/authority")
public class TbAuthorityController {
	@Autowired
	private TbAuthorityService service;

	/**
	 * 权限查询
	 * 
	 * @author 王斌
	 * @param authority
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbAuthority> queryAuthority(@RequestBody TbAuthority authority, @PathVariable Integer page,
			@PathVariable Integer rows) {
		authority.setType(1);
		return service.queryUser(page, rows, authority);
	}

	/**
	 * 删除权限
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("delete")
	public ResultVO batchDeleteAuthority(@RequestBody Integer[] ids) {
		return service.deleteManagerAuthority(ids);
	}

	/**
	 * 添加权限
	 * 
	 * @author 王斌
	 * @param authority
	 * @param session
	 * @return
	 */
	@RequestMapping("insert")
	public ResultVO addAuthority(@RequestBody TbAuthority authority, HttpSession session) {
		TbSysuser user = (TbSysuser) session.getAttribute("systemUser");
		authority.setType(1);
		authority.setCreateId(user.getUserName());
		authority.setUpdateId(authority.getCreateId());
		return service.insertAuthority(authority);
	}

	/**
	 * 修改权限
	 * 
	 * @author 王斌
	 * @param authority
	 * @param session
	 * @return
	 */
	@RequestMapping("update")
	public ResultVO editAuthority(@RequestBody TbAuthority authority, HttpSession session) {
		TbSysuser user = (TbSysuser) session.getAttribute("systemUser");
		authority.setUpdateId(user.getUserName());
		return service.updateAuthority(authority);
	}
	
	/**
	 * 上级权限下拉框
	 * @author 王斌
	 */
	@RequestMapping("parent")
	public List<TbAuthority> queryParentAuthority(){
		Integer type = 1;
		return service.queryParentAuthority(type);
	}
}
