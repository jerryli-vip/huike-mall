package com.supergo.pojo;

import java.io.Serializable;

public class TbRoleAuthority implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1145200779752968705L;

	private Integer roleAuthorityId;

	private Integer authorityId;

	private Integer roleId;

	public Integer getRoleAuthorityId() {
		return roleAuthorityId;
	}

	public void setRoleAuthorityId(Integer roleAuthorityId) {
		this.roleAuthorityId = roleAuthorityId;
	}

	public Integer getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
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