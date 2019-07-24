package com.supergo.pojo.ext;

import java.io.Serializable;
import java.util.List;

import com.supergo.pojo.TbAddress;

public class OrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String paymentType;
	
	private List<Cart> cartList;
	
	private TbAddress address;

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public List<Cart> getCartList() {
		return cartList;
	}

	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

	public TbAddress getAddress() {
		return address;
	}

	public void setAddress(TbAddress address) {
		this.address = address;
	}

	public OrderVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderVO(String paymentType, List<Cart> cartList, TbAddress address) {
		super();
		this.paymentType = paymentType;
		this.cartList = cartList;
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderVO [paymentType=" + paymentType + ", cartList=" + cartList + ", address=" + address + "]";
	}
	
	

}
