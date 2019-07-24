package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

import com.supergo.pojo.TbOrderDelivery;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbSubOrder;

/**
 * 前台详情表 李聪
 * 
 * @author leosam
 *
 */
public class OrderDetailVO implements Serializable {

	private static final long serialVersionUID = 8652927421031824212L;
	// 订单物流信息
	private TbOrderDelivery orderDelivery;
	// 订单商品列表信息
	private List<TbOrderItem> itemList;

	private TbSubOrder tbSubOrder;

	public TbOrderDelivery getOrderDelivery() {
		return orderDelivery;
	}

	public void setOrderDelivery(TbOrderDelivery orderDelivery) {
		this.orderDelivery = orderDelivery;
	}

	public List<TbOrderItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<TbOrderItem> itemList) {
		this.itemList = itemList;
	}

	public TbSubOrder getTbSubOrder() {
		return tbSubOrder;
	}

	public void setTbSubOrder(TbSubOrder tbSubOrder) {
		this.tbSubOrder = tbSubOrder;
	}

	@Override
	public String toString() {
		return "OrderDetailVO [orderDelivery=" + orderDelivery + ", itemList=" + itemList + ", tbSubOrder=" + tbSubOrder
				+ "]";
	}

}
