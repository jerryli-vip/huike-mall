package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TdFootmark implements Serializable {

	private static final long serialVersionUID = -1673805474379336316L;

	private Integer footmarkId;

	private Integer userId;

	private Integer productId;

	private BigDecimal price;

	private String introduce;

	private String status;

	private Integer createId;

	private Date createTime;

	private String uodateId;

	private Date udpateTime;

	private String footmarkDeletet;

	private String footmarkRemaks1;

	private String footmarkRemaks2;

	private String footmarkRemaks3;

	public Integer getFootmarkId() {
		return footmarkId;
	}

	public void setFootmarkId(Integer footmarkId) {
		this.footmarkId = footmarkId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce == null ? null : introduce.trim();
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

	public String getUodateId() {
		return uodateId;
	}

	public void setUodateId(String uodateId) {
		this.uodateId = uodateId == null ? null : uodateId.trim();
	}

	public Date getUdpateTime() {
		return udpateTime;
	}

	public void setUdpateTime(Date udpateTime) {
		this.udpateTime = udpateTime;
	}

	public String getFootmarkDeletet() {
		return footmarkDeletet;
	}

	public void setFootmarkDeletet(String footmarkDeletet) {
		this.footmarkDeletet = footmarkDeletet == null ? null : footmarkDeletet.trim();
	}

	public String getFootmarkRemaks1() {
		return footmarkRemaks1;
	}

	public void setFootmarkRemaks1(String footmarkRemaks1) {
		this.footmarkRemaks1 = footmarkRemaks1 == null ? null : footmarkRemaks1.trim();
	}

	public String getFootmarkRemaks2() {
		return footmarkRemaks2;
	}

	public void setFootmarkRemaks2(String footmarkRemaks2) {
		this.footmarkRemaks2 = footmarkRemaks2 == null ? null : footmarkRemaks2.trim();
	}

	public String getFootmarkRemaks3() {
		return footmarkRemaks3;
	}

	public void setFootmarkRemaks3(String footmarkRemaks3) {
		this.footmarkRemaks3 = footmarkRemaks3 == null ? null : footmarkRemaks3.trim();
	}

	@Override
	public String toString() {
		return "TdFootmark [footmarkId=" + footmarkId + ", userId=" + userId + ", productId=" + productId + ", price="
				+ price + ", introduce=" + introduce + ", status=" + status + ", createId=" + createId + ", createTime="
				+ createTime + ", uodateId=" + uodateId + ", udpateTime=" + udpateTime + ", footmarkDeletet="
				+ footmarkDeletet + "]";
	}

}