package com.supergo.pojo;

import java.io.Serializable;

public class TbRoleAuthorityKey implements Serializable {

	private static final long serialVersionUID = 3012599458822850242L;

	private Integer authorityId;

	private Integer roleId;

	public Integer getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "TbRoleAuthorityKey [authorityId=" + authorityId + ", roleId=" + roleId + "]";
	}

}