package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrderItem implements Serializable {
	private static final long serialVersionUID = -2552660904991171420L;

	private Integer orderItemId;

	private String ordersubId;

	private Integer goodsId;

	private String goodsName;

	private String goodsType;

	private BigDecimal sellPrice;

	private BigDecimal actualPayment;

	private Integer quantity;

	private String discount;

	private String payStatus;

	private Date createTime;

	private Date updateTime;

	private Integer createId;

	private Integer updateId;

	private String itemStatus;

	private String bak2;

	private String bak3;

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId == null ? null : ordersubId.trim();
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
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType == null ? null : goodsType.trim();
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount == null ? null : discount.trim();
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus == null ? null : payStatus.trim();
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

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus == null ? null : itemStatus.trim();
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
		return "TbOrderItem [orderItemId=" + orderItemId + ", ordersubId=" + ordersubId + ", goodsId=" + goodsId
				+ ", goodsName=" + goodsName + ", goodsType=" + goodsType + ", sellPrice=" + sellPrice
				+ ", actualPayment=" + actualPayment + ", quantity=" + quantity + ", discount=" + discount
				+ ", payStatus=" + payStatus + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", createId=" + createId + ", updateId=" + updateId + ", itemStatus=" + itemStatus + ", bak2=" + bak2
				+ ", bak3=" + bak3 + "]";
	}
}