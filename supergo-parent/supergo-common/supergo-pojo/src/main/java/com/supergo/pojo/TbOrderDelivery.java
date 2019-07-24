package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrderDelivery implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3969667625883773426L;

	private String deliveryId;

	private String ordersubId;

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

	private String bak1;

	private String bak2;

	private String bak3;

	public String getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId == null ? null : deliveryId.trim();
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId == null ? null : ordersubId.trim();
	}

	public String getReciveName() {
		return reciveName;
	}

	public void setReciveName(String reciveName) {
		this.reciveName = reciveName == null ? null : reciveName.trim();
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
		this.reciveAddress = reciveAddress == null ? null : reciveAddress.trim();
	}

	public String getReciveMobile() {
		return reciveMobile;
	}

	public void setReciveMobile(String reciveMobile) {
		this.reciveMobile = reciveMobile == null ? null : reciveMobile.trim();
	}

	public String getReciveEmail() {
		return reciveEmail;
	}

	public void setReciveEmail(String reciveEmail) {
		this.reciveEmail = reciveEmail == null ? null : reciveEmail.trim();
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId == null ? null : postId.trim();
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus == null ? null : postStatus.trim();
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
		this.status = status == null ? null : status.trim();
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
		return "TbOrderDelivery [deliveryId=" + deliveryId + ", ordersubId=" + ordersubId + ", reciveName=" + reciveName
				+ ", reciveProvince=" + reciveProvince + ", reciveCity=" + reciveCity + ", reciveArea=" + reciveArea
				+ ", reciveAddress=" + reciveAddress + ", reciveMobile=" + reciveMobile + ", reciveEmail=" + reciveEmail
				+ ", postId=" + postId + ", postStatus=" + postStatus + ", postFee=" + postFee + ", postTime="
				+ postTime + ", deliveryTime=" + deliveryTime + ", status=" + status + ", bak1=" + bak1 + ", bak2="
				+ bak2 + ", bak3=" + bak3 + "]";
	}
}