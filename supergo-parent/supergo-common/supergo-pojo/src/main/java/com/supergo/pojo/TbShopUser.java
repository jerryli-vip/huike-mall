package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbShopUser implements Serializable {
	private static final long serialVersionUID = 1417676671198089091L;

	private Integer shopUserId;

	private String shopUserName;

	private String shopUserPassword;

	private String cfmPassword;

	private Integer shopId;

	private Integer createId;

	private Date createTime;

	private Integer updateId;

	private Date updateTime;

	private Date lastLoginTime;

	private String isDelete;

	private String bak1;

	private String bak2;

	public Integer getShopUserId() {
		return shopUserId;
	}

	public void setShopUserId(Integer shopUserId) {
		this.shopUserId = shopUserId;
	}

	public String getShopUserName() {
		return shopUserName;
	}

	public void setShopUserName(String shopUserName) {
		this.shopUserName = shopUserName == null ? null : shopUserName.trim();
	}

	public String getShopUserPassword() {
		return shopUserPassword;
	}

	public void setShopUserPassword(String shopUserPassword) {
		this.shopUserPassword = shopUserPassword == null ? null : shopUserPassword.trim();
	}

	/**
	 * @return the cfmPassword
	 */
	public String getCfmPassword() {
		return cfmPassword;
	}

	/**
	 * @param cfmPassword
	 *            the cfmPassword to set
	 */
	public void setCfmPassword(String cfmPassword) {
		this.cfmPassword = cfmPassword;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * @return the isDelete
	 */
	public String getIsDelete() {
		return isDelete;
	}

	/**
	 * @param isDelete
	 *            the isDelete to set
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getBak1() {
		return bak1;
	}

	public void setBak1(String bak1) {
		this.bak1 = bak1 == null ? null : bak1.trim();
	}

	public String getBak2() {
		return bak2;
	}

	public void setBak2(String bak2) {
		this.bak2 = bak2 == null ? null : bak2.trim();
	}

	@Override
	public String toString() {
		return "TbShopUser [shopUserId=" + shopUserId + ", shopUserName=" + shopUserName + ", shopUserPassword="
				+ shopUserPassword + ", shopId=" + shopId + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateId=" + updateId + ", updateTime=" + updateTime + ", lastLoginTime=" + lastLoginTime + "]";
	}

}