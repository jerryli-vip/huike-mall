package com.supergo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbUserService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/user")
public class SystemUserController {
	@Autowired
	private TbUserService service;
	
	/**
	 * 添加用户
	 * @author 王斌
	 * @param sysuser
	 * @return
	 */
	@RequestMapping("/insert")
	public ResultVO addUser(@RequestBody TbSysuser sysuser,HttpSession session) {
		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
		sysuser.setCreateId(user.getUserName());
		sysuser.setUpdateId(sysuser.getCreateId());
		return service.insertUser(sysuser);
	}
	
	/**
	 * 分页查询
	 * @author 王斌
	 * @param sysuser
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbSysuser> queryUser(@RequestBody TbSysuser sysuser,@PathVariable Integer page, @PathVariable Integer rows) {
		return service.queryUser(page, rows,sysuser);
	}
	
	/**
	 * 修改用户
	 * @author 王斌
	 * @param sysuser
	 * @return
	 */
	@RequestMapping("update")
	public ResultVO updateUser(@RequestBody TbSysuser sysuser,HttpSession session) {
		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
		sysuser.setUpdateId(user.getUserName());
		return service.updateById(sysuser);

	}
	
	/**
	 * 删除用户
	 * @author 王斌
	 * @param ids
	 * @return
	 */
	@RequestMapping("delete")
	public ResultVO batchDeleteUser(@RequestBody Integer[] ids) {
		return service.delete(ids);
	}
	
	/**
	 * 重置密码
	 * @author 王斌
	 * @param ids
	 * @return
	 */
	@RequestMapping("resetPassword")
	public ResultVO resetPassword(@RequestBody Integer[] ids) {
		return service.resetPassword(ids);
	}
	
	/**
	 * 用户角色弹出框内容
	 * @author 王斌
	 * @return
	 */
	@RequestMapping("/userRole")
	public List<TbRole> userRole(){
		TbRole role = new TbRole();
		role.setType(1);
		return service.queryRole(role.getType());
	}
	
	/**
	 * 用户授权
	 * @author 王斌
	 * @param authorityIds
	 * @param roleId
	 * @return
	 */
	@RequestMapping("/accredit/{userId}")
	public ResultVO accredit(@RequestBody Integer[] roleIds,@PathVariable Integer userId){
		return service.accredit(roleIds,userId);
	}
	
	/**
	 * 查看角色权限
	 * @author 王斌
	 * @param roleId
	 * @return
	 */
	@RequestMapping("/show/{userId}")
	public List<TbRole> showAuthority(@PathVariable Integer userId){
		 List<TbRole> list = service.showRole(userId);
		return list;
	}
}
