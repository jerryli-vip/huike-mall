package com.supergo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderItemExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbOrderItemExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andOrderItemIdIsNull() {
			addCriterion("order_item_id is null");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdIsNotNull() {
			addCriterion("order_item_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdEqualTo(Integer value) {
			addCriterion("order_item_id =", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdNotEqualTo(Integer value) {
			addCriterion("order_item_id <>", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdGreaterThan(Integer value) {
			addCriterion("order_item_id >", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("order_item_id >=", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdLessThan(Integer value) {
			addCriterion("order_item_id <", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
			addCriterion("order_item_id <=", value, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdIn(List<Integer> values) {
			addCriterion("order_item_id in", values, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdNotIn(List<Integer> values) {
			addCriterion("order_item_id not in", values, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
			addCriterion("order_item_id between", value1, value2, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
			addCriterion("order_item_id not between", value1, value2, "orderItemId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdIsNull() {
			addCriterion("ordersub_id is null");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdIsNotNull() {
			addCriterion("ordersub_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdEqualTo(String value) {
			addCriterion("ordersub_id =", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdNotEqualTo(String value) {
			addCriterion("ordersub_id <>", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdGreaterThan(String value) {
			addCriterion("ordersub_id >", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdGreaterThanOrEqualTo(String value) {
			addCriterion("ordersub_id >=", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdLessThan(String value) {
			addCriterion("ordersub_id <", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdLessThanOrEqualTo(String value) {
			addCriterion("ordersub_id <=", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdLike(String value) {
			addCriterion("ordersub_id like", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdNotLike(String value) {
			addCriterion("ordersub_id not like", value, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdIn(List<String> values) {
			addCriterion("ordersub_id in", values, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdNotIn(List<String> values) {
			addCriterion("ordersub_id not in", values, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdBetween(String value1, String value2) {
			addCriterion("ordersub_id between", value1, value2, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andOrdersubIdNotBetween(String value1, String value2) {
			addCriterion("ordersub_id not between", value1, value2, "ordersubId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdIsNull() {
			addCriterion("goods_id is null");
			return (Criteria) this;
		}

		public Criteria andGoodsIdIsNotNull() {
			addCriterion("goods_id is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsIdEqualTo(Integer value) {
			addCriterion("goods_id =", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdNotEqualTo(Integer value) {
			addCriterion("goods_id <>", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdGreaterThan(Integer value) {
			addCriterion("goods_id >", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("goods_id >=", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdLessThan(Integer value) {
			addCriterion("goods_id <", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
			addCriterion("goods_id <=", value, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdIn(List<Integer> values) {
			addCriterion("goods_id in", values, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdNotIn(List<Integer> values) {
			addCriterion("goods_id not in", values, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
			addCriterion("goods_id between", value1, value2, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
			addCriterion("goods_id not between", value1, value2, "goodsId");
			return (Criteria) this;
		}

		public Criteria andGoodsNameIsNull() {
			addCriterion("goods_name is null");
			return (Criteria) this;
		}

		public Criteria andGoodsNameIsNotNull() {
			addCriterion("goods_name is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsNameEqualTo(String value) {
			addCriterion("goods_name =", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameNotEqualTo(String value) {
			addCriterion("goods_name <>", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameGreaterThan(String value) {
			addCriterion("goods_name >", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
			addCriterion("goods_name >=", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameLessThan(String value) {
			addCriterion("goods_name <", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameLessThanOrEqualTo(String value) {
			addCriterion("goods_name <=", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameLike(String value) {
			addCriterion("goods_name like", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameNotLike(String value) {
			addCriterion("goods_name not like", value, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameIn(List<String> values) {
			addCriterion("goods_name in", values, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameNotIn(List<String> values) {
			addCriterion("goods_name not in", values, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameBetween(String value1, String value2) {
			addCriterion("goods_name between", value1, value2, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsNameNotBetween(String value1, String value2) {
			addCriterion("goods_name not between", value1, value2, "goodsName");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeIsNull() {
			addCriterion("goods_type is null");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeIsNotNull() {
			addCriterion("goods_type is not null");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeEqualTo(String value) {
			addCriterion("goods_type =", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeNotEqualTo(String value) {
			addCriterion("goods_type <>", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeGreaterThan(String value) {
			addCriterion("goods_type >", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
			addCriterion("goods_type >=", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeLessThan(String value) {
			addCriterion("goods_type <", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
			addCriterion("goods_type <=", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeLike(String value) {
			addCriterion("goods_type like", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeNotLike(String value) {
			addCriterion("goods_type not like", value, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeIn(List<String> values) {
			addCriterion("goods_type in", values, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeNotIn(List<String> values) {
			addCriterion("goods_type not in", values, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeBetween(String value1, String value2) {
			addCriterion("goods_type between", value1, value2, "goodsType");
			return (Criteria) this;
		}

		public Criteria andGoodsTypeNotBetween(String value1, String value2) {
			addCriterion("goods_type not between", value1, value2, "goodsType");
			return (Criteria) this;
		}

		public Criteria andSellPriceIsNull() {
			addCriterion("sell_price is null");
			return (Criteria) this;
		}

		public Criteria andSellPriceIsNotNull() {
			addCriterion("sell_price is not null");
			return (Criteria) this;
		}

		public Criteria andSellPriceEqualTo(BigDecimal value) {
			addCriterion("sell_price =", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotEqualTo(BigDecimal value) {
			addCriterion("sell_price <>", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceGreaterThan(BigDecimal value) {
			addCriterion("sell_price >", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("sell_price >=", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceLessThan(BigDecimal value) {
			addCriterion("sell_price <", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("sell_price <=", value, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceIn(List<BigDecimal> values) {
			addCriterion("sell_price in", values, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotIn(List<BigDecimal> values) {
			addCriterion("sell_price not in", values, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sell_price between", value1, value2, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andSellPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("sell_price not between", value1, value2, "sellPrice");
			return (Criteria) this;
		}

		public Criteria andActualPaymentIsNull() {
			addCriterion("actual_payment is null");
			return (Criteria) this;
		}

		public Criteria andActualPaymentIsNotNull() {
			addCriterion("actual_payment is not null");
			return (Criteria) this;
		}

		public Criteria andActualPaymentEqualTo(BigDecimal value) {
			addCriterion("actual_payment =", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentNotEqualTo(BigDecimal value) {
			addCriterion("actual_payment <>", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentGreaterThan(BigDecimal value) {
			addCriterion("actual_payment >", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("actual_payment >=", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentLessThan(BigDecimal value) {
			addCriterion("actual_payment <", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentLessThanOrEqualTo(BigDecimal value) {
			addCriterion("actual_payment <=", value, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentIn(List<BigDecimal> values) {
			addCriterion("actual_payment in", values, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentNotIn(List<BigDecimal> values) {
			addCriterion("actual_payment not in", values, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("actual_payment between", value1, value2, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andActualPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("actual_payment not between", value1, value2, "actualPayment");
			return (Criteria) this;
		}

		public Criteria andQuantityIsNull() {
			addCriterion("quantity is null");
			return (Criteria) this;
		}

		public Criteria andQuantityIsNotNull() {
			addCriterion("quantity is not null");
			return (Criteria) this;
		}

		public Criteria andQuantityEqualTo(Integer value) {
			addCriterion("quantity =", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotEqualTo(Integer value) {
			addCriterion("quantity <>", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityGreaterThan(Integer value) {
			addCriterion("quantity >", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("quantity >=", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityLessThan(Integer value) {
			addCriterion("quantity <", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("quantity <=", value, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityIn(List<Integer> values) {
			addCriterion("quantity in", values, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotIn(List<Integer> values) {
			addCriterion("quantity not in", values, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityBetween(Integer value1, Integer value2) {
			addCriterion("quantity between", value1, value2, "quantity");
			return (Criteria) this;
		}

		public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("quantity not between", value1, value2, "quantity");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNull() {
			addCriterion("discount is null");
			return (Criteria) this;
		}

		public Criteria andDiscountIsNotNull() {
			addCriterion("discount is not null");
			return (Criteria) this;
		}

		public Criteria andDiscountEqualTo(String value) {
			addCriterion("discount =", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotEqualTo(String value) {
			addCriterion("discount <>", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThan(String value) {
			addCriterion("discount >", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountGreaterThanOrEqualTo(String value) {
			addCriterion("discount >=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThan(String value) {
			addCriterion("discount <", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLessThanOrEqualTo(String value) {
			addCriterion("discount <=", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountLike(String value) {
			addCriterion("discount like", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotLike(String value) {
			addCriterion("discount not like", value, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountIn(List<String> values) {
			addCriterion("discount in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotIn(List<String> values) {
			addCriterion("discount not in", values, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountBetween(String value1, String value2) {
			addCriterion("discount between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andDiscountNotBetween(String value1, String value2) {
			addCriterion("discount not between", value1, value2, "discount");
			return (Criteria) this;
		}

		public Criteria andPayStatusIsNull() {
			addCriterion("pay_status is null");
			return (Criteria) this;
		}

		public Criteria andPayStatusIsNotNull() {
			addCriterion("pay_status is not null");
			return (Criteria) this;
		}

		public Criteria andPayStatusEqualTo(String value) {
			addCriterion("pay_status =", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusNotEqualTo(String value) {
			addCriterion("pay_status <>", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusGreaterThan(String value) {
			addCriterion("pay_status >", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
			addCriterion("pay_status >=", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusLessThan(String value) {
			addCriterion("pay_status <", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusLessThanOrEqualTo(String value) {
			addCriterion("pay_status <=", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusLike(String value) {
			addCriterion("pay_status like", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusNotLike(String value) {
			addCriterion("pay_status not like", value, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusIn(List<String> values) {
			addCriterion("pay_status in", values, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusNotIn(List<String> values) {
			addCriterion("pay_status not in", values, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusBetween(String value1, String value2) {
			addCriterion("pay_status between", value1, value2, "payStatus");
			return (Criteria) this;
		}

		public Criteria andPayStatusNotBetween(String value1, String value2) {
			addCriterion("pay_status not between", value1, value2, "payStatus");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andCreateIdIsNull() {
			addCriterion("create_id is null");
			return (Criteria) this;
		}

		public Criteria andCreateIdIsNotNull() {
			addCriterion("create_id is not null");
			return (Criteria) this;
		}

		public Criteria andCreateIdEqualTo(Integer value) {
			addCriterion("create_id =", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotEqualTo(Integer value) {
			addCriterion("create_id <>", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThan(Integer value) {
			addCriterion("create_id >", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("create_id >=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThan(Integer value) {
			addCriterion("create_id <", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
			addCriterion("create_id <=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdIn(List<Integer> values) {
			addCriterion("create_id in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotIn(List<Integer> values) {
			addCriterion("create_id not in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdBetween(Integer value1, Integer value2) {
			addCriterion("create_id between", value1, value2, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
			addCriterion("create_id not between", value1, value2, "createId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIsNull() {
			addCriterion("update_id is null");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIsNotNull() {
			addCriterion("update_id is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateIdEqualTo(Integer value) {
			addCriterion("update_id =", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotEqualTo(Integer value) {
			addCriterion("update_id <>", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThan(Integer value) {
			addCriterion("update_id >", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("update_id >=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThan(Integer value) {
			addCriterion("update_id <", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
			addCriterion("update_id <=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIn(List<Integer> values) {
			addCriterion("update_id in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotIn(List<Integer> values) {
			addCriterion("update_id not in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
			addCriterion("update_id between", value1, value2, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
			addCriterion("update_id not between", value1, value2, "updateId");
			return (Criteria) this;
		}

		public Criteria andItemStatusIsNull() {
			addCriterion("item_status is null");
			return (Criteria) this;
		}

		public Criteria andItemStatusIsNotNull() {
			addCriterion("item_status is not null");
			return (Criteria) this;
		}

		public Criteria andItemStatusEqualTo(String value) {
			addCriterion("item_status =", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusNotEqualTo(String value) {
			addCriterion("item_status <>", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusGreaterThan(String value) {
			addCriterion("item_status >", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusGreaterThanOrEqualTo(String value) {
			addCriterion("item_status >=", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusLessThan(String value) {
			addCriterion("item_status <", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusLessThanOrEqualTo(String value) {
			addCriterion("item_status <=", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusLike(String value) {
			addCriterion("item_status like", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusNotLike(String value) {
			addCriterion("item_status not like", value, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusIn(List<String> values) {
			addCriterion("item_status in", values, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusNotIn(List<String> values) {
			addCriterion("item_status not in", values, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusBetween(String value1, String value2) {
			addCriterion("item_status between", value1, value2, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andItemStatusNotBetween(String value1, String value2) {
			addCriterion("item_status not between", value1, value2, "itemStatus");
			return (Criteria) this;
		}

		public Criteria andBak2IsNull() {
			addCriterion("bak2 is null");
			return (Criteria) this;
		}

		public Criteria andBak2IsNotNull() {
			addCriterion("bak2 is not null");
			return (Criteria) this;
		}

		public Criteria andBak2EqualTo(String value) {
			addCriterion("bak2 =", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2NotEqualTo(String value) {
			addCriterion("bak2 <>", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2GreaterThan(String value) {
			addCriterion("bak2 >", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2GreaterThanOrEqualTo(String value) {
			addCriterion("bak2 >=", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2LessThan(String value) {
			addCriterion("bak2 <", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2LessThanOrEqualTo(String value) {
			addCriterion("bak2 <=", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2Like(String value) {
			addCriterion("bak2 like", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2NotLike(String value) {
			addCriterion("bak2 not like", value, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2In(List<String> values) {
			addCriterion("bak2 in", values, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2NotIn(List<String> values) {
			addCriterion("bak2 not in", values, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2Between(String value1, String value2) {
			addCriterion("bak2 between", value1, value2, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak2NotBetween(String value1, String value2) {
			addCriterion("bak2 not between", value1, value2, "bak2");
			return (Criteria) this;
		}

		public Criteria andBak3IsNull() {
			addCriterion("bak3 is null");
			return (Criteria) this;
		}

		public Criteria andBak3IsNotNull() {
			addCriterion("bak3 is not null");
			return (Criteria) this;
		}

		public Criteria andBak3EqualTo(String value) {
			addCriterion("bak3 =", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3NotEqualTo(String value) {
			addCriterion("bak3 <>", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3GreaterThan(String value) {
			addCriterion("bak3 >", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3GreaterThanOrEqualTo(String value) {
			addCriterion("bak3 >=", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3LessThan(String value) {
			addCriterion("bak3 <", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3LessThanOrEqualTo(String value) {
			addCriterion("bak3 <=", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3Like(String value) {
			addCriterion("bak3 like", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3NotLike(String value) {
			addCriterion("bak3 not like", value, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3In(List<String> values) {
			addCriterion("bak3 in", values, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3NotIn(List<String> values) {
			addCriterion("bak3 not in", values, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3Between(String value1, String value2) {
			addCriterion("bak3 between", value1, value2, "bak3");
			return (Criteria) this;
		}

		public Criteria andBak3NotBetween(String value1, String value2) {
			addCriterion("bak3 not between", value1, value2, "bak3");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}