package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBusiness implements Serializable {

	private static final long serialVersionUID = -7843374258507453203L;

	private Integer businessId;

	private Integer defaultShopId;

	private String defaultShopName;

	private Integer businessStatus;

	private String phone;

	private String email;

	private String compName;

	private String compMobile;

	private String compPhone;

	private String compAddress;

	private String conName;

	private String conQq;

	private String conMobile;

	private String conEmail;

	private String licenseNum;

	private String taxregistNum;

	private String organNum;

	private String legal;

	private String legalIndentity;

	private String openbank;

	private String obBranch;

	private String bankNum;

	private Integer createid;

	private Date createtime;

	private Integer updateUser;

	private Date updateTime;

	private String isDelete;

	private String status;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getDefaultShopId() {
		return defaultShopId;
	}

	public void setDefaultShopId(Integer defaultShopId) {
		this.defaultShopId = defaultShopId;
	}

	public String getDefaultShopName() {
		return defaultShopName;
	}

	public void setDefaultShopName(String defaultShopName) {
		this.defaultShopName = defaultShopName == null ? null : defaultShopName.trim();
	}

	public Integer getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(Integer businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName == null ? null : compName.trim();
	}

	public String getCompMobile() {
		return compMobile;
	}

	public void setCompMobile(String compMobile) {
		this.compMobile = compMobile == null ? null : compMobile.trim();
	}

	public String getCompPhone() {
		return compPhone;
	}

	public void setCompPhone(String compPhone) {
		this.compPhone = compPhone == null ? null : compPhone.trim();
	}

	public String getCompAddress() {
		return compAddress;
	}

	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress == null ? null : compAddress.trim();
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName == null ? null : conName.trim();
	}

	public String getConQq() {
		return conQq;
	}

	public void setConQq(String conQq) {
		this.conQq = conQq == null ? null : conQq.trim();
	}

	public String getConMobile() {
		return conMobile;
	}

	public void setConMobile(String conMobile) {
		this.conMobile = conMobile == null ? null : conMobile.trim();
	}

	public String getConEmail() {
		return conEmail;
	}

	public void setConEmail(String conEmail) {
		this.conEmail = conEmail == null ? null : conEmail.trim();
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum == null ? null : licenseNum.trim();
	}

	public String getTaxregistNum() {
		return taxregistNum;
	}

	public void setTaxregistNum(String taxregistNum) {
		this.taxregistNum = taxregistNum == null ? null : taxregistNum.trim();
	}

	public String getOrganNum() {
		return organNum;
	}

	public void setOrganNum(String organNum) {
		this.organNum = organNum == null ? null : organNum.trim();
	}

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal == null ? null : legal.trim();
	}

	public String getLegalIndentity() {
		return legalIndentity;
	}

	public void setLegalIndentity(String legalIndentity) {
		this.legalIndentity = legalIndentity == null ? null : legalIndentity.trim();
	}

	public String getOpenbank() {
		return openbank;
	}

	public void setOpenbank(String openbank) {
		this.openbank = openbank == null ? null : openbank.trim();
	}

	public String getObBranch() {
		return obBranch;
	}

	public void setObBranch(String obBranch) {
		this.obBranch = obBranch == null ? null : obBranch.trim();
	}

	public String getBankNum() {
		return bankNum;
	}

	public void setBankNum(String bankNum) {
		this.bankNum = bankNum == null ? null : bankNum.trim();
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