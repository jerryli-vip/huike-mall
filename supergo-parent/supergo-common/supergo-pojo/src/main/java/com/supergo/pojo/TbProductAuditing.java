package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbProductAuditing implements Serializable {

	private static final long serialVersionUID = 3923650728271806196L;

	private Integer productAuditingId;

	private Integer productId;

	private String productName;

	private Integer shopId;

	private String status;

	private String reason;

	private Integer sysuserId;

	private Date auditingTime;

	private String isDelete;

	private String createId;

	private Date createTime;

	private String updateId;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getProductAuditingId() {
		return productAuditingId;
	}

	public void setProductAuditingId(Integer productAuditingId) {
		this.productAuditingId = productAuditingId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason == null ? null : reason.trim();
	}

	public Integer getSysuserId() {
		return sysuserId;
	}

	public void setSysuserId(Integer sysuserId) {
		this.sysuserId = sysuserId;
	}

	public Date getAuditingTime() {
		return auditingTime;
	}

	public void setAuditingTime(Date auditingTime) {
		this.auditingTime = auditingTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete == null ? null : isDelete.trim();
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
		return "TbProductAuditing [productAuditingId=" + productAuditingId + ", productId=" + productId
				+ ", productName=" + productName + ", shopId=" + shopId + ", status=" + status + ", reason=" + reason
				+ ", sysuserId=" + sysuserId + ", auditingTime=" + auditingTime + ", isDelete=" + isDelete
				+ ", createId=" + createId + ", createTime=" + createTime + ", updateId=" + updateId + ", updateTime="
				+ updateTime + "]";
	}

}