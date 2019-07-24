package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

import com.supergo.pojo.TbOrderItem;

public class Cart implements Serializable {

	private static final long serialVersionUID = -3166615719321422442L;

	private Integer shopId;

	private String shopNmae;

	private List<TbOrderItem> tbOrderItemlist;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopNmae() {
		return shopNmae;
	}

	public void setShopNmae(String shopNmae) {
		this.shopNmae = shopNmae;
	}

	public List<TbOrderItem> getTbOrderItemlist() {
		return tbOrderItemlist;
	}

	public void setTbOrderItemlist(List<TbOrderItem> tbOrderItemlist) {
		this.tbOrderItemlist = tbOrderItemlist;
	}

	@Override
	public String toString() {
		return "Cart [shopId=" + shopId + ", shopNmae=" + shopNmae + ", tbOrderItemlist=" + tbOrderItemlist + "]";
	}

}
