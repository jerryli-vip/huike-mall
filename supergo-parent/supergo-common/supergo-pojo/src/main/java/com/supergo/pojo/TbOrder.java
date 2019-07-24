package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8872711304310414434L;

	private String orderId;

	private Integer memberId;

	private String address;

	private Date crateTime;

	private Date updateTime;

	private BigDecimal totalmoney;

	private String bak1;

	private String bak2;

	private String bak3;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Date getCrateTime() {
		return crateTime;
	}

	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public BigDecimal getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(BigDecimal totalmoney) {
		this.totalmoney = totalmoney;
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
		return "TbOrder [orderId=" + orderId + ", memberId=" + memberId + ", address=" + address + ", crateTime="
				+ crateTime + ", updateTime=" + updateTime + ", totalmoney=" + totalmoney + ", bak1=" + bak1 + ", bak2="
				+ bak2 + ", bak3=" + bak3 + "]";
	}
}