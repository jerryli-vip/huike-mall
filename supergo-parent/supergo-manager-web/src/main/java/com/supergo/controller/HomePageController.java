package com.supergo.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbSysuser;
import com.supergo.pojo.ext.TbIndexItemExt;
import com.supergo.service.TbIndexService;

/**
 * 平台管理系统--首页
 * 
 * @author think
 *
 */
@RestController
@RequestMapping("/homepage")
public class HomePageController {
	@Reference
	private TbIndexService service;

	@RequestMapping("/menus")
	public List<TbIndexItemExt> queryIndexItem(HttpSession session) {
		TbSysuser user = (TbSysuser) session.getAttribute("systemUser");
		List<TbIndexItemExt> authoritySecond = service.indexOperatorItem(user.getUserName());
		return authoritySecond;
	}
}
