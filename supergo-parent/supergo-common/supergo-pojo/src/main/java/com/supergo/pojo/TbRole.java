package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbRole implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4884653646950091404L;

	private Integer roleId;

	private String roleName;

	private Integer type;

	private Integer grade;

	private Integer parentId;

	private String roleDescription;

	private String createId;

	private String updateId;

	private Date createTime;

	private Date updateTime;

	private Integer roleAuthority;

	private String isDelete;

	private String bak3;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription == null ? null : roleDescription.trim();
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getRoleAuthority() {
		return roleAuthority;
	}

	public void setRoleAuthority(Integer roleAuthority) {
		this.roleAuthority = roleAuthority;
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

	public String getBak3() {
		return bak3;
	}

	public void setBak3(String bak3) {
		this.bak3 = bak3 == null ? null : bak3.trim();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TbRole [roleId=" + roleId + ", roleName=" + roleName + ", type=" + type + ", grade=" + grade
				+ ", parentId=" + parentId + ", roleDescription=" + roleDescription + ", createId=" + createId
				+ ", updateId=" + updateId + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", roleAuthority=" + roleAuthority + ", isDelete=" + isDelete + ", bak3=" + bak3 + "]";
	}

}