package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.Arrays;

import com.supergo.pojo.TbImage;

/**
 * 用来接收商品提交保存的vo类
 * 
 * @author leosam
 *
 */
public class GoodsVO implements Serializable {
	private static final long serialVersionUID = 4852923131024102330L;
	private TbImage[] imgList;
	private OptionDecare[] optionDecareList;
	private Integer productId;
	private String goodsName;
	private Integer optionNum;
	private Integer shopId;

	@Override
	public String toString() {
		return "GoodsVO [imgList=" + Arrays.toString(imgList) + ", optionDecareList="
				+ Arrays.toString(optionDecareList) + ", productId=" + productId + ", goodsName=" + goodsName
				+ ", optionNum=" + optionNum + ", shopId=" + shopId + "]";
	}

	public TbImage[] getImgList() {
		return imgList;
	}

	public void setImgList(TbImage[] imgList) {
		this.imgList = imgList;
	}

	public OptionDecare[] getOptionDecareList() {
		return optionDecareList;
	}

	public void setOptionDecareList(OptionDecare[] optionDecareList) {
		this.optionDecareList = optionDecareList;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getOptionNum() {
		return optionNum;
	}

	public void setOptionNum(Integer optionNum) {
		this.optionNum = optionNum;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

}