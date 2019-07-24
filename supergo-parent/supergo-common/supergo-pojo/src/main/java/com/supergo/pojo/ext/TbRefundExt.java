package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.Date;

public class TbRefundExt implements Serializable {

	private static final long serialVersionUID = 1944011949119083142L;

	private String refundId;

	private String returnGoodsId;

	private String ordersubId;

	private String tbOrder;

	private String auditStatus;

	private Date applyTime;

	private String returnGoodsStatus;

	private Date returnGoodsTime;

	private String reciveName;

	private String reciveMobile;

	private String shopName;

	private String returnReason;

	private Date startTime;

	private Date endTime;

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getReturnGoodsId() {
		return returnGoodsId;
	}

	public void setReturnGoodsId(String returnGoodsId) {
		this.returnGoodsId = returnGoodsId;
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId;
	}

	public String getTbOrder() {
		return tbOrder;
	}

	public void setTbOrder(String tbOrder) {
		this.tbOrder = tbOrder;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getReturnGoodsStatus() {
		return returnGoodsStatus;
	}

	public void setReturnGoodsStatus(String returnGoodsStatus) {
		this.returnGoodsStatus = returnGoodsStatus;
	}

	public Date getReturnGoodsTime() {
		return returnGoodsTime;
	}

	public void setReturnGoodsTime(Date returnGoodsTime) {
		this.returnGoodsTime = returnGoodsTime;
	}

	public String getReciveName() {
		return reciveName;
	}

	public void setReciveName(String reciveName) {
		this.reciveName = reciveName;
	}

	public String getReciveMobile() {
		return reciveMobile;
	}

	public void setReciveMobile(String reciveMobile) {
		this.reciveMobile = reciveMobile;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "TbRefundExt [refundId=" + refundId + ", returnGoodsId=" + returnGoodsId + ", ordersubId=" + ordersubId
				+ ", tbOrder=" + tbOrder + ", auditStatus=" + auditStatus + ", applyTime=" + applyTime
				+ ", returnGoodsStatus=" + returnGoodsStatus + ", returnGoodsTime=" + returnGoodsTime + ", reciveName="
				+ reciveName + ", reciveMobile=" + reciveMobile + ", shopName=" + shopName + ", returnReason="
				+ returnReason + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
