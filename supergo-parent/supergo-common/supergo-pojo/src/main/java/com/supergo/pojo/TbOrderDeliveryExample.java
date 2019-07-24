package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrderDeliveryExample implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8052786914993360142L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbOrderDeliveryExample() {
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

		public Criteria andDeliveryIdIsNull() {
			addCriterion("delivery_id is null");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdIsNotNull() {
			addCriterion("delivery_id is not null");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdEqualTo(String value) {
			addCriterion("delivery_id =", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdNotEqualTo(String value) {
			addCriterion("delivery_id <>", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdGreaterThan(String value) {
			addCriterion("delivery_id >", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdGreaterThanOrEqualTo(String value) {
			addCriterion("delivery_id >=", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdLessThan(String value) {
			addCriterion("delivery_id <", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdLessThanOrEqualTo(String value) {
			addCriterion("delivery_id <=", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdLike(String value) {
			addCriterion("delivery_id like", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdNotLike(String value) {
			addCriterion("delivery_id not like", value, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdIn(List<String> values) {
			addCriterion("delivery_id in", values, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdNotIn(List<String> values) {
			addCriterion("delivery_id not in", values, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdBetween(String value1, String value2) {
			addCriterion("delivery_id between", value1, value2, "deliveryId");
			return (Criteria) this;
		}

		public Criteria andDeliveryIdNotBetween(String value1, String value2) {
			addCriterion("delivery_id not between", value1, value2, "deliveryId");
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

		public Criteria andReciveNameIsNull() {
			addCriterion("recive_name is null");
			return (Criteria) this;
		}

		public Criteria andReciveNameIsNotNull() {
			addCriterion("recive_name is not null");
			return (Criteria) this;
		}

		public Criteria andReciveNameEqualTo(String value) {
			addCriterion("recive_name =", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameNotEqualTo(String value) {
			addCriterion("recive_name <>", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameGreaterThan(String value) {
			addCriterion("recive_name >", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameGreaterThanOrEqualTo(String value) {
			addCriterion("recive_name >=", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameLessThan(String value) {
			addCriterion("recive_name <", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameLessThanOrEqualTo(String value) {
			addCriterion("recive_name <=", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameLike(String value) {
			addCriterion("recive_name like", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameNotLike(String value) {
			addCriterion("recive_name not like", value, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameIn(List<String> values) {
			addCriterion("recive_name in", values, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameNotIn(List<String> values) {
			addCriterion("recive_name not in", values, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameBetween(String value1, String value2) {
			addCriterion("recive_name between", value1, value2, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveNameNotBetween(String value1, String value2) {
			addCriterion("recive_name not between", value1, value2, "reciveName");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceIsNull() {
			addCriterion("recive_province is null");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceIsNotNull() {
			addCriterion("recive_province is not null");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceEqualTo(Integer value) {
			addCriterion("recive_province =", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceNotEqualTo(Integer value) {
			addCriterion("recive_province <>", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceGreaterThan(Integer value) {
			addCriterion("recive_province >", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceGreaterThanOrEqualTo(Integer value) {
			addCriterion("recive_province >=", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceLessThan(Integer value) {
			addCriterion("recive_province <", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceLessThanOrEqualTo(Integer value) {
			addCriterion("recive_province <=", value, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceIn(List<Integer> values) {
			addCriterion("recive_province in", values, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceNotIn(List<Integer> values) {
			addCriterion("recive_province not in", values, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceBetween(Integer value1, Integer value2) {
			addCriterion("recive_province between", value1, value2, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveProvinceNotBetween(Integer value1, Integer value2) {
			addCriterion("recive_province not between", value1, value2, "reciveProvince");
			return (Criteria) this;
		}

		public Criteria andReciveCityIsNull() {
			addCriterion("recive_city is null");
			return (Criteria) this;
		}

		public Criteria andReciveCityIsNotNull() {
			addCriterion("recive_city is not null");
			return (Criteria) this;
		}

		public Criteria andReciveCityEqualTo(Integer value) {
			addCriterion("recive_city =", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityNotEqualTo(Integer value) {
			addCriterion("recive_city <>", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityGreaterThan(Integer value) {
			addCriterion("recive_city >", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityGreaterThanOrEqualTo(Integer value) {
			addCriterion("recive_city >=", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityLessThan(Integer value) {
			addCriterion("recive_city <", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityLessThanOrEqualTo(Integer value) {
			addCriterion("recive_city <=", value, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityIn(List<Integer> values) {
			addCriterion("recive_city in", values, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityNotIn(List<Integer> values) {
			addCriterion("recive_city not in", values, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityBetween(Integer value1, Integer value2) {
			addCriterion("recive_city between", value1, value2, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveCityNotBetween(Integer value1, Integer value2) {
			addCriterion("recive_city not between", value1, value2, "reciveCity");
			return (Criteria) this;
		}

		public Criteria andReciveAreaIsNull() {
			addCriterion("recive_area is null");
			return (Criteria) this;
		}

		public Criteria andReciveAreaIsNotNull() {
			addCriterion("recive_area is not null");
			return (Criteria) this;
		}

		public Criteria andReciveAreaEqualTo(Integer value) {
			addCriterion("recive_area =", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaNotEqualTo(Integer value) {
			addCriterion("recive_area <>", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaGreaterThan(Integer value) {
			addCriterion("recive_area >", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaGreaterThanOrEqualTo(Integer value) {
			addCriterion("recive_area >=", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaLessThan(Integer value) {
			addCriterion("recive_area <", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaLessThanOrEqualTo(Integer value) {
			addCriterion("recive_area <=", value, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaIn(List<Integer> values) {
			addCriterion("recive_area in", values, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaNotIn(List<Integer> values) {
			addCriterion("recive_area not in", values, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaBetween(Integer value1, Integer value2) {
			addCriterion("recive_area between", value1, value2, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAreaNotBetween(Integer value1, Integer value2) {
			addCriterion("recive_area not between", value1, value2, "reciveArea");
			return (Criteria) this;
		}

		public Criteria andReciveAddressIsNull() {
			addCriterion("recive_address is null");
			return (Criteria) this;
		}

		public Criteria andReciveAddressIsNotNull() {
			addCriterion("recive_address is not null");
			return (Criteria) this;
		}

		public Criteria andReciveAddressEqualTo(String value) {
			addCriterion("recive_address =", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressNotEqualTo(String value) {
			addCriterion("recive_address <>", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressGreaterThan(String value) {
			addCriterion("recive_address >", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressGreaterThanOrEqualTo(String value) {
			addCriterion("recive_address >=", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressLessThan(String value) {
			addCriterion("recive_address <", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressLessThanOrEqualTo(String value) {
			addCriterion("recive_address <=", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressLike(String value) {
			addCriterion("recive_address like", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressNotLike(String value) {
			addCriterion("recive_address not like", value, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressIn(List<String> values) {
			addCriterion("recive_address in", values, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressNotIn(List<String> values) {
			addCriterion("recive_address not in", values, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressBetween(String value1, String value2) {
			addCriterion("recive_address between", value1, value2, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveAddressNotBetween(String value1, String value2) {
			addCriterion("recive_address not between", value1, value2, "reciveAddress");
			return (Criteria) this;
		}

		public Criteria andReciveMobileIsNull() {
			addCriterion("recive_mobile is null");
			return (Criteria) this;
		}

		public Criteria andReciveMobileIsNotNull() {
			addCriterion("recive_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andReciveMobileEqualTo(String value) {
			addCriterion("recive_mobile =", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileNotEqualTo(String value) {
			addCriterion("recive_mobile <>", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileGreaterThan(String value) {
			addCriterion("recive_mobile >", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileGreaterThanOrEqualTo(String value) {
			addCriterion("recive_mobile >=", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileLessThan(String value) {
			addCriterion("recive_mobile <", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileLessThanOrEqualTo(String value) {
			addCriterion("recive_mobile <=", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileLike(String value) {
			addCriterion("recive_mobile like", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileNotLike(String value) {
			addCriterion("recive_mobile not like", value, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileIn(List<String> values) {
			addCriterion("recive_mobile in", values, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileNotIn(List<String> values) {
			addCriterion("recive_mobile not in", values, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileBetween(String value1, String value2) {
			addCriterion("recive_mobile between", value1, value2, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveMobileNotBetween(String value1, String value2) {
			addCriterion("recive_mobile not between", value1, value2, "reciveMobile");
			return (Criteria) this;
		}

		public Criteria andReciveEmailIsNull() {
			addCriterion("recive_email is null");
			return (Criteria) this;
		}

		public Criteria andReciveEmailIsNotNull() {
			addCriterion("recive_email is not null");
			return (Criteria) this;
		}

		public Criteria andReciveEmailEqualTo(String value) {
			addCriterion("recive_email =", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailNotEqualTo(String value) {
			addCriterion("recive_email <>", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailGreaterThan(String value) {
			addCriterion("recive_email >", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailGreaterThanOrEqualTo(String value) {
			addCriterion("recive_email >=", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailLessThan(String value) {
			addCriterion("recive_email <", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailLessThanOrEqualTo(String value) {
			addCriterion("recive_email <=", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailLike(String value) {
			addCriterion("recive_email like", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailNotLike(String value) {
			addCriterion("recive_email not like", value, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailIn(List<String> values) {
			addCriterion("recive_email in", values, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailNotIn(List<String> values) {
			addCriterion("recive_email not in", values, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailBetween(String value1, String value2) {
			addCriterion("recive_email between", value1, value2, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andReciveEmailNotBetween(String value1, String value2) {
			addCriterion("recive_email not between", value1, value2, "reciveEmail");
			return (Criteria) this;
		}

		public Criteria andPostIdIsNull() {
			addCriterion("post_id is null");
			return (Criteria) this;
		}

		public Criteria andPostIdIsNotNull() {
			addCriterion("post_id is not null");
			return (Criteria) this;
		}

		public Criteria andPostIdEqualTo(String value) {
			addCriterion("post_id =", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdNotEqualTo(String value) {
			addCriterion("post_id <>", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdGreaterThan(String value) {
			addCriterion("post_id >", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdGreaterThanOrEqualTo(String value) {
			addCriterion("post_id >=", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdLessThan(String value) {
			addCriterion("post_id <", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdLessThanOrEqualTo(String value) {
			addCriterion("post_id <=", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdLike(String value) {
			addCriterion("post_id like", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdNotLike(String value) {
			addCriterion("post_id not like", value, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdIn(List<String> values) {
			addCriterion("post_id in", values, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdNotIn(List<String> values) {
			addCriterion("post_id not in", values, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdBetween(String value1, String value2) {
			addCriterion("post_id between", value1, value2, "postId");
			return (Criteria) this;
		}

		public Criteria andPostIdNotBetween(String value1, String value2) {
			addCriterion("post_id not between", value1, value2, "postId");
			return (Criteria) this;
		}

		public Criteria andPostStatusIsNull() {
			addCriterion("post_status is null");
			return (Criteria) this;
		}

		public Criteria andPostStatusIsNotNull() {
			addCriterion("post_status is not null");
			return (Criteria) this;
		}

		public Criteria andPostStatusEqualTo(String value) {
			addCriterion("post_status =", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusNotEqualTo(String value) {
			addCriterion("post_status <>", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusGreaterThan(String value) {
			addCriterion("post_status >", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusGreaterThanOrEqualTo(String value) {
			addCriterion("post_status >=", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusLessThan(String value) {
			addCriterion("post_status <", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusLessThanOrEqualTo(String value) {
			addCriterion("post_status <=", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusLike(String value) {
			addCriterion("post_status like", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusNotLike(String value) {
			addCriterion("post_status not like", value, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusIn(List<String> values) {
			addCriterion("post_status in", values, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusNotIn(List<String> values) {
			addCriterion("post_status not in", values, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusBetween(String value1, String value2) {
			addCriterion("post_status between", value1, value2, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostStatusNotBetween(String value1, String value2) {
			addCriterion("post_status not between", value1, value2, "postStatus");
			return (Criteria) this;
		}

		public Criteria andPostFeeIsNull() {
			addCriterion("post_fee is null");
			return (Criteria) this;
		}

		public Criteria andPostFeeIsNotNull() {
			addCriterion("post_fee is not null");
			return (Criteria) this;
		}

		public Criteria andPostFeeEqualTo(BigDecimal value) {
			addCriterion("post_fee =", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeNotEqualTo(BigDecimal value) {
			addCriterion("post_fee <>", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeGreaterThan(BigDecimal value) {
			addCriterion("post_fee >", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("post_fee >=", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeLessThan(BigDecimal value) {
			addCriterion("post_fee <", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeLessThanOrEqualTo(BigDecimal value) {
			addCriterion("post_fee <=", value, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeIn(List<BigDecimal> values) {
			addCriterion("post_fee in", values, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeNotIn(List<BigDecimal> values) {
			addCriterion("post_fee not in", values, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("post_fee between", value1, value2, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostFeeNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("post_fee not between", value1, value2, "postFee");
			return (Criteria) this;
		}

		public Criteria andPostTimeIsNull() {
			addCriterion("post_time is null");
			return (Criteria) this;
		}

		public Criteria andPostTimeIsNotNull() {
			addCriterion("post_time is not null");
			return (Criteria) this;
		}

		public Criteria andPostTimeEqualTo(Date value) {
			addCriterion("post_time =", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeNotEqualTo(Date value) {
			addCriterion("post_time <>", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeGreaterThan(Date value) {
			addCriterion("post_time >", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("post_time >=", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeLessThan(Date value) {
			addCriterion("post_time <", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeLessThanOrEqualTo(Date value) {
			addCriterion("post_time <=", value, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeIn(List<Date> values) {
			addCriterion("post_time in", values, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeNotIn(List<Date> values) {
			addCriterion("post_time not in", values, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeBetween(Date value1, Date value2) {
			addCriterion("post_time between", value1, value2, "postTime");
			return (Criteria) this;
		}

		public Criteria andPostTimeNotBetween(Date value1, Date value2) {
			addCriterion("post_time not between", value1, value2, "postTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeIsNull() {
			addCriterion("delivery_time is null");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeIsNotNull() {
			addCriterion("delivery_time is not null");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeEqualTo(Date value) {
			addCriterion("delivery_time =", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeNotEqualTo(Date value) {
			addCriterion("delivery_time <>", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeGreaterThan(Date value) {
			addCriterion("delivery_time >", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("delivery_time >=", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeLessThan(Date value) {
			addCriterion("delivery_time <", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
			addCriterion("delivery_time <=", value, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeIn(List<Date> values) {
			addCriterion("delivery_time in", values, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeNotIn(List<Date> values) {
			addCriterion("delivery_time not in", values, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
			addCriterion("delivery_time between", value1, value2, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
			addCriterion("delivery_time not between", value1, value2, "deliveryTime");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andBak1IsNull() {
			addCriterion("bak1 is null");
			return (Criteria) this;
		}

		public Criteria andBak1IsNotNull() {
			addCriterion("bak1 is not null");
			return (Criteria) this;
		}

		public Criteria andBak1EqualTo(String value) {
			addCriterion("bak1 =", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1NotEqualTo(String value) {
			addCriterion("bak1 <>", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1GreaterThan(String value) {
			addCriterion("bak1 >", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1GreaterThanOrEqualTo(String value) {
			addCriterion("bak1 >=", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1LessThan(String value) {
			addCriterion("bak1 <", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1LessThanOrEqualTo(String value) {
			addCriterion("bak1 <=", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1Like(String value) {
			addCriterion("bak1 like", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1NotLike(String value) {
			addCriterion("bak1 not like", value, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1In(List<String> values) {
			addCriterion("bak1 in", values, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1NotIn(List<String> values) {
			addCriterion("bak1 not in", values, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1Between(String value1, String value2) {
			addCriterion("bak1 between", value1, value2, "bak1");
			return (Criteria) this;
		}

		public Criteria andBak1NotBetween(String value1, String value2) {
			addCriterion("bak1 not between", value1, value2, "bak1");
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