package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TdCollection implements Serializable {

	private static final long serialVersionUID = 8130465588558386964L;

	private Integer collectionId;

	private Integer memberId;

	private Integer goodsId;

	private BigDecimal price;

	private String status;

	private Integer createId;

	private Date createTime;

	private Integer updateId;

	private Date updateTime;

	private String isDelete;

	private String collectionRemaks1;

	private String collectionRemaks2;

	private String collectionRemaks3;

	public Integer getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete == null ? null : isDelete.trim();
	}

	public String getCollectionRemaks1() {
		return collectionRemaks1;
	}

	public void setCollectionRemaks1(String collectionRemaks1) {
		this.collectionRemaks1 = collectionRemaks1 == null ? null : collectionRemaks1.trim();
	}

	public String getCollectionRemaks2() {
		return collectionRemaks2;
	}

	public void setCollectionRemaks2(String collectionRemaks2) {
		this.collectionRemaks2 = collectionRemaks2 == null ? null : collectionRemaks2.trim();
	}

	public String getCollectionRemaks3() {
		return collectionRemaks3;
	}

	public void setCollectionRemaks3(String collectionRemaks3) {
		this.collectionRemaks3 = collectionRemaks3 == null ? null : collectionRemaks3.trim();
	}

	@Override
	public String toString() {
		return "TdCollection [collectionId=" + collectionId + ", memberId=" + memberId + ", goodsId=" + goodsId
				+ ", price=" + price + ", status=" + status + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateId=" + updateId + ", updateTime=" + updateTime + ", isDelete=" + isDelete + "]";
	}

}