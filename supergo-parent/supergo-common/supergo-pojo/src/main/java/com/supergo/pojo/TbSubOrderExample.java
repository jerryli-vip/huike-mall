package com.supergo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSubOrderExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbSubOrderExample() {
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

		public Criteria andOrderIdIsNull() {
			addCriterion("order_id is null");
			return (Criteria) this;
		}

		public Criteria andOrderIdIsNotNull() {
			addCriterion("order_id is not null");
			return (Criteria) this;
		}

		public Criteria andOrderIdEqualTo(String value) {
			addCriterion("order_id =", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotEqualTo(String value) {
			addCriterion("order_id <>", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThan(String value) {
			addCriterion("order_id >", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
			addCriterion("order_id >=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThan(String value) {
			addCriterion("order_id <", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLessThanOrEqualTo(String value) {
			addCriterion("order_id <=", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdLike(String value) {
			addCriterion("order_id like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotLike(String value) {
			addCriterion("order_id not like", value, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdIn(List<String> values) {
			addCriterion("order_id in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotIn(List<String> values) {
			addCriterion("order_id not in", values, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdBetween(String value1, String value2) {
			addCriterion("order_id between", value1, value2, "orderId");
			return (Criteria) this;
		}

		public Criteria andOrderIdNotBetween(String value1, String value2) {
			addCriterion("order_id not between", value1, value2, "orderId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(Integer value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(Integer value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(Integer value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(Integer value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<Integer> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<Integer> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(Integer value1, Integer value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andShopIdIsNull() {
			addCriterion("shop_id is null");
			return (Criteria) this;
		}

		public Criteria andShopIdIsNotNull() {
			addCriterion("shop_id is not null");
			return (Criteria) this;
		}

		public Criteria andShopIdEqualTo(String value) {
			addCriterion("shop_id =", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotEqualTo(String value) {
			addCriterion("shop_id <>", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThan(String value) {
			addCriterion("shop_id >", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThanOrEqualTo(String value) {
			addCriterion("shop_id >=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThan(String value) {
			addCriterion("shop_id <", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThanOrEqualTo(String value) {
			addCriterion("shop_id <=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLike(String value) {
			addCriterion("shop_id like", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotLike(String value) {
			addCriterion("shop_id not like", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdIn(List<String> values) {
			addCriterion("shop_id in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotIn(List<String> values) {
			addCriterion("shop_id not in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdBetween(String value1, String value2) {
			addCriterion("shop_id between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotBetween(String value1, String value2) {
			addCriterion("shop_id not between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNull() {
			addCriterion("shop_name is null");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNotNull() {
			addCriterion("shop_name is not null");
			return (Criteria) this;
		}

		public Criteria andShopNameEqualTo(String value) {
			addCriterion("shop_name =", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotEqualTo(String value) {
			addCriterion("shop_name <>", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThan(String value) {
			addCriterion("shop_name >", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThanOrEqualTo(String value) {
			addCriterion("shop_name >=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThan(String value) {
			addCriterion("shop_name <", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThanOrEqualTo(String value) {
			addCriterion("shop_name <=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLike(String value) {
			addCriterion("shop_name like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotLike(String value) {
			addCriterion("shop_name not like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameIn(List<String> values) {
			addCriterion("shop_name in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotIn(List<String> values) {
			addCriterion("shop_name not in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameBetween(String value1, String value2) {
			addCriterion("shop_name between", value1, value2, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotBetween(String value1, String value2) {
			addCriterion("shop_name not between", value1, value2, "shopName");
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

		public Criteria andPayTimeIsNull() {
			addCriterion("pay_time is null");
			return (Criteria) this;
		}

		public Criteria andPayTimeIsNotNull() {
			addCriterion("pay_time is not null");
			return (Criteria) this;
		}

		public Criteria andPayTimeEqualTo(Date value) {
			addCriterion("pay_time =", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeNotEqualTo(Date value) {
			addCriterion("pay_time <>", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeGreaterThan(Date value) {
			addCriterion("pay_time >", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("pay_time >=", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeLessThan(Date value) {
			addCriterion("pay_time <", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeLessThanOrEqualTo(Date value) {
			addCriterion("pay_time <=", value, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeIn(List<Date> values) {
			addCriterion("pay_time in", values, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeNotIn(List<Date> values) {
			addCriterion("pay_time not in", values, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeBetween(Date value1, Date value2) {
			addCriterion("pay_time between", value1, value2, "payTime");
			return (Criteria) this;
		}

		public Criteria andPayTimeNotBetween(Date value1, Date value2) {
			addCriterion("pay_time not between", value1, value2, "payTime");
			return (Criteria) this;
		}

		public Criteria andPaymoneyIsNull() {
			addCriterion("paymoney is null");
			return (Criteria) this;
		}

		public Criteria andPaymoneyIsNotNull() {
			addCriterion("paymoney is not null");
			return (Criteria) this;
		}

		public Criteria andPaymoneyEqualTo(BigDecimal value) {
			addCriterion("paymoney =", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyNotEqualTo(BigDecimal value) {
			addCriterion("paymoney <>", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyGreaterThan(BigDecimal value) {
			addCriterion("paymoney >", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("paymoney >=", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyLessThan(BigDecimal value) {
			addCriterion("paymoney <", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("paymoney <=", value, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyIn(List<BigDecimal> values) {
			addCriterion("paymoney in", values, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyNotIn(List<BigDecimal> values) {
			addCriterion("paymoney not in", values, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("paymoney between", value1, value2, "paymoney");
			return (Criteria) this;
		}

		public Criteria andPaymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("paymoney not between", value1, value2, "paymoney");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andExpressfeeIsNull() {
			addCriterion("expressfee is null");
			return (Criteria) this;
		}

		public Criteria andExpressfeeIsNotNull() {
			addCriterion("expressfee is not null");
			return (Criteria) this;
		}

		public Criteria andExpressfeeEqualTo(BigDecimal value) {
			addCriterion("expressfee =", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeNotEqualTo(BigDecimal value) {
			addCriterion("expressfee <>", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeGreaterThan(BigDecimal value) {
			addCriterion("expressfee >", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("expressfee >=", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeLessThan(BigDecimal value) {
			addCriterion("expressfee <", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("expressfee <=", value, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeIn(List<BigDecimal> values) {
			addCriterion("expressfee in", values, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeNotIn(List<BigDecimal> values) {
			addCriterion("expressfee not in", values, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("expressfee between", value1, value2, "expressfee");
			return (Criteria) this;
		}

		public Criteria andExpressfeeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("expressfee not between", value1, value2, "expressfee");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIsNull() {
			addCriterion("order_status is null");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIsNotNull() {
			addCriterion("order_status is not null");
			return (Criteria) this;
		}

		public Criteria andOrderStatusEqualTo(String value) {
			addCriterion("order_status =", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotEqualTo(String value) {
			addCriterion("order_status <>", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusGreaterThan(String value) {
			addCriterion("order_status >", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
			addCriterion("order_status >=", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusLessThan(String value) {
			addCriterion("order_status <", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusLessThanOrEqualTo(String value) {
			addCriterion("order_status <=", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusLike(String value) {
			addCriterion("order_status like", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotLike(String value) {
			addCriterion("order_status not like", value, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusIn(List<String> values) {
			addCriterion("order_status in", values, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotIn(List<String> values) {
			addCriterion("order_status not in", values, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusBetween(String value1, String value2) {
			addCriterion("order_status between", value1, value2, "orderStatus");
			return (Criteria) this;
		}

		public Criteria andOrderStatusNotBetween(String value1, String value2) {
			addCriterion("order_status not between", value1, value2, "orderStatus");
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

		public Criteria andPayModelIsNull() {
			addCriterion("pay_model is null");
			return (Criteria) this;
		}

		public Criteria andPayModelIsNotNull() {
			addCriterion("pay_model is not null");
			return (Criteria) this;
		}

		public Criteria andPayModelEqualTo(String value) {
			addCriterion("pay_model =", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelNotEqualTo(String value) {
			addCriterion("pay_model <>", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelGreaterThan(String value) {
			addCriterion("pay_model >", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelGreaterThanOrEqualTo(String value) {
			addCriterion("pay_model >=", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelLessThan(String value) {
			addCriterion("pay_model <", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelLessThanOrEqualTo(String value) {
			addCriterion("pay_model <=", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelLike(String value) {
			addCriterion("pay_model like", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelNotLike(String value) {
			addCriterion("pay_model not like", value, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelIn(List<String> values) {
			addCriterion("pay_model in", values, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelNotIn(List<String> values) {
			addCriterion("pay_model not in", values, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelBetween(String value1, String value2) {
			addCriterion("pay_model between", value1, value2, "payModel");
			return (Criteria) this;
		}

		public Criteria andPayModelNotBetween(String value1, String value2) {
			addCriterion("pay_model not between", value1, value2, "payModel");
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

		public Criteria andStatusOIsNull() {
			addCriterion("status_o is null");
			return (Criteria) this;
		}

		public Criteria andStatusOIsNotNull() {
			addCriterion("status_o is not null");
			return (Criteria) this;
		}

		public Criteria andStatusOEqualTo(String value) {
			addCriterion("status_o =", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusONotEqualTo(String value) {
			addCriterion("status_o <>", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOGreaterThan(String value) {
			addCriterion("status_o >", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOGreaterThanOrEqualTo(String value) {
			addCriterion("status_o >=", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOLessThan(String value) {
			addCriterion("status_o <", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOLessThanOrEqualTo(String value) {
			addCriterion("status_o <=", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOLike(String value) {
			addCriterion("status_o like", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusONotLike(String value) {
			addCriterion("status_o not like", value, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOIn(List<String> values) {
			addCriterion("status_o in", values, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusONotIn(List<String> values) {
			addCriterion("status_o not in", values, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusOBetween(String value1, String value2) {
			addCriterion("status_o between", value1, value2, "statusO");
			return (Criteria) this;
		}

		public Criteria andStatusONotBetween(String value1, String value2) {
			addCriterion("status_o not between", value1, value2, "statusO");
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