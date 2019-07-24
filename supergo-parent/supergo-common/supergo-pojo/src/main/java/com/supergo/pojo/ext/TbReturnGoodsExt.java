package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbReturnGoodsExt implements Serializable {
	private static final long serialVersionUID = -6307504042963045187L;

	private Integer returnGoodsId;

	private String ordersubId;

	private Integer memberId;

	private String tbOrder;

	private Integer goodsId;

	private String goodsName;

	private String returnReason; // 退货原因

	private BigDecimal sellPrice;

	private String reciveName;

	private String reciveMobile;

	private BigDecimal actualPayment;

	private String auditStatus;

	private Date applyTime;

	private String returnGoodsStatus;

	private Date returnGoodsTime;

	private String shopName;

	private Date startTime;

	private Date endTime;
	private Integer createId;
	private Integer updateId;

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

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
		this.ordersubId = ordersubId;
	}

	public String getTbOrder() {
		return tbOrder;
	}

	public void setTbOrder(String tbOrder) {
		this.tbOrder = tbOrder;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
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

	public BigDecimal getActualPayment() {
		return actualPayment;
	}

	public void setActualPayment(BigDecimal actualPayment) {
		this.actualPayment = actualPayment;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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
		return "TbReturnGoodsExt [returnGoodsId=" + returnGoodsId + ", ordersubId=" + ordersubId + ", memberId="
				+ memberId + ", tbOrder=" + tbOrder + ", goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", returnReason=" + returnReason + ", sellPrice=" + sellPrice + ", reciveName=" + reciveName
				+ ", reciveMobile=" + reciveMobile + ", actualPayment=" + actualPayment + ", auditStatus=" + auditStatus
				+ ", applyTime=" + applyTime + ", returnGoodsStatus=" + returnGoodsStatus + ", returnGoodsTime="
				+ returnGoodsTime + ", shopName=" + shopName + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", createId=" + createId + ", updateId=" + updateId + "]";
	}

}
