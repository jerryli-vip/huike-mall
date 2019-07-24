package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBusinessLog implements Serializable {

	private static final long serialVersionUID = -7333556310101614821L;

	private Integer businesslogId;

	private String businessName;

	private String auditingName;

	private Integer auditingStatus;

	private String reason;

	private String createId;

	private Date createTime;

	private String updateId;

	private Date updateTime;

	private String isDelete;

	private String status;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getBusinesslogId() {
		return businesslogId;
	}

	public void setBusinesslogId(Integer businesslogId) {
		this.businesslogId = businesslogId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName == null ? null : businessName.trim();
	}

	public String getAuditingName() {
		return auditingName;
	}

	public void setAuditingName(String auditingName) {
		this.auditingName = auditingName == null ? null : auditingName.trim();
	}

	public Integer getAuditingStatus() {
		return auditingStatus;
	}

	public void setAuditingStatus(Integer auditingStatus) {
		this.auditingStatus = auditingStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason == null ? null : reason.trim();
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId == null ? null : createId.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId == null ? null : updateId.trim();
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
}