package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class TbOrderManage implements Serializable {

	private static final long serialVersionUID = 2324973757462157556L;

	private Integer goodsIds[];

	private Integer goodsId;

	private String goodsName;

	private String itemStatus;

	private String shopName;

	private Integer shopId;

	private String ordersubId;

	private String returnReason;

	private String exchangeReason;

	private String orderStatus;

	private String reciveAddress;

	private String reciveName;

	private String reciveMobile;

	private String orderId;

	private Integer memberId;

	private String memberName;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	private BigDecimal paymoney;

	private String payStatus;

	private Date createTime;
	// 订单状态分类 退货是2 换货是1
	private String statusO;
	// 支付状态分类
	private String statusP;

	private String Ordertime;

	private Date startTime;

	private Date endTime;

	public Integer[] getGoodsIds() {
		return goodsIds;
	}

	public void setGoodsIds(Integer[] goodsIds) {
		this.goodsIds = goodsIds;
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

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getOrdersubId() {
		return ordersubId;
	}

	public void setOrdersubId(String ordersubId) {
		this.ordersubId = ordersubId;
	}

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public String getExchangeReason() {
		return exchangeReason;
	}

	public void setExchangeReason(String exchangeReason) {
		this.exchangeReason = exchangeReason;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getReciveAddress() {
		return reciveAddress;
	}

	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
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

	public BigDecimal getPaymoney() {
		return paymoney;
	}

	public void setPaymoney(BigDecimal paymoney) {
		this.paymoney = paymoney;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatusO() {
		return statusO;
	}

	public void setStatusO(String statusO) {
		this.statusO = statusO;
	}

	public String getStatusP() {
		return statusP;
	}

	public void setStatusP(String statusP) {
		this.statusP = statusP;
	}

	public String getOrdertime() {
		return Ordertime;
	}

	public void setOrdertime(String ordertime) {
		Ordertime = ordertime;
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
		return "TbOrderManage [goodsIds=" + Arrays.toString(goodsIds) + ", goodsId=" + goodsId + ", goodsName="
				+ goodsName + ", itemStatus=" + itemStatus + ", shopName=" + shopName + ", shopId=" + shopId
				+ ", ordersubId=" + ordersubId + ", returnReason=" + returnReason + ", exchangeReason=" + exchangeReason
				+ ", orderStatus=" + orderStatus + ", reciveAddress=" + reciveAddress + ", reciveName=" + reciveName
				+ ", reciveMobile=" + reciveMobile + ", orderId=" + orderId + ", memberId=" + memberId + ", memberName="
				+ memberName + ", paymoney=" + paymoney + ", payStatus=" + payStatus + ", createTime=" + createTime
				+ ", statusO=" + statusO + ", statusP=" + statusP + ", Ordertime=" + Ordertime + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}

}
