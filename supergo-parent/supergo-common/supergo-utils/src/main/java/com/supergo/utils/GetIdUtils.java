package com.supergo.utils;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import com.supergo.pojo.TbShopUser;

public class GetIdUtils {
	
	/**
	 * 获取店铺Id
	 * @param session
	 * @return
	 */
	public static Integer getShopId(HttpSession session) {
		Object attribute = session.getAttribute("shopUser");
		TbShopUser user = null;
		if (attribute != null) {
			user = (TbShopUser) attribute;
		}
		System.out.println("user servlet" + user);
		if (user == null || StringUtils.isEmpty(user.getShopUserName())) {
			return null;
		}
		return user.getShopId();
	}
	
	/**
	 * 获取后台用户Id
	 * @param session
	 * @return
	 */
	public static Integer getShopUserId(HttpSession session) {
		Object attribute = session.getAttribute("shopUser");
		TbShopUser user = null;
		if (attribute != null) {
			user = (TbShopUser) attribute;
		}
		System.out.println("user servlet" + user);
		if (user == null || StringUtils.isEmpty(user.getShopUserName())) {
			return null;
		}
		return user.getShopUserId();
	}
}
