package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbSubOrder implements Serializable {
	private static final long serialVersionUID = -2708386243034899822L;

	private String ordersubId;

	private String orderId;

	private Integer memberId;

	private String shopId;

	private String shopName;

	private Date createTime;

	private Date payTime;

	private BigDecimal paymoney;

	private String address;

	private BigDecimal expressfee;

	private String orderStatus;

	private String payStatus;

	private String payModel;

	private Date updateTime;

	private Integer createId;

	private Integer updateId;

	private String statusO;

	private String bak2;

	private String bak3;

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId == null ? null : ordersubId.trim();
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId == null ? null : shopId.trim();
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public BigDecimal getPaymoney() {
		return paymoney;
	}

	public void setPaymoney(BigDecimal paymoney) {
		this.paymoney = paymoney;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public BigDecimal getExpressfee() {
		return expressfee;
	}

	public void setExpressfee(BigDecimal expressfee) {
		this.expressfee = expressfee;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus == null ? null : orderStatus.trim();
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus == null ? null : payStatus.trim();
	}

	public String getPayModel() {
		return payModel;
	}

	public void setPayModel(String payModel) {
		this.payModel = payModel == null ? null : payModel.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

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

	public String getStatusO() {
		return statusO;
	}

	public void setStatusO(String statusO) {
		this.statusO = statusO == null ? null : statusO.trim();
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
		return "TbSubOrder [ordersubId=" + ordersubId + ", orderId=" + orderId + ", memberId=" + memberId + ", shopId="
				+ shopId + ", shopName=" + shopName + ", createTime=" + createTime + ", payTime=" + payTime
				+ ", paymoney=" + paymoney + ", address=" + address + ", expressfee=" + expressfee + ", orderStatus="
				+ orderStatus + ", payStatus=" + payStatus + ", payModel=" + payModel + ", updateTime=" + updateTime
				+ ", createId=" + createId + ", updateId=" + updateId + ", statusO=" + statusO + "]";
	}

}