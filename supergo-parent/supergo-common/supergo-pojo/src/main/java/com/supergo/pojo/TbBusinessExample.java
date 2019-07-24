package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBusinessExample implements Serializable {

	private static final long serialVersionUID = -4297522352407081475L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbBusinessExample() {
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

		public Criteria andBusinessIdIsNull() {
			addCriterion("business_id is null");
			return (Criteria) this;
		}

		public Criteria andBusinessIdIsNotNull() {
			addCriterion("business_id is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessIdEqualTo(Integer value) {
			addCriterion("business_id =", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdNotEqualTo(Integer value) {
			addCriterion("business_id <>", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdGreaterThan(Integer value) {
			addCriterion("business_id >", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("business_id >=", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdLessThan(Integer value) {
			addCriterion("business_id <", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
			addCriterion("business_id <=", value, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdIn(List<Integer> values) {
			addCriterion("business_id in", values, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdNotIn(List<Integer> values) {
			addCriterion("business_id not in", values, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
			addCriterion("business_id between", value1, value2, "businessId");
			return (Criteria) this;
		}

		public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
			addCriterion("business_id not between", value1, value2, "businessId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdIsNull() {
			addCriterion("default_shop_id is null");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdIsNotNull() {
			addCriterion("default_shop_id is not null");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdEqualTo(Integer value) {
			addCriterion("default_shop_id =", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdNotEqualTo(Integer value) {
			addCriterion("default_shop_id <>", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdGreaterThan(Integer value) {
			addCriterion("default_shop_id >", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("default_shop_id >=", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdLessThan(Integer value) {
			addCriterion("default_shop_id <", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdLessThanOrEqualTo(Integer value) {
			addCriterion("default_shop_id <=", value, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdIn(List<Integer> values) {
			addCriterion("default_shop_id in", values, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdNotIn(List<Integer> values) {
			addCriterion("default_shop_id not in", values, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdBetween(Integer value1, Integer value2) {
			addCriterion("default_shop_id between", value1, value2, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopIdNotBetween(Integer value1, Integer value2) {
			addCriterion("default_shop_id not between", value1, value2, "defaultShopId");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameIsNull() {
			addCriterion("default_shop_name is null");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameIsNotNull() {
			addCriterion("default_shop_name is not null");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameEqualTo(String value) {
			addCriterion("default_shop_name =", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameNotEqualTo(String value) {
			addCriterion("default_shop_name <>", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameGreaterThan(String value) {
			addCriterion("default_shop_name >", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameGreaterThanOrEqualTo(String value) {
			addCriterion("default_shop_name >=", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameLessThan(String value) {
			addCriterion("default_shop_name <", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameLessThanOrEqualTo(String value) {
			addCriterion("default_shop_name <=", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameLike(String value) {
			addCriterion("default_shop_name like", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameNotLike(String value) {
			addCriterion("default_shop_name not like", value, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameIn(List<String> values) {
			addCriterion("default_shop_name in", values, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameNotIn(List<String> values) {
			addCriterion("default_shop_name not in", values, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameBetween(String value1, String value2) {
			addCriterion("default_shop_name between", value1, value2, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andDefaultShopNameNotBetween(String value1, String value2) {
			addCriterion("default_shop_name not between", value1, value2, "defaultShopName");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusIsNull() {
			addCriterion("business_status is null");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusIsNotNull() {
			addCriterion("business_status is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusEqualTo(Integer value) {
			addCriterion("business_status =", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusNotEqualTo(Integer value) {
			addCriterion("business_status <>", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusGreaterThan(Integer value) {
			addCriterion("business_status >", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("business_status >=", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusLessThan(Integer value) {
			addCriterion("business_status <", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusLessThanOrEqualTo(Integer value) {
			addCriterion("business_status <=", value, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusIn(List<Integer> values) {
			addCriterion("business_status in", values, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusNotIn(List<Integer> values) {
			addCriterion("business_status not in", values, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusBetween(Integer value1, Integer value2) {
			addCriterion("business_status between", value1, value2, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andBusinessStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("business_status not between", value1, value2, "businessStatus");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andCompNameIsNull() {
			addCriterion("comp_name is null");
			return (Criteria) this;
		}

		public Criteria andCompNameIsNotNull() {
			addCriterion("comp_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompNameEqualTo(String value) {
			addCriterion("comp_name =", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameNotEqualTo(String value) {
			addCriterion("comp_name <>", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameGreaterThan(String value) {
			addCriterion("comp_name >", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameGreaterThanOrEqualTo(String value) {
			addCriterion("comp_name >=", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameLessThan(String value) {
			addCriterion("comp_name <", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameLessThanOrEqualTo(String value) {
			addCriterion("comp_name <=", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameLike(String value) {
			addCriterion("comp_name like", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameNotLike(String value) {
			addCriterion("comp_name not like", value, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameIn(List<String> values) {
			addCriterion("comp_name in", values, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameNotIn(List<String> values) {
			addCriterion("comp_name not in", values, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameBetween(String value1, String value2) {
			addCriterion("comp_name between", value1, value2, "compName");
			return (Criteria) this;
		}

		public Criteria andCompNameNotBetween(String value1, String value2) {
			addCriterion("comp_name not between", value1, value2, "compName");
			return (Criteria) this;
		}

		public Criteria andCompMobileIsNull() {
			addCriterion("comp_mobile is null");
			return (Criteria) this;
		}

		public Criteria andCompMobileIsNotNull() {
			addCriterion("comp_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andCompMobileEqualTo(String value) {
			addCriterion("comp_mobile =", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileNotEqualTo(String value) {
			addCriterion("comp_mobile <>", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileGreaterThan(String value) {
			addCriterion("comp_mobile >", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileGreaterThanOrEqualTo(String value) {
			addCriterion("comp_mobile >=", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileLessThan(String value) {
			addCriterion("comp_mobile <", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileLessThanOrEqualTo(String value) {
			addCriterion("comp_mobile <=", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileLike(String value) {
			addCriterion("comp_mobile like", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileNotLike(String value) {
			addCriterion("comp_mobile not like", value, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileIn(List<String> values) {
			addCriterion("comp_mobile in", values, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileNotIn(List<String> values) {
			addCriterion("comp_mobile not in", values, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileBetween(String value1, String value2) {
			addCriterion("comp_mobile between", value1, value2, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompMobileNotBetween(String value1, String value2) {
			addCriterion("comp_mobile not between", value1, value2, "compMobile");
			return (Criteria) this;
		}

		public Criteria andCompPhoneIsNull() {
			addCriterion("comp_phone is null");
			return (Criteria) this;
		}

		public Criteria andCompPhoneIsNotNull() {
			addCriterion("comp_phone is not null");
			return (Criteria) this;
		}

		public Criteria andCompPhoneEqualTo(String value) {
			addCriterion("comp_phone =", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneNotEqualTo(String value) {
			addCriterion("comp_phone <>", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneGreaterThan(String value) {
			addCriterion("comp_phone >", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("comp_phone >=", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneLessThan(String value) {
			addCriterion("comp_phone <", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneLessThanOrEqualTo(String value) {
			addCriterion("comp_phone <=", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneLike(String value) {
			addCriterion("comp_phone like", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneNotLike(String value) {
			addCriterion("comp_phone not like", value, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneIn(List<String> values) {
			addCriterion("comp_phone in", values, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneNotIn(List<String> values) {
			addCriterion("comp_phone not in", values, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneBetween(String value1, String value2) {
			addCriterion("comp_phone between", value1, value2, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompPhoneNotBetween(String value1, String value2) {
			addCriterion("comp_phone not between", value1, value2, "compPhone");
			return (Criteria) this;
		}

		public Criteria andCompAddressIsNull() {
			addCriterion("comp_address is null");
			return (Criteria) this;
		}

		public Criteria andCompAddressIsNotNull() {
			addCriterion("comp_address is not null");
			return (Criteria) this;
		}

		public Criteria andCompAddressEqualTo(String value) {
			addCriterion("comp_address =", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressNotEqualTo(String value) {
			addCriterion("comp_address <>", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressGreaterThan(String value) {
			addCriterion("comp_address >", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressGreaterThanOrEqualTo(String value) {
			addCriterion("comp_address >=", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressLessThan(String value) {
			addCriterion("comp_address <", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressLessThanOrEqualTo(String value) {
			addCriterion("comp_address <=", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressLike(String value) {
			addCriterion("comp_address like", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressNotLike(String value) {
			addCriterion("comp_address not like", value, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressIn(List<String> values) {
			addCriterion("comp_address in", values, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressNotIn(List<String> values) {
			addCriterion("comp_address not in", values, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressBetween(String value1, String value2) {
			addCriterion("comp_address between", value1, value2, "compAddress");
			return (Criteria) this;
		}

		public Criteria andCompAddressNotBetween(String value1, String value2) {
			addCriterion("comp_address not between", value1, value2, "compAddress");
			return (Criteria) this;
		}

		public Criteria andConNameIsNull() {
			addCriterion("con_name is null");
			return (Criteria) this;
		}

		public Criteria andConNameIsNotNull() {
			addCriterion("con_name is not null");
			return (Criteria) this;
		}

		public Criteria andConNameEqualTo(String value) {
			addCriterion("con_name =", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameNotEqualTo(String value) {
			addCriterion("con_name <>", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameGreaterThan(String value) {
			addCriterion("con_name >", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameGreaterThanOrEqualTo(String value) {
			addCriterion("con_name >=", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameLessThan(String value) {
			addCriterion("con_name <", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameLessThanOrEqualTo(String value) {
			addCriterion("con_name <=", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameLike(String value) {
			addCriterion("con_name like", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameNotLike(String value) {
			addCriterion("con_name not like", value, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameIn(List<String> values) {
			addCriterion("con_name in", values, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameNotIn(List<String> values) {
			addCriterion("con_name not in", values, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameBetween(String value1, String value2) {
			addCriterion("con_name between", value1, value2, "conName");
			return (Criteria) this;
		}

		public Criteria andConNameNotBetween(String value1, String value2) {
			addCriterion("con_name not between", value1, value2, "conName");
			return (Criteria) this;
		}

		public Criteria andConQqIsNull() {
			addCriterion("con_qq is null");
			return (Criteria) this;
		}

		public Criteria andConQqIsNotNull() {
			addCriterion("con_qq is not null");
			return (Criteria) this;
		}

		public Criteria andConQqEqualTo(String value) {
			addCriterion("con_qq =", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqNotEqualTo(String value) {
			addCriterion("con_qq <>", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqGreaterThan(String value) {
			addCriterion("con_qq >", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqGreaterThanOrEqualTo(String value) {
			addCriterion("con_qq >=", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqLessThan(String value) {
			addCriterion("con_qq <", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqLessThanOrEqualTo(String value) {
			addCriterion("con_qq <=", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqLike(String value) {
			addCriterion("con_qq like", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqNotLike(String value) {
			addCriterion("con_qq not like", value, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqIn(List<String> values) {
			addCriterion("con_qq in", values, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqNotIn(List<String> values) {
			addCriterion("con_qq not in", values, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqBetween(String value1, String value2) {
			addCriterion("con_qq between", value1, value2, "conQq");
			return (Criteria) this;
		}

		public Criteria andConQqNotBetween(String value1, String value2) {
			addCriterion("con_qq not between", value1, value2, "conQq");
			return (Criteria) this;
		}

		public Criteria andConMobileIsNull() {
			addCriterion("con_mobile is null");
			return (Criteria) this;
		}

		public Criteria andConMobileIsNotNull() {
			addCriterion("con_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andConMobileEqualTo(String value) {
			addCriterion("con_mobile =", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileNotEqualTo(String value) {
			addCriterion("con_mobile <>", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileGreaterThan(String value) {
			addCriterion("con_mobile >", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileGreaterThanOrEqualTo(String value) {
			addCriterion("con_mobile >=", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileLessThan(String value) {
			addCriterion("con_mobile <", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileLessThanOrEqualTo(String value) {
			addCriterion("con_mobile <=", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileLike(String value) {
			addCriterion("con_mobile like", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileNotLike(String value) {
			addCriterion("con_mobile not like", value, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileIn(List<String> values) {
			addCriterion("con_mobile in", values, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileNotIn(List<String> values) {
			addCriterion("con_mobile not in", values, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileBetween(String value1, String value2) {
			addCriterion("con_mobile between", value1, value2, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConMobileNotBetween(String value1, String value2) {
			addCriterion("con_mobile not between", value1, value2, "conMobile");
			return (Criteria) this;
		}

		public Criteria andConEmailIsNull() {
			addCriterion("con_email is null");
			return (Criteria) this;
		}

		public Criteria andConEmailIsNotNull() {
			addCriterion("con_email is not null");
			return (Criteria) this;
		}

		public Criteria andConEmailEqualTo(String value) {
			addCriterion("con_email =", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailNotEqualTo(String value) {
			addCriterion("con_email <>", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailGreaterThan(String value) {
			addCriterion("con_email >", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailGreaterThanOrEqualTo(String value) {
			addCriterion("con_email >=", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailLessThan(String value) {
			addCriterion("con_email <", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailLessThanOrEqualTo(String value) {
			addCriterion("con_email <=", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailLike(String value) {
			addCriterion("con_email like", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailNotLike(String value) {
			addCriterion("con_email not like", value, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailIn(List<String> values) {
			addCriterion("con_email in", values, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailNotIn(List<String> values) {
			addCriterion("con_email not in", values, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailBetween(String value1, String value2) {
			addCriterion("con_email between", value1, value2, "conEmail");
			return (Criteria) this;
		}

		public Criteria andConEmailNotBetween(String value1, String value2) {
			addCriterion("con_email not between", value1, value2, "conEmail");
			return (Criteria) this;
		}

		public Criteria andLicenseNumIsNull() {
			addCriterion("license_num is null");
			return (Criteria) this;
		}

		public Criteria andLicenseNumIsNotNull() {
			addCriterion("license_num is not null");
			return (Criteria) this;
		}

		public Criteria andLicenseNumEqualTo(String value) {
			addCriterion("license_num =", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumNotEqualTo(String value) {
			addCriterion("license_num <>", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumGreaterThan(String value) {
			addCriterion("license_num >", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumGreaterThanOrEqualTo(String value) {
			addCriterion("license_num >=", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumLessThan(String value) {
			addCriterion("license_num <", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumLessThanOrEqualTo(String value) {
			addCriterion("license_num <=", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumLike(String value) {
			addCriterion("license_num like", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumNotLike(String value) {
			addCriterion("license_num not like", value, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumIn(List<String> values) {
			addCriterion("license_num in", values, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumNotIn(List<String> values) {
			addCriterion("license_num not in", values, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumBetween(String value1, String value2) {
			addCriterion("license_num between", value1, value2, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andLicenseNumNotBetween(String value1, String value2) {
			addCriterion("license_num not between", value1, value2, "licenseNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumIsNull() {
			addCriterion("taxregist_num is null");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumIsNotNull() {
			addCriterion("taxregist_num is not null");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumEqualTo(String value) {
			addCriterion("taxregist_num =", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumNotEqualTo(String value) {
			addCriterion("taxregist_num <>", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumGreaterThan(String value) {
			addCriterion("taxregist_num >", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumGreaterThanOrEqualTo(String value) {
			addCriterion("taxregist_num >=", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumLessThan(String value) {
			addCriterion("taxregist_num <", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumLessThanOrEqualTo(String value) {
			addCriterion("taxregist_num <=", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumLike(String value) {
			addCriterion("taxregist_num like", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumNotLike(String value) {
			addCriterion("taxregist_num not like", value, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumIn(List<String> values) {
			addCriterion("taxregist_num in", values, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumNotIn(List<String> values) {
			addCriterion("taxregist_num not in", values, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumBetween(String value1, String value2) {
			addCriterion("taxregist_num between", value1, value2, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andTaxregistNumNotBetween(String value1, String value2) {
			addCriterion("taxregist_num not between", value1, value2, "taxregistNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumIsNull() {
			addCriterion("organ_num is null");
			return (Criteria) this;
		}

		public Criteria andOrganNumIsNotNull() {
			addCriterion("organ_num is not null");
			return (Criteria) this;
		}

		public Criteria andOrganNumEqualTo(String value) {
			addCriterion("organ_num =", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumNotEqualTo(String value) {
			addCriterion("organ_num <>", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumGreaterThan(String value) {
			addCriterion("organ_num >", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumGreaterThanOrEqualTo(String value) {
			addCriterion("organ_num >=", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumLessThan(String value) {
			addCriterion("organ_num <", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumLessThanOrEqualTo(String value) {
			addCriterion("organ_num <=", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumLike(String value) {
			addCriterion("organ_num like", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumNotLike(String value) {
			addCriterion("organ_num not like", value, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumIn(List<String> values) {
			addCriterion("organ_num in", values, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumNotIn(List<String> values) {
			addCriterion("organ_num not in", values, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumBetween(String value1, String value2) {
			addCriterion("organ_num between", value1, value2, "organNum");
			return (Criteria) this;
		}

		public Criteria andOrganNumNotBetween(String value1, String value2) {
			addCriterion("organ_num not between", value1, value2, "organNum");
			return (Criteria) this;
		}

		public Criteria andLegalIsNull() {
			addCriterion("legal is null");
			return (Criteria) this;
		}

		public Criteria andLegalIsNotNull() {
			addCriterion("legal is not null");
			return (Criteria) this;
		}

		public Criteria andLegalEqualTo(String value) {
			addCriterion("legal =", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalNotEqualTo(String value) {
			addCriterion("legal <>", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalGreaterThan(String value) {
			addCriterion("legal >", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalGreaterThanOrEqualTo(String value) {
			addCriterion("legal >=", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalLessThan(String value) {
			addCriterion("legal <", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalLessThanOrEqualTo(String value) {
			addCriterion("legal <=", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalLike(String value) {
			addCriterion("legal like", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalNotLike(String value) {
			addCriterion("legal not like", value, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalIn(List<String> values) {
			addCriterion("legal in", values, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalNotIn(List<String> values) {
			addCriterion("legal not in", values, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalBetween(String value1, String value2) {
			addCriterion("legal between", value1, value2, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalNotBetween(String value1, String value2) {
			addCriterion("legal not between", value1, value2, "legal");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityIsNull() {
			addCriterion("legal_indentity is null");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityIsNotNull() {
			addCriterion("legal_indentity is not null");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityEqualTo(String value) {
			addCriterion("legal_indentity =", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityNotEqualTo(String value) {
			addCriterion("legal_indentity <>", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityGreaterThan(String value) {
			addCriterion("legal_indentity >", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityGreaterThanOrEqualTo(String value) {
			addCriterion("legal_indentity >=", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityLessThan(String value) {
			addCriterion("legal_indentity <", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityLessThanOrEqualTo(String value) {
			addCriterion("legal_indentity <=", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityLike(String value) {
			addCriterion("legal_indentity like", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityNotLike(String value) {
			addCriterion("legal_indentity not like", value, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityIn(List<String> values) {
			addCriterion("legal_indentity in", values, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityNotIn(List<String> values) {
			addCriterion("legal_indentity not in", values, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityBetween(String value1, String value2) {
			addCriterion("legal_indentity between", value1, value2, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andLegalIndentityNotBetween(String value1, String value2) {
			addCriterion("legal_indentity not between", value1, value2, "legalIndentity");
			return (Criteria) this;
		}

		public Criteria andOpenbankIsNull() {
			addCriterion("openbank is null");
			return (Criteria) this;
		}

		public Criteria andOpenbankIsNotNull() {
			addCriterion("openbank is not null");
			return (Criteria) this;
		}

		public Criteria andOpenbankEqualTo(String value) {
			addCriterion("openbank =", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankNotEqualTo(String value) {
			addCriterion("openbank <>", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankGreaterThan(String value) {
			addCriterion("openbank >", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankGreaterThanOrEqualTo(String value) {
			addCriterion("openbank >=", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankLessThan(String value) {
			addCriterion("openbank <", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankLessThanOrEqualTo(String value) {
			addCriterion("openbank <=", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankLike(String value) {
			addCriterion("openbank like", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankNotLike(String value) {
			addCriterion("openbank not like", value, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankIn(List<String> values) {
			addCriterion("openbank in", values, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankNotIn(List<String> values) {
			addCriterion("openbank not in", values, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankBetween(String value1, String value2) {
			addCriterion("openbank between", value1, value2, "openbank");
			return (Criteria) this;
		}

		public Criteria andOpenbankNotBetween(String value1, String value2) {
			addCriterion("openbank not between", value1, value2, "openbank");
			return (Criteria) this;
		}

		public Criteria andObBranchIsNull() {
			addCriterion("ob_branch is null");
			return (Criteria) this;
		}

		public Criteria andObBranchIsNotNull() {
			addCriterion("ob_branch is not null");
			return (Criteria) this;
		}

		public Criteria andObBranchEqualTo(String value) {
			addCriterion("ob_branch =", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchNotEqualTo(String value) {
			addCriterion("ob_branch <>", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchGreaterThan(String value) {
			addCriterion("ob_branch >", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchGreaterThanOrEqualTo(String value) {
			addCriterion("ob_branch >=", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchLessThan(String value) {
			addCriterion("ob_branch <", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchLessThanOrEqualTo(String value) {
			addCriterion("ob_branch <=", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchLike(String value) {
			addCriterion("ob_branch like", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchNotLike(String value) {
			addCriterion("ob_branch not like", value, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchIn(List<String> values) {
			addCriterion("ob_branch in", values, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchNotIn(List<String> values) {
			addCriterion("ob_branch not in", values, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchBetween(String value1, String value2) {
			addCriterion("ob_branch between", value1, value2, "obBranch");
			return (Criteria) this;
		}

		public Criteria andObBranchNotBetween(String value1, String value2) {
			addCriterion("ob_branch not between", value1, value2, "obBranch");
			return (Criteria) this;
		}

		public Criteria andBankNumIsNull() {
			addCriterion("bank_num is null");
			return (Criteria) this;
		}

		public Criteria andBankNumIsNotNull() {
			addCriterion("bank_num is not null");
			return (Criteria) this;
		}

		public Criteria andBankNumEqualTo(String value) {
			addCriterion("bank_num =", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumNotEqualTo(String value) {
			addCriterion("bank_num <>", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumGreaterThan(String value) {
			addCriterion("bank_num >", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumGreaterThanOrEqualTo(String value) {
			addCriterion("bank_num >=", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumLessThan(String value) {
			addCriterion("bank_num <", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumLessThanOrEqualTo(String value) {
			addCriterion("bank_num <=", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumLike(String value) {
			addCriterion("bank_num like", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumNotLike(String value) {
			addCriterion("bank_num not like", value, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumIn(List<String> values) {
			addCriterion("bank_num in", values, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumNotIn(List<String> values) {
			addCriterion("bank_num not in", values, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumBetween(String value1, String value2) {
			addCriterion("bank_num between", value1, value2, "bankNum");
			return (Criteria) this;
		}

		public Criteria andBankNumNotBetween(String value1, String value2) {
			addCriterion("bank_num not between", value1, value2, "bankNum");
			return (Criteria) this;
		}

		public Criteria andCreateidIsNull() {
			addCriterion("createid is null");
			return (Criteria) this;
		}

		public Criteria andCreateidIsNotNull() {
			addCriterion("createid is not null");
			return (Criteria) this;
		}

		public Criteria andCreateidEqualTo(Integer value) {
			addCriterion("createid =", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidNotEqualTo(Integer value) {
			addCriterion("createid <>", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidGreaterThan(Integer value) {
			addCriterion("createid >", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
			addCriterion("createid >=", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidLessThan(Integer value) {
			addCriterion("createid <", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidLessThanOrEqualTo(Integer value) {
			addCriterion("createid <=", value, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidIn(List<Integer> values) {
			addCriterion("createid in", values, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidNotIn(List<Integer> values) {
			addCriterion("createid not in", values, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidBetween(Integer value1, Integer value2) {
			addCriterion("createid between", value1, value2, "createid");
			return (Criteria) this;
		}

		public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
			addCriterion("createid not between", value1, value2, "createid");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("createtime is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("createtime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Date value) {
			addCriterion("createtime =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("createtime <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Date value) {
			addCriterion("createtime >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("createtime >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Date value) {
			addCriterion("createtime <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("createtime <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Date> values) {
			addCriterion("createtime in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("createtime not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Date value1, Date value2) {
			addCriterion("createtime between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("createtime not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNull() {
			addCriterion("update_user is null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIsNotNull() {
			addCriterion("update_user is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateUserEqualTo(Integer value) {
			addCriterion("update_user =", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotEqualTo(Integer value) {
			addCriterion("update_user <>", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThan(Integer value) {
			addCriterion("update_user >", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserGreaterThanOrEqualTo(Integer value) {
			addCriterion("update_user >=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThan(Integer value) {
			addCriterion("update_user <", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserLessThanOrEqualTo(Integer value) {
			addCriterion("update_user <=", value, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIn(List<Integer> values) {
			addCriterion("update_user in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotIn(List<Integer> values) {
			addCriterion("update_user not in", values, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserBetween(Integer value1, Integer value2) {
			addCriterion("update_user between", value1, value2, "updateUser");
			return (Criteria) this;
		}

		public Criteria andUpdateUserNotBetween(Integer value1, Integer value2) {
			addCriterion("update_user not between", value1, value2, "updateUser");
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

		public Criteria andIsDeleteIsNull() {
			addCriterion("is_delete is null");
			return (Criteria) this;
		}

		public Criteria andIsDeleteIsNotNull() {
			addCriterion("is_delete is not null");
			return (Criteria) this;
		}

		public Criteria andIsDeleteEqualTo(String value) {
			addCriterion("is_delete =", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotEqualTo(String value) {
			addCriterion("is_delete <>", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteGreaterThan(String value) {
			addCriterion("is_delete >", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
			addCriterion("is_delete >=", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteLessThan(String value) {
			addCriterion("is_delete <", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteLessThanOrEqualTo(String value) {
			addCriterion("is_delete <=", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteLike(String value) {
			addCriterion("is_delete like", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotLike(String value) {
			addCriterion("is_delete not like", value, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteIn(List<String> values) {
			addCriterion("is_delete in", values, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotIn(List<String> values) {
			addCriterion("is_delete not in", values, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteBetween(String value1, String value2) {
			addCriterion("is_delete between", value1, value2, "isDelete");
			return (Criteria) this;
		}

		public Criteria andIsDeleteNotBetween(String value1, String value2) {
			addCriterion("is_delete not between", value1, value2, "isDelete");
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