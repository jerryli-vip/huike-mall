package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBrand implements Serializable {

	private static final long serialVersionUID = -2105252639695284375L;

	private Integer brandId;

	private String brandName;

	private String brandFirstLetter;

	private String brandLogo;

	private String createId;

	private Date createTime;

	private String updateId;

	private Date updateTime;

	private String isDelete;

	private String status;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName == null ? null : brandName.trim();
	}

	public String getBrandFirstLetter() {
		return brandFirstLetter;
	}

	public void setBrandFirstLetter(String brandFirstLetter) {
		this.brandFirstLetter = brandFirstLetter == null ? null : brandFirstLetter.trim();
	}

	public String getBrandLogo() {
		return brandLogo;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo == null ? null : brandLogo.trim();
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId == null ? null : createId.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId == null ? null : updateId.trim();
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
}