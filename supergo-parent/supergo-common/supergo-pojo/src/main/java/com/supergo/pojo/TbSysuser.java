package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbSysuser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3879907404285293080L;

	private Integer sysuserId;

	private String userName;

	private String password;

	private String cfmPassword;

	private Date createTime;

	private Date lastTime;

	private String name;

	private String createId;

	private String updateId;

	private Date updateTime;

	private String isDelete;

	private String status;

	private Integer systemRoleId;

	private String mobile;

	private String headPortrait;

	public Integer getSysuserId() {
		return sysuserId;
	}

	public void setSysuserId(Integer sysuserId) {
		this.sysuserId = sysuserId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete == null ? null : isDelete.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Integer getSystemRoleId() {
		return systemRoleId;
	}

	public void setSystemRoleId(Integer systemRoleId) {
		this.systemRoleId = systemRoleId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * @return the headPortrait
	 */
	public String getHeadPortrait() {
		return headPortrait;
	}

	/**
	 * @param headPortrait
	 *            the headPortrait to set
	 */
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

}