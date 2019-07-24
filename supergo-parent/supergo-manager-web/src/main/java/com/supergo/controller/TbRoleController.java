package com.supergo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbSysuser;
import com.supergo.service.TbRoleService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/role")
public class TbRoleController {

	@Autowired
	private TbRoleService service;
	
	/**
	 * 角色添加
	 * @author 王斌
	 * @param role
	 * @param session
	 * @return
	 */
	@RequestMapping("/insert")
	public ResultVO addRole(@RequestBody TbRole role,HttpSession session) {
		role.setType(1);
		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
		role.setCreateId(user.getUserName());
		role.setUpdateId(role.getCreateId());
		return service.insertRole(role);
	}
	
	/**
	 * 角色查询
	 * @author 王斌
	 * @param role
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbRole> queryRole(@RequestBody TbRole role,@PathVariable Integer page, @PathVariable Integer rows) {
		role.setType(1);
		return service.queryRole(page,rows,role);
	}
	
	/**
	 * 删除角色
	 * @author王斌
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public ResultVO batchDeleteRole(@RequestBody Integer[] ids) {
		return service.deleteManagerRole(ids);
	}
	
	/**
	 * 更新角色
	 * @author 王斌
	 * @param role
	 * @param session
	 * @return
	 */
	@RequestMapping("/update")
	public ResultVO updateRole(@RequestBody TbRole role,HttpSession session){
		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
		role.setUpdateId(user.getUserName());
		return service.updateRole(role);
	}
	
	/**
	 * 角色授权弹出框内容
	 * @author 王斌
	 * @return
	 */
	@RequestMapping("/roleAuthority")
	public List<TbAuthority> roleAuthority(){
		Integer type = 1;
		return service.queryAuthority(type);
	}
	
	/**
	 * 角色授权
	 * @author 王斌
	 * @param authorityIds
	 * @param roleId
	 * @return
	 */
	@RequestMapping("/accredit/{roleId}")
	public ResultVO accredit(@RequestBody Integer[] authorityIds,@PathVariable Integer roleId){
		System.out.println(roleId);
		for (Integer id : authorityIds) {
			System.out.println("用户"+id);
		}
		return service.accredit(authorityIds,roleId);
	}
	
	/**
	 * 查看角色权限
	 * @author 王斌
	 * @param roleId
	 * @return
	 */
	@RequestMapping("/show/{roleId}")
	public List<TbAuthority> showAuthority(@PathVariable Integer roleId){
		 List<TbAuthority> list = service.showAuthority(roleId);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping("/parent")
	public List<TbRole> showParentRole(){
		Integer type = 1;
		return service.showParentRole(type);
	}
}
