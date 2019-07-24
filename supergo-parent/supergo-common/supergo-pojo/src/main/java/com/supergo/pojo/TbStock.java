package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbStock implements Serializable {

	private static final long serialVersionUID = 6090441989173475616L;

	private Integer goodsId;

	private Integer inventory;

	private Integer createid;

	private Date createtime;

	private Integer updateUser;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Integer getCreateid() {
		return createid;
	}

	public void setCreateid(Integer createid) {
		this.createid = createid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
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
		return "TbStock [goodsId=" + goodsId + ", inventory=" + inventory + ", createid=" + createid + ", createtime="
				+ createtime + ", updateUser=" + updateUser + ", updateTime=" + updateTime + "]";
	}

}