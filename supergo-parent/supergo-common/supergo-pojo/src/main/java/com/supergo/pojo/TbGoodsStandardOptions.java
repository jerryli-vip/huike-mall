package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbGoodsStandardOptions implements Serializable {
	private static final long serialVersionUID = 6764914880181626537L;

	private Integer id;

	private Integer standardId;

	private String standardOptionName;

	private Integer sort;

	private Integer createId;

	private Date createTime;

	private Integer updateId;

	private Date updateTime;

	private String isDelete;

	private String status;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStandardId() {
		return standardId;
	}

	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
	}

	public String getStandardOptionName() {
		return standardOptionName;
	}

	public void setStandardOptionName(String standardOptionName) {
		this.standardOptionName = standardOptionName == null ? null : standardOptionName.trim();
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
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

	@Override
	public String toString() {
		return "TbGoodsStandardOptions [id=" + id + ", standardId=" + standardId + ", standardOptionName="
				+ standardOptionName + ", sort=" + sort + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateId=" + updateId + ", updateTime=" + updateTime + ", isDelete=" + isDelete + ", status="
				+ status + "]";
	}

}