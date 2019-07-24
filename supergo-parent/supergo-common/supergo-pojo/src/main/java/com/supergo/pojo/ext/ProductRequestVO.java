package com.supergo.pojo.ext;

import java.io.Serializable;

import com.supergo.pojo.TbProduct;
import com.supergo.pojo.TbProductInfoWithBLOBs;

public class ProductRequestVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private TbProduct product;

	private TbProductInfoWithBLOBs productInfoWithBLOBs;

	public TbProduct getProduct() {
		return product;
	}

	public void setProduct(TbProduct product) {
		this.product = product;
	}

	public TbProductInfoWithBLOBs getProductInfoWithBLOBs() {
		return productInfoWithBLOBs;
	}

	public void setProductInfoWithBLOBs(TbProductInfoWithBLOBs productInfoWithBLOBs) {
		this.productInfoWithBLOBs = productInfoWithBLOBs;
	}
}
