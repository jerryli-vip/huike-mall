package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbReturnItem implements Serializable {
	private static final long serialVersionUID = 752953117699854725L;

	private Integer returnItemId;

	private Integer returnGoodsId;

	private Integer orderItemId;

	private Integer goodsId;

	private String ordersubId;

	private String goodsName;

	private String reciveName;

	private String reciveMobile;

	private Integer shopId;

	private String shopName;

	private BigDecimal sellPrice;

	private BigDecimal actualPayment;

	private Integer quantity;

	private Date createTime;

	private Integer createId;

	private Integer updateId;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getReturnItemId() {
		return returnItemId;
	}

	public void setReturnItemId(Integer returnItemId) {
		this.returnItemId = returnItemId;
	}

	public Integer getReturnGoodsId() {
		return returnGoodsId;
	}

	public void setReturnGoodsId(Integer returnGoodsId) {
		this.returnGoodsId = returnGoodsId;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId == null ? null : ordersubId.trim();
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName == null ? null : goodsName.trim();
	}

	public String getReciveName() {
		return reciveName;
	}

	public void setReciveName(String reciveName) {
		this.reciveName = reciveName == null ? null : reciveName.trim();
	}

	public String getReciveMobile() {
		return reciveMobile;
	}

	public void setReciveMobile(String reciveMobile) {
		this.reciveMobile = reciveMobile == null ? null : reciveMobile.trim();
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName == null ? null : shopName.trim();
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
		return "TbReturnItem [returnItemId=" + returnItemId + ", returnGoodsId=" + returnGoodsId + ", orderItemId="
				+ orderItemId + ", goodsId=" + goodsId + ", ordersubId=" + ordersubId + ", goodsName=" + goodsName
				+ ", reciveName=" + reciveName + ", reciveMobile=" + reciveMobile + ", shopId=" + shopId + ", shopName="
				+ shopName + ", sellPrice=" + sellPrice + ", actualPayment=" + actualPayment + ", quantity=" + quantity
				+ ", createTime=" + createTime + ", createId=" + createId + ", updateId=" + updateId + ", updateTime="
				+ updateTime + ", bak1=" + bak1 + ", bak2=" + bak2 + ", bak3=" + bak3 + "]";
	}

}