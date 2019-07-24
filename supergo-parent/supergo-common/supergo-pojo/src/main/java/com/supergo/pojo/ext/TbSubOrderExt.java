package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.supergo.pojo.TbOrderItem;

public class TbSubOrderExt implements Serializable {
	private static final long serialVersionUID = 8133118112240422914L;

	private String ordersubId;

	private String orderId;

	private Integer memberId;

	private String shopId;

	private String shopName;

	private Date createTime;

	private Date payTime;

	private BigDecimal paymoney;

	private BigDecimal expressfee;

	private String orderStatus;

	private String payStatus;

	private String payModel;

	private Date updateTime;

	private Integer createId;

	private Integer updateId;

	private List<TbOrderItem> itemList;

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
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
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayModel() {
		return payModel;
	}

	public void setPayModel(String payModel) {
		this.payModel = payModel;
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

	public List<TbOrderItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<TbOrderItem> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "TbSubOrderExt [ordersubId=" + ordersubId + ", orderId=" + orderId + ", memberId=" + memberId
				+ ", shopId=" + shopId + ", shopName=" + shopName + ", createTime=" + createTime + ", payTime="
				+ payTime + ", paymoney=" + paymoney + ", expressfee=" + expressfee + ", orderStatus=" + orderStatus
				+ ", payStatus=" + payStatus + ", payModel=" + payModel + ", updateTime=" + updateTime + ", createId="
				+ createId + ", updateId=" + updateId + ", itemList=" + itemList + "]";
	}

}
