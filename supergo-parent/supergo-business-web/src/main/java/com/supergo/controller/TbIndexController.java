package com.supergo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.ext.TbIndexItemExt;
import com.supergo.service.TbIndexService;

@RestController
@RequestMapping("/index")
public class TbIndexController {
	@Reference
	private TbIndexService service;
	
//	@RequestMapping("/OneItem")
//	public List<TbIndexItemExt> queryOneItem(HttpSession session){
//		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
//		List<TbIndexItemExt> authorityOneItem = service.queryOneItem(user.getUserName());
//		return authorityOneItem;
//	}
//	
//	@RequestMapping("/SecondItem")
//	public List<TbIndexItemExt> querySecondItem(HttpSession session){
//		TbSysuser user = (TbSysuser)session.getAttribute("systemUser");
//		List<TbIndexItemExt> authoritySecond = service.querySecondItem(user.getUserName());
//		return authoritySecond;
//	}
	
	@RequestMapping("/item")
	public List<TbIndexItemExt> queryIndexItem(HttpSession session){
		TbShopUser user = (TbShopUser)session.getAttribute("shopUser");
		List<TbIndexItemExt> authoritySecond = service.indexShopItem(user.getShopUserName());
		return authoritySecond;
	}
}
