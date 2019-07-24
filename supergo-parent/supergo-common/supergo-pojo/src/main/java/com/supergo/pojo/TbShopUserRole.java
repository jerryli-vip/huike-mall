package com.supergo.pojo;

import java.io.Serializable;

public class TbShopUserRole implements Serializable {

	private static final long serialVersionUID = 3272586883045136895L;

	private Integer shopUserRoleId;
	private Integer shopUserId;
	private Integer roleId;

	/**
	 * @return the shopUserRoleId
	 */
	public Integer getShopUserRoleId() {
		return shopUserRoleId;
	}

	/**
	 * @param shopUserRoleId
	 *            the shopUserRoleId to set
	 */
	public void setShopUserRoleId(Integer shopUserRoleId) {
		this.shopUserRoleId = shopUserRoleId;
	}

	/**
	 * @return the shopUserId
	 */
	public Integer getShopUserId() {
		return shopUserId;
	}

	/**
	 * @param shopUserId
	 *            the shopUserId to set
	 */
	public void setShopUserId(Integer shopUserId) {
		this.shopUserId = shopUserId;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
