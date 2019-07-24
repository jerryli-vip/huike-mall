package com.supergo.pojo.ext;

import java.util.List;

import com.supergo.pojo.TbRole;

public class TbRoleExt extends TbRole {
	private static final long serialVersionUID = -3371061011695456047L;
	private String name;
	private List<TbRoleExt> child;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public List<TbRoleExt> getChild() {
		return child;
	}

	public void setChild(List<TbRoleExt> child) {
		this.child = child;
	}
}
