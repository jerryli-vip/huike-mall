package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAddressExample implements Serializable {

	private static final long serialVersionUID = 8983973078389309940L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbAddressExample() {
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

		public Criteria andAddressIdIsNull() {
			addCriterion("address_id is null");
			return (Criteria) this;
		}

		public Criteria andAddressIdIsNotNull() {
			addCriterion("address_id is not null");
			return (Criteria) this;
		}

		public Criteria andAddressIdEqualTo(Integer value) {
			addCriterion("address_id =", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdNotEqualTo(Integer value) {
			addCriterion("address_id <>", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdGreaterThan(Integer value) {
			addCriterion("address_id >", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("address_id >=", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdLessThan(Integer value) {
			addCriterion("address_id <", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
			addCriterion("address_id <=", value, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdIn(List<Integer> values) {
			addCriterion("address_id in", values, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdNotIn(List<Integer> values) {
			addCriterion("address_id not in", values, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdBetween(Integer value1, Integer value2) {
			addCriterion("address_id between", value1, value2, "addressId");
			return (Criteria) this;
		}

		public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
			addCriterion("address_id not between", value1, value2, "addressId");
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

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNull() {
			addCriterion("province is null");
			return (Criteria) this;
		}

		public Criteria andProvinceIsNotNull() {
			addCriterion("province is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceEqualTo(String value) {
			addCriterion("province =", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotEqualTo(String value) {
			addCriterion("province <>", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThan(String value) {
			addCriterion("province >", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceGreaterThanOrEqualTo(String value) {
			addCriterion("province >=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThan(String value) {
			addCriterion("province <", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLessThanOrEqualTo(String value) {
			addCriterion("province <=", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceLike(String value) {
			addCriterion("province like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotLike(String value) {
			addCriterion("province not like", value, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceIn(List<String> values) {
			addCriterion("province in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotIn(List<String> values) {
			addCriterion("province not in", values, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceBetween(String value1, String value2) {
			addCriterion("province between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andProvinceNotBetween(String value1, String value2) {
			addCriterion("province not between", value1, value2, "province");
			return (Criteria) this;
		}

		public Criteria andCityIsNull() {
			addCriterion("city is null");
			return (Criteria) this;
		}

		public Criteria andCityIsNotNull() {
			addCriterion("city is not null");
			return (Criteria) this;
		}

		public Criteria andCityEqualTo(String value) {
			addCriterion("city =", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotEqualTo(String value) {
			addCriterion("city <>", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThan(String value) {
			addCriterion("city >", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("city >=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThan(String value) {
			addCriterion("city <", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("city <=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLike(String value) {
			addCriterion("city like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotLike(String value) {
			addCriterion("city not like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityIn(List<String> values) {
			addCriterion("city in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotIn(List<String> values) {
			addCriterion("city not in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityBetween(String value1, String value2) {
			addCriterion("city between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("city not between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andAreaIsNull() {
			addCriterion("area is null");
			return (Criteria) this;
		}

		public Criteria andAreaIsNotNull() {
			addCriterion("area is not null");
			return (Criteria) this;
		}

		public Criteria andAreaEqualTo(String value) {
			addCriterion("area =", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotEqualTo(String value) {
			addCriterion("area <>", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThan(String value) {
			addCriterion("area >", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThanOrEqualTo(String value) {
			addCriterion("area >=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThan(String value) {
			addCriterion("area <", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThanOrEqualTo(String value) {
			addCriterion("area <=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLike(String value) {
			addCriterion("area like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotLike(String value) {
			addCriterion("area not like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIn(List<String> values) {
			addCriterion("area in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotIn(List<String> values) {
			addCriterion("area not in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaBetween(String value1, String value2) {
			addCriterion("area between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotBetween(String value1, String value2) {
			addCriterion("area not between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressIsNull() {
			addCriterion("detailed_address is null");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressIsNotNull() {
			addCriterion("detailed_address is not null");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressEqualTo(String value) {
			addCriterion("detailed_address =", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressNotEqualTo(String value) {
			addCriterion("detailed_address <>", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressGreaterThan(String value) {
			addCriterion("detailed_address >", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
			addCriterion("detailed_address >=", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressLessThan(String value) {
			addCriterion("detailed_address <", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
			addCriterion("detailed_address <=", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressLike(String value) {
			addCriterion("detailed_address like", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressNotLike(String value) {
			addCriterion("detailed_address not like", value, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressIn(List<String> values) {
			addCriterion("detailed_address in", values, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressNotIn(List<String> values) {
			addCriterion("detailed_address not in", values, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressBetween(String value1, String value2) {
			addCriterion("detailed_address between", value1, value2, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andDetailedAddressNotBetween(String value1, String value2) {
			addCriterion("detailed_address not between", value1, value2, "detailedAddress");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
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

		public Criteria andAddressAliasIsNull() {
			addCriterion("address_alias is null");
			return (Criteria) this;
		}

		public Criteria andAddressAliasIsNotNull() {
			addCriterion("address_alias is not null");
			return (Criteria) this;
		}

		public Criteria andAddressAliasEqualTo(String value) {
			addCriterion("address_alias =", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasNotEqualTo(String value) {
			addCriterion("address_alias <>", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasGreaterThan(String value) {
			addCriterion("address_alias >", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasGreaterThanOrEqualTo(String value) {
			addCriterion("address_alias >=", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasLessThan(String value) {
			addCriterion("address_alias <", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasLessThanOrEqualTo(String value) {
			addCriterion("address_alias <=", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasLike(String value) {
			addCriterion("address_alias like", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasNotLike(String value) {
			addCriterion("address_alias not like", value, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasIn(List<String> values) {
			addCriterion("address_alias in", values, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasNotIn(List<String> values) {
			addCriterion("address_alias not in", values, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasBetween(String value1, String value2) {
			addCriterion("address_alias between", value1, value2, "addressAlias");
			return (Criteria) this;
		}

		public Criteria andAddressAliasNotBetween(String value1, String value2) {
			addCriterion("address_alias not between", value1, value2, "addressAlias");
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

		public Criteria andIsDefaultIsNull() {
			addCriterion("is_default is null");
			return (Criteria) this;
		}

		public Criteria andIsDefaultIsNotNull() {
			addCriterion("is_default is not null");
			return (Criteria) this;
		}

		public Criteria andIsDefaultEqualTo(String value) {
			addCriterion("is_default =", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultNotEqualTo(String value) {
			addCriterion("is_default <>", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultGreaterThan(String value) {
			addCriterion("is_default >", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
			addCriterion("is_default >=", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultLessThan(String value) {
			addCriterion("is_default <", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultLessThanOrEqualTo(String value) {
			addCriterion("is_default <=", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultLike(String value) {
			addCriterion("is_default like", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultNotLike(String value) {
			addCriterion("is_default not like", value, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultIn(List<String> values) {
			addCriterion("is_default in", values, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultNotIn(List<String> values) {
			addCriterion("is_default not in", values, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultBetween(String value1, String value2) {
			addCriterion("is_default between", value1, value2, "isDefault");
			return (Criteria) this;
		}

		public Criteria andIsDefaultNotBetween(String value1, String value2) {
			addCriterion("is_default not between", value1, value2, "isDefault");
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