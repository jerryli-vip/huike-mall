package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbReturnGoods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4818193706882690580L;

	private Integer returnGoodsId;

	private String ordersubId;

	private String tbOrder;

	private String returnReason;

	private String auditStatus;

	private Date applyTime;

	private String returnGoodsStatus;

	private Date returnGoodsTime;

	private Integer createId;

	private Date createTime;

	private Integer updateId;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getReturnGoodsId() {
		return returnGoodsId;
	}

	public void setReturnGoodsId(Integer returnGoodsId) {
		this.returnGoodsId = returnGoodsId;
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId == null ? null : ordersubId.trim();
	}

	public String getTbOrder() {
		return tbOrder;
	}

	public void setTbOrder(String tbOrder) {
		this.tbOrder = tbOrder == null ? null : tbOrder.trim();
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason == null ? null : returnReason.trim();
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus == null ? null : auditStatus.trim();
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
		this.returnGoodsStatus = returnGoodsStatus == null ? null : returnGoodsStatus.trim();
	}

	public Date getReturnGoodsTime() {
		return returnGoodsTime;
	}

	public void setReturnGoodsTime(Date returnGoodsTime) {
		this.returnGoodsTime = returnGoodsTime;
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
		return "TbReturnGoods [returnGoodsId=" + returnGoodsId + ", ordersubId=" + ordersubId + ", tbOrder=" + tbOrder
				+ ", returnReason=" + returnReason + ", auditStatus=" + auditStatus + ", applyTime=" + applyTime
				+ ", returnGoodsStatus=" + returnGoodsStatus + ", returnGoodsTime=" + returnGoodsTime + ", createId="
				+ createId + ", createTime=" + createTime + ", updateId=" + updateId + ", updateTime=" + updateTime
				+ ", bak1=" + bak1 + ", bak2=" + bak2 + ", bak3=" + bak3 + "]";
	}

}