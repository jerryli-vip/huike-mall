package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 存规格选项的笛卡尔积
 * 
 * @author leosam
 *
 */
public class OptionDecare implements Serializable {
	private static final long serialVersionUID = 832312696046371907L;
	private Integer id;
	private Integer specId1;
	private String specName1;
	private String specOptionName1;
	private Boolean isSeleted1;
	private Integer specId2;
	private String specName2;
	private String specOptionName2;
	private Boolean isSeleted2;
	private Boolean isDefault;
	private BigDecimal sellPrice;
	private Integer stock;
	private Integer specOptionNum;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSpecId1() {
		return specId1;
	}

	public void setSpecId1(Integer specId1) {
		this.specId1 = specId1;
	}

	public String getSpecName1() {
		return specName1;
	}

	public void setSpecName1(String specName1) {
		this.specName1 = specName1;
	}

	public String getSpecOptionName1() {
		return specOptionName1;
	}

	public void setSpecOptionName1(String specOptionName1) {
		this.specOptionName1 = specOptionName1;
	}

	public Boolean getIsSeleted1() {
		return isSeleted1;
	}

	public void setIsSeleted1(Boolean isSeleted1) {
		this.isSeleted1 = isSeleted1;
	}

	public Integer getSpecId2() {
		return specId2;
	}

	public void setSpecId2(Integer specId2) {
		this.specId2 = specId2;
	}

	public String getSpecName2() {
		return specName2;
	}

	public void setSpecName2(String specName2) {
		this.specName2 = specName2;
	}

	public String getSpecOptionName2() {
		return specOptionName2;
	}

	public void setSpecOptionName2(String specOptionName2) {
		this.specOptionName2 = specOptionName2;
	}

	public Boolean getIsSeleted2() {
		return isSeleted2;
	}

	public void setIsSeleted2(Boolean isSeleted2) {
		this.isSeleted2 = isSeleted2;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSpecOptionNum() {
		return specOptionNum;
	}

	public void setSpecOptionNum(Integer specOptionNum) {
		this.specOptionNum = specOptionNum;
	}

	@Override
	public String toString() {
		return "OptionDecare [id=" + id + ", specId1=" + specId1 + ", specName1=" + specName1 + ", specOptionName1="
				+ specOptionName1 + ", isSeleted1=" + isSeleted1 + ", specId2=" + specId2 + ", specName2=" + specName2
				+ ", specOptionName2=" + specOptionName2 + ", isSeleted2=" + isSeleted2 + ", isDefault=" + isDefault
				+ ", sellPrice=" + sellPrice + ", stock=" + stock + ", specOptionNum=" + specOptionNum + "]";
	}

}
