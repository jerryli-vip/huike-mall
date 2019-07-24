package com.supergo.pojo.ext;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.Dynamic;

public class TbItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Field
	private Integer id;
	@Field("item_name")
	private String itemName;
	@Field("item_category")
	private String category;
	@Field("item_brand")
	private String brand;
	@Field("item_spec")
	private String spec;

	private Integer goodsId;
	@Field("item_sell_price")
	private BigDecimal sellPrice;
	@Field("item_image")
	private String image;

	private Date createTime;

	private Date updateTime;

	@Dynamic
	@Field("item_spec_*")
	private Map<String, String> specMap;

	public Map<String, String> getSpecMap() {
		return specMap;
	}

	public void setSpecMap(Map<String, String> specMap) {
		this.specMap = specMap;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName == null ? null : itemName.trim();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category == null ? null : category.trim();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand == null ? null : brand.trim();
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec == null ? null : spec.trim();
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image == null ? null : image.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}