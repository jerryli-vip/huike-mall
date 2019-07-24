package com.supergo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbShopUser;
import com.supergo.service.TbShopUserService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@RestController
@RequestMapping("/shopUser")
public class TbShopUserController {
	@Autowired
	private TbShopUserService service;
	
	/**
	 * 添加用户
	 * @author 王斌
	 * @param shopUser
	 * @return
	 */
	@RequestMapping("/insert")
	public ResultVO addUser(@RequestBody TbShopUser shopUser,HttpSession session) {
		TbShopUser user = (TbShopUser)session.getAttribute("shopUser");
		shopUser.setCreateId(user.getShopUserId());
		shopUser.setUpdateId(shopUser.getCreateId());
		shopUser.setShopId(user.getShopId());
		return service.insertUser(shopUser);
	}
	
	/**
	 * 分页查询
	 * @author 王斌
	 * @param shopUser
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbShopUser> queryUser(@RequestBody TbShopUser shopUser,@PathVariable Integer page, @PathVariable Integer rows,HttpSession session) {
		TbShopUser user = (TbShopUser)session.getAttribute("shopUser");
		shopUser.setShopId(user.getShopId());
		return service.queryUser(page, rows,shopUser);
	}
	
	/**
	 * 修改用户
	 * @author 王斌
	 * @param shopUser
	 * @return
	 */
	@RequestMapping("update")
	public ResultVO updateUser(@RequestBody TbShopUser shopUser,HttpSession session) {
		TbShopUser user = (TbShopUser)session.getAttribute("shopUser");
		shopUser.setUpdateId(user.getShopUserId());
		return service.updateById(shopUser);

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
		role.setType(2);
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
