package com.supergo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAdExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbAdExample() {
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

		public Criteria andAdIdIsNull() {
			addCriterion("ad_id is null");
			return (Criteria) this;
		}

		public Criteria andAdIdIsNotNull() {
			addCriterion("ad_id is not null");
			return (Criteria) this;
		}

		public Criteria andAdIdEqualTo(Integer value) {
			addCriterion("ad_id =", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdNotEqualTo(Integer value) {
			addCriterion("ad_id <>", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdGreaterThan(Integer value) {
			addCriterion("ad_id >", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("ad_id >=", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdLessThan(Integer value) {
			addCriterion("ad_id <", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdLessThanOrEqualTo(Integer value) {
			addCriterion("ad_id <=", value, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdIn(List<Integer> values) {
			addCriterion("ad_id in", values, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdNotIn(List<Integer> values) {
			addCriterion("ad_id not in", values, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdBetween(Integer value1, Integer value2) {
			addCriterion("ad_id between", value1, value2, "adId");
			return (Criteria) this;
		}

		public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
			addCriterion("ad_id not between", value1, value2, "adId");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andPicIsNull() {
			addCriterion("pic is null");
			return (Criteria) this;
		}

		public Criteria andPicIsNotNull() {
			addCriterion("pic is not null");
			return (Criteria) this;
		}

		public Criteria andPicEqualTo(String value) {
			addCriterion("pic =", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotEqualTo(String value) {
			addCriterion("pic <>", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThan(String value) {
			addCriterion("pic >", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicGreaterThanOrEqualTo(String value) {
			addCriterion("pic >=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThan(String value) {
			addCriterion("pic <", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLessThanOrEqualTo(String value) {
			addCriterion("pic <=", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicLike(String value) {
			addCriterion("pic like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotLike(String value) {
			addCriterion("pic not like", value, "pic");
			return (Criteria) this;
		}

		public Criteria andPicIn(List<String> values) {
			addCriterion("pic in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotIn(List<String> values) {
			addCriterion("pic not in", values, "pic");
			return (Criteria) this;
		}

		public Criteria andPicBetween(String value1, String value2) {
			addCriterion("pic between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andPicNotBetween(String value1, String value2) {
			addCriterion("pic not between", value1, value2, "pic");
			return (Criteria) this;
		}

		public Criteria andSortIsNull() {
			addCriterion("sort is null");
			return (Criteria) this;
		}

		public Criteria andSortIsNotNull() {
			addCriterion("sort is not null");
			return (Criteria) this;
		}

		public Criteria andSortEqualTo(String value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotEqualTo(String value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThan(String value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThanOrEqualTo(String value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThan(String value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThanOrEqualTo(String value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLike(String value) {
			addCriterion("sort like", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotLike(String value) {
			addCriterion("sort not like", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortIn(List<String> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotIn(List<String> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortBetween(String value1, String value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotBetween(String value1, String value2) {
			addCriterion("sort not between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andValidIsNull() {
			addCriterion("valid is null");
			return (Criteria) this;
		}

		public Criteria andValidIsNotNull() {
			addCriterion("valid is not null");
			return (Criteria) this;
		}

		public Criteria andValidEqualTo(String value) {
			addCriterion("valid =", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotEqualTo(String value) {
			addCriterion("valid <>", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThan(String value) {
			addCriterion("valid >", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThanOrEqualTo(String value) {
			addCriterion("valid >=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThan(String value) {
			addCriterion("valid <", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThanOrEqualTo(String value) {
			addCriterion("valid <=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLike(String value) {
			addCriterion("valid like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotLike(String value) {
			addCriterion("valid not like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidIn(List<String> values) {
			addCriterion("valid in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotIn(List<String> values) {
			addCriterion("valid not in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidBetween(String value1, String value2) {
			addCriterion("valid between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotBetween(String value1, String value2) {
			addCriterion("valid not between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andOntimeIsNull() {
			addCriterion("ontime is null");
			return (Criteria) this;
		}

		public Criteria andOntimeIsNotNull() {
			addCriterion("ontime is not null");
			return (Criteria) this;
		}

		public Criteria andOntimeEqualTo(Date value) {
			addCriterion("ontime =", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeNotEqualTo(Date value) {
			addCriterion("ontime <>", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeGreaterThan(Date value) {
			addCriterion("ontime >", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeGreaterThanOrEqualTo(Date value) {
			addCriterion("ontime >=", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeLessThan(Date value) {
			addCriterion("ontime <", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeLessThanOrEqualTo(Date value) {
			addCriterion("ontime <=", value, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeIn(List<Date> values) {
			addCriterion("ontime in", values, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeNotIn(List<Date> values) {
			addCriterion("ontime not in", values, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeBetween(Date value1, Date value2) {
			addCriterion("ontime between", value1, value2, "ontime");
			return (Criteria) this;
		}

		public Criteria andOntimeNotBetween(Date value1, Date value2) {
			addCriterion("ontime not between", value1, value2, "ontime");
			return (Criteria) this;
		}

		public Criteria andOfftimeIsNull() {
			addCriterion("offtime is null");
			return (Criteria) this;
		}

		public Criteria andOfftimeIsNotNull() {
			addCriterion("offtime is not null");
			return (Criteria) this;
		}

		public Criteria andOfftimeEqualTo(Date value) {
			addCriterion("offtime =", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeNotEqualTo(Date value) {
			addCriterion("offtime <>", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeGreaterThan(Date value) {
			addCriterion("offtime >", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeGreaterThanOrEqualTo(Date value) {
			addCriterion("offtime >=", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeLessThan(Date value) {
			addCriterion("offtime <", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeLessThanOrEqualTo(Date value) {
			addCriterion("offtime <=", value, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeIn(List<Date> values) {
			addCriterion("offtime in", values, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeNotIn(List<Date> values) {
			addCriterion("offtime not in", values, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeBetween(Date value1, Date value2) {
			addCriterion("offtime between", value1, value2, "offtime");
			return (Criteria) this;
		}

		public Criteria andOfftimeNotBetween(Date value1, Date value2) {
			addCriterion("offtime not between", value1, value2, "offtime");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIsNull() {
			addCriterion("category_id is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIsNotNull() {
			addCriterion("category_id is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdEqualTo(Integer value) {
			addCriterion("category_id =", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotEqualTo(Integer value) {
			addCriterion("category_id <>", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThan(Integer value) {
			addCriterion("category_id >", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("category_id >=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThan(Integer value) {
			addCriterion("category_id <", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
			addCriterion("category_id <=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIn(List<Integer> values) {
			addCriterion("category_id in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotIn(List<Integer> values) {
			addCriterion("category_id not in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
			addCriterion("category_id between", value1, value2, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
			addCriterion("category_id not between", value1, value2, "categoryId");
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