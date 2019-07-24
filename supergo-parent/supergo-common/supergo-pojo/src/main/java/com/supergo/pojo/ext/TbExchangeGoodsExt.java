package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbExchangeGoodsExt implements Serializable {

	private static final long serialVersionUID = 8877179623211671421L;

	private String exchangeGoodsId;

	private String ordersubId;

	private String tbOrder;

	private String auditStatus;

	private Date applyTime;

	private String exchangeGoodsStatus;

	private Date exchangeGoodsTime;

	private Integer goodsId;

	private String goodsName;

	private Integer memberId;
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

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	private BigDecimal sellPrice;

	private BigDecimal actualPayment;

	private String reciveName;

	private String reciveMobile;

	private String shopName;

	private String exchangeReason;

	private Date startTime;

	private Date endTime;

	public String getExchangeGoodsId() {
		return exchangeGoodsId;
	}

	public void setExchangeGoodsId(String exchangeGoodsId) {
		this.exchangeGoodsId = exchangeGoodsId;
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

	public String getExchangeGoodsStatus() {
		return exchangeGoodsStatus;
	}

	public void setExchangeGoodsStatus(String exchangeGoodsStatus) {
		this.exchangeGoodsStatus = exchangeGoodsStatus;
	}

	public Date getExchangeGoodsTime() {
		return exchangeGoodsTime;
	}

	public void setExchangeGoodsTime(Date exchangeGoodsTime) {
		this.exchangeGoodsTime = exchangeGoodsTime;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public BigDecimal getActualPayment() {
		return actualPayment;
	}

	public void setActualPayment(BigDecimal actualPayment) {
		this.actualPayment = actualPayment;
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

	public String getExchangeReason() {
		return exchangeReason;
	}

	public void setExchangeReason(String exchangeReason) {
		this.exchangeReason = exchangeReason;
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
		return "TbExchangeGoodsExt [exchangeGoodsId=" + exchangeGoodsId + ", ordersubId=" + ordersubId + ", tbOrder="
				+ tbOrder + ", auditStatus=" + auditStatus + ", applyTime=" + applyTime + ", exchangeGoodsStatus="
				+ exchangeGoodsStatus + ", exchangeGoodsTime=" + exchangeGoodsTime + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", memberId=" + memberId + ", createId=" + createId + ", updateId="
				+ updateId + ", sellPrice=" + sellPrice + ", actualPayment=" + actualPayment + ", reciveName="
				+ reciveName + ", reciveMobile=" + reciveMobile + ", shopName=" + shopName + ", exchangeReason="
				+ exchangeReason + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
