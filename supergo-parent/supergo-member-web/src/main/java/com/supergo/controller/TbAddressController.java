package com.supergo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbMember;
import com.supergo.service.TbAddressService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 设置之地址管理
 * @author 范江浩
 *
 */
@RestController
@RequestMapping("/address")
public class TbAddressController {

	@Reference
	private TbAddressService addressService;
	
	/**
	 * 个人设置之地址分页查询信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/queryAddress")
	public ResultVO queryAddress(HttpSession session){
		try {
			TbMember aMember = (TbMember)session.getAttribute("member");
			//System.out.println(aMember.getMemberId());
			return addressService.queryAddress(aMember);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultVO.build(500, "数值为空");
		
	}
	/**
	 * 个人设置之添加地址信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/addAddress")
	public ResultVO addAddress(@RequestBody(required = false) TbAddress address,HttpSession session){
		TbMember aMember = (TbMember)session.getAttribute("member");
		return addressService.insertAddress(address,aMember);
		
	}
	/**
	 * 个人设置之删除地址信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/deleteAddress")
	public ResultVO deleteAddress(@RequestBody(required=false) TbAddress address){
		return addressService.deleteAddress(address);
	}
	/**
	 * 个人设置之修改地址信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@RequestMapping("/editAddress")
	public ResultVO editAddress(@RequestBody(required = false) TbAddress address){
		System.out.println("区"+address.getArea());
		return addressService.editAddress(address);
		
	}
	
	/**
	 * 根据会员id查询所属收货地址
	 * @author 陈阳
	 * */
	
	@RequestMapping("/queryAllAddress")
	public ResultVO queryAllAddress(HttpSession session){
		//获取会员id
		/*Integer id = (Integer) session.getAttribute("会员id");*/
		//获取会员id
		// 获取登录人ID
		TbMember tbMember = (TbMember) session.getAttribute("member");
		if(tbMember==null||tbMember.getMemberId()<1){
			return ResultVO.build(500, "未获取到会员信息");
		}
		
		Integer id = tbMember.getMemberId();
		
		PageVO<TbAddress> vo = addressService.queryAllAddress(id);
		if(vo==null||vo.getRows().size()<1){
			return ResultVO.build(500,"你还没有收货地址请添加收货人地址" );
		}
		
		return ResultVO.build(200, "查询成功", vo.getRows());
		
		
		
	}
	@RequestMapping("/editDefault")
	public ResultVO editDefault(@RequestBody(required=false) TbAddress address){
		
		try {
			System.out.println(address.getAddressId());
			return addressService.editDefault(address);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResultVO.build(500, "没有数值");
		
	}
}
