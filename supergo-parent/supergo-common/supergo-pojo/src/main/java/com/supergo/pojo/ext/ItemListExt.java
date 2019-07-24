package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ItemListExt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7057513497499761347L;

	private Integer goodsId;

	private String goodsName;

	private BigDecimal sellPrice;

	private Integer shopId;

	private List<String> imgPath;

	private String introduce;

	private String extrattribute;

	private String specInfo;

	private Integer templateId;

	private String specs;

	private String template;

	private Integer specId;

	private String specName;

	private String optionName;

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

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public List<String> getImgPath() {
		return imgPath;
	}

	public void setImgPath(List<String> imgPath) {
		this.imgPath = imgPath;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getExtrattribute() {
		return extrattribute;
	}

	public void setExtrattribute(String extrattribute) {
		this.extrattribute = extrattribute;
	}

	public String getSpecInfo() {
		return specInfo;
	}

	public void setSpecInfo(String specInfo) {
		this.specInfo = specInfo;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public Integer getSpecId() {
		return specId;
	}

	public void setSpecId(Integer specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	@Override
	public String toString() {
		return "ItemListExt [goodsId=" + goodsId + ", goodsName=" + goodsName + ", sellPrice=" + sellPrice + ", shopId="
				+ shopId + ", imgPath=" + imgPath + ", introduce=" + introduce + ", extrattribute=" + extrattribute
				+ ", specInfo=" + specInfo + ", templateId=" + templateId + ", specs=" + specs + ", template="
				+ template + ", specId=" + specId + ", specName=" + specName + ", optionName=" + optionName + "]";
	}

}
