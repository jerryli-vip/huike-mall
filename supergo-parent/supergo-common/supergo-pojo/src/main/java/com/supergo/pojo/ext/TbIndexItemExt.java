package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

public class TbIndexItemExt implements Serializable {

	private static final long serialVersionUID = -6046311163470933709L;

	private Integer itemId; // 菜单id
	private String itemName; // 一级菜单
	private String grade; // 菜单等级
	private String url; // 菜单URL
	private List<TbIndexItemExt> second; // 二级菜单

	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the second
	 */
	public List<TbIndexItemExt> getSecond() {
		return second;
	}

	/**
	 * @param second
	 *            the second to set
	 */
	public void setSecond(List<TbIndexItemExt> second) {
		this.second = second;
	}

}
