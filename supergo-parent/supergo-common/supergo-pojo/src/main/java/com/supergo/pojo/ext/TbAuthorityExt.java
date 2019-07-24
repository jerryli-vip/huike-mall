package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

import com.supergo.pojo.TbAuthority;

public class TbAuthorityExt extends TbAuthority implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -100309826071111266L;
	private List<TbAuthority> child;

	/**
	 * @return the child
	 */
	public List<TbAuthority> getChild() {
		return child;
	}

	/**
	 * @param child
	 *            the child to set
	 */
	public void setChild(List<TbAuthority> child) {
		this.child = child;
	}

}
