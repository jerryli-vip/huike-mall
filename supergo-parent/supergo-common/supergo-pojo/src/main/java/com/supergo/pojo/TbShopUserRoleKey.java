package com.supergo.pojo;

import java.io.Serializable;

public class TbShopUserRoleKey implements Serializable {

	private static final long serialVersionUID = 4728322791940241585L;

	private Integer shopUserId;

	private Integer roleId;

	public Integer getShopUserId() {
		return shopUserId;
	}

	public void setShopUserId(Integer shopUserId) {
		this.shopUserId = shopUserId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "TbShopUserRoleKey [shopUserId=" + shopUserId + ", roleId=" + roleId + "]";
	}

}