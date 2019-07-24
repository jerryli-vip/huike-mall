package com.supergo.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbProduct implements Serializable {

	private static final long serialVersionUID = -2162769185848689878L;

	private Integer productId;

	private Integer shopId;

	private String classify1;

	private String classify2;

	private String classify3;

	private String template;

	private String productName;

	private String brand;

	private String subtitle;

	private String packlist;

	private String afterservice;

	private String status;

	private String createId;

	private Date createTime;

	private String updateId;

	private Date updateTime;

	private String isDelete;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getClassify1() {
		return classify1;
	}

	public void setClassify1(String classify1) {
		this.classify1 = classify1 == null ? null : classify1.trim();
	}

	public String getClassify2() {
		return classify2;
	}

	public void setClassify2(String classify2) {
		this.classify2 = classify2 == null ? null : classify2.trim();
	}

	public String getClassify3() {
		return classify3;
	}

	public void setClassify3(String classify3) {
		this.classify3 = classify3 == null ? null : classify3.trim();
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template == null ? null : template.trim();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand == null ? null : brand.trim();
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle == null ? null : subtitle.trim();
	}

	public String getPacklist() {
		return packlist;
	}

	public void setPacklist(String packlist) {
		this.packlist = packlist == null ? null : packlist.trim();
	}

	public String getAfterservice() {
		return afterservice;
	}

	public void setAfterservice(String afterservice) {
		this.afterservice = afterservice == null ? null : afterservice.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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