package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbMember;
import com.supergo.service.TbMemberService;
import com.supergo.utils.ResultVO;

/**
 * 设置之地址管理
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/member")
public class TbMemberController {

	@Reference
	private TbMemberService memberService;
	
	/**
	 * 个人设置之个人回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryInfo")
	public ResultVO queryInfo(HttpSession session){
		TbMember member = (TbMember)session.getAttribute("member");
		
		return memberService.queryInfo(member);
		
	}
	
	/**
	 * 个人设置之个人信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/editInfo")
	public ResultVO editInfo(@RequestBody(required = false) TbMember member,HttpSession session){
		try {
			System.out.println(member.getAddress().toString());
			TbMember  aMember= (TbMember)session.getAttribute("member");
			//System.out.println(aMember.getMemberName());
			member.setMemberName(aMember.getMemberName());
			
			return memberService.editInfo(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultVO.build(500, "数值为空");
		
	}
	/**
	 * 个人设置之修改密码信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/editPassword")
	public ResultVO editPassword(@RequestBody(required=false) TbMember member,HttpSession session){
		try {
			System.out.println(member.getPassword());
			TbMember  aMember= (TbMember)session.getAttribute("member");
			member.setMemberName(aMember.getMemberName());
			
			return memberService.editPassword(member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultVO.build(500, "数值为空");
		
	}
	
}
