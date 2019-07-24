package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.supergo.pojo.TbSpec;
import com.supergo.pojo.TbTemplate;

public class TbTemplateVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5534519203743205756L;

	private Integer templateId;

	private Integer categoryId;

	private String templateName;

	private List<TbTemplate> brands;

	private List<TbSpec> specs;

	private List<TemplateAttribute> attribute;

	private String isDelete;

	private String status;

	private String createId;

	private Date createTime;

	private String updateId;

	private Date updateTime;

	private String bak1;

	private String bak2;

	private String bak3;

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public List<TbTemplate> getBrands() {
		return brands;
	}

	public void setBrands(List<TbTemplate> brandsList) {
		this.brands = brandsList;
	}

	public List<TbSpec> getSpecs() {
		return specs;
	}

	public void setSpecs(List<TbSpec> specsList) {
		this.specs = specsList;
	}

	public List<TemplateAttribute> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<TemplateAttribute> attribute) {
		this.attribute = attribute;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
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
		this.updateId = updateId;
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
		this.bak1 = bak1;
	}

	public String getBak2() {
		return bak2;
	}

	public void setBak2(String bak2) {
		this.bak2 = bak2;
	}

	public String getBak3() {
		return bak3;
	}

	public void setBak3(String bak3) {
		this.bak3 = bak3;
	}

	public TbTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TbTemplateVO(Integer templateId, Integer categoryId, String templateName, List<TbTemplate> brands,
			List<TbSpec> specs, List<TemplateAttribute> attribute, String isDelete, String status, String createId,
			Date createTime, String updateId, Date updateTime, String bak1, String bak2, String bak3) {
		super();
		this.templateId = templateId;
		this.categoryId = categoryId;
		this.templateName = templateName;
		this.brands = brands;
		this.specs = specs;
		this.attribute = attribute;
		this.isDelete = isDelete;
		this.status = status;
		this.createId = createId;
		this.createTime = createTime;
		this.updateId = updateId;
		this.updateTime = updateTime;
		this.bak1 = bak1;
		this.bak2 = bak2;
		this.bak3 = bak3;
	}

	@Override
	public String toString() {
		return "TbTemplateVO [templateId=" + templateId + ", categoryId=" + categoryId + ", templateName="
				+ templateName + ", brands=" + brands + ", specs=" + specs + ", attribute=" + attribute + ", isDelete="
				+ isDelete + ", status=" + status + ", createId=" + createId + ", createTime=" + createTime
				+ ", updateId=" + updateId + ", updateTime=" + updateTime + ", bak1=" + bak1 + ", bak2=" + bak2
				+ ", bak3=" + bak3 + "]";
	}

}
