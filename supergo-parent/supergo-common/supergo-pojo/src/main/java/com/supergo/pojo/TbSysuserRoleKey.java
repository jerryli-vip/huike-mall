package com.supergo.pojo;

import java.io.Serializable;

public class TbSysuserRoleKey implements Serializable {

	private static final long serialVersionUID = 2584867924192533847L;

	private Integer sysuserId;

	private Integer roleId;

	public Integer getSysuserId() {
		return sysuserId;
	}

	public void setSysuserId(Integer sysuserId) {
		this.sysuserId = sysuserId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "TbSysuserRoleKey [sysuserId=" + sysuserId + ", roleId=" + roleId + "]";
	}

}