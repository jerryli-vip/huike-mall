package com.supergo.pojo;

import java.io.Serializable;

public class TbSysuserRole implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2033648334814034324L;

	private Integer sysuserRoleId;

	private Integer sysuserId;

	private Integer roleId;

	public Integer getSysuserRoleId() {
		return sysuserRoleId;
	}

	public void setSysuserRoleId(Integer sysuserRoleId) {
		this.sysuserRoleId = sysuserRoleId;
	}

	/**
	 * @return the sysuserId
	 */
	public Integer getSysuserId() {
		return sysuserId;
	}

	/**
	 * @param sysuserId
	 *            the sysuserId to set
	 */
	public void setSysuserId(Integer sysuserId) {
		this.sysuserId = sysuserId;
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