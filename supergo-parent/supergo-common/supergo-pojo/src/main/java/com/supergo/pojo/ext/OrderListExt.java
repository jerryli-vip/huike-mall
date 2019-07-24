package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderListExt implements Serializable {

	private static final long serialVersionUID = -6608716195532226497L;

	private String ordersubId;

	private Integer goodsId;

	private String shopName;

	private String goodsName;

	private String goodsType;

	private BigDecimal sellPrice;

	private BigDecimal actualPayment;

	private Integer quantity;

	private BigDecimal paymoney;

	private BigDecimal expressfee;

	private String reciveName;

	private Integer reciveProvince;

	private Integer reciveCity;

	private Integer reciveArea;

	private String reciveAddress;

	private String reciveMobile;

	private String reciveEmail;

	private String postId;

	private String postStatus;

	private BigDecimal postFee;

	private Date postTime;

	private Date deliveryTime;

	private String status;

	private String itemStatus;

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public String getReciveName() {
		return reciveName;
	}

	public void setReciveName(String reciveName) {
		this.reciveName = reciveName;
	}

	public Integer getReciveProvince() {
		return reciveProvince;
	}

	public void setReciveProvince(Integer reciveProvince) {
		this.reciveProvince = reciveProvince;
	}

	public Integer getReciveCity() {
		return reciveCity;
	}

	public void setReciveCity(Integer reciveCity) {
		this.reciveCity = reciveCity;
	}

	public Integer getReciveArea() {
		return reciveArea;
	}

	public void setReciveArea(Integer reciveArea) {
		this.reciveArea = reciveArea;
	}

	public String getReciveAddress() {
		return reciveAddress;
	}

	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}

	public String getReciveMobile() {
		return reciveMobile;
	}

	public void setReciveMobile(String reciveMobile) {
		this.reciveMobile = reciveMobile;
	}

	public String getReciveEmail() {
		return reciveEmail;
	}

	public void setReciveEmail(String reciveEmail) {
		this.reciveEmail = reciveEmail;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public BigDecimal getPostFee() {
		return postFee;
	}

	public void setPostFee(BigDecimal postFee) {
		this.postFee = postFee;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	@Override
	public String toString() {
		return "OrderListExt [ordersubId=" + ordersubId + ", goodsId=" + goodsId + ", shopName=" + shopName
				+ ", goodsName=" + goodsName + ", goodsType=" + goodsType + ", sellPrice=" + sellPrice
				+ ", actualPayment=" + actualPayment + ", quantity=" + quantity + ", paymoney=" + paymoney
				+ ", expressfee=" + expressfee + ", reciveName=" + reciveName + ", reciveProvince=" + reciveProvince
				+ ", reciveCity=" + reciveCity + ", reciveArea=" + reciveArea + ", reciveAddress=" + reciveAddress
				+ ", reciveMobile=" + reciveMobile + ", reciveEmail=" + reciveEmail + ", postId=" + postId
				+ ", postStatus=" + postStatus + ", postFee=" + postFee + ", postTime=" + postTime + ", deliveryTime="
				+ deliveryTime + ", status=" + status + ", itemStatus=" + itemStatus + "]";
	}

}
