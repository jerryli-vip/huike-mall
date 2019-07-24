package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbAuthority implements Serializable {

	private static final long serialVersionUID = 2729109509863139114L;

	private Integer authorityId;

	private String authorityName;

	private String code;

	private String authorityDescription;

	private String url;

	private Integer type;

	private Integer authorityPriority;

	private Integer parentId;

	private String isDelete;

	private String isItem;

	private String createId;

	private String updateId;

	private Date createTime;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName == null ? null : authorityName.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getAuthorityDescription() {
		return authorityDescription;
	}

	public void setAuthorityDescription(String authorityDescription) {
		this.authorityDescription = authorityDescription == null ? null : authorityDescription.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getAuthorityPriority() {
		return authorityPriority;
	}

	public void setAuthorityPriority(Integer authorityPriority) {
		this.authorityPriority = authorityPriority;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete == null ? null : isDelete.trim();
	}

	/**
	 * @return the isItem
	 */
	public String getIsItem() {
		return isItem;
	}

	/**
	 * @param isItem
	 *            the isItem to set
	 */
	public void setIsItem(String isItem) {
		this.isItem = isItem;
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
		return "TbAuthority [authorityId=" + authorityId + ", authorityName=" + authorityName + ", code=" + code
				+ ", authorityDescription=" + authorityDescription + ", url=" + url + ", type=" + type
				+ ", authorityPriority=" + authorityPriority + ", parentId=" + parentId + ", isDelete=" + isDelete
				+ ", isItem=" + isItem + ", createId=" + createId + ", updateId=" + updateId + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", bak1=" + bak1 + ", bak2=" + bak2 + ", bak3=" + bak3
				+ "]";
	}

}