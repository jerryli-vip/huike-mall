package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TbTemplateExt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer templateId;

	private Integer categoryId;

	private String templateName;

	private List<Map<String, String>> brands;

	private List<Map<String, String>> specs;

	private List<Map<String, String>> attribute;

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

	public List<Map<String, String>> getBrands() {
		return brands;
	}

	public void setBrands(List<Map<String, String>> brands) {
		this.brands = brands;
	}

	public List<Map<String, String>> getSpecs() {
		return specs;
	}

	public void setSpecs(List<Map<String, String>> specs) {
		this.specs = specs;
	}

	public List<Map<String, String>> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<Map<String, String>> attribute) {
		this.attribute = attribute;
	}

	public TbTemplateExt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TbTemplateExt(Integer templateId, Integer categoryId, String templateName, List<Map<String, String>> brands,
			List<Map<String, String>> specs, List<Map<String, String>> attribute) {
		super();
		this.templateId = templateId;
		this.categoryId = categoryId;
		this.templateName = templateName;
		this.brands = brands;
		this.specs = specs;
		this.attribute = attribute;
	}

	@Override
	public String toString() {
		return "TbTemplateExt [templateId=" + templateId + ", categoryId=" + categoryId + ", templateName="
				+ templateName + ", brands=" + brands + ", specs=" + specs + ", attribute=" + attribute + "]";
	}

}
