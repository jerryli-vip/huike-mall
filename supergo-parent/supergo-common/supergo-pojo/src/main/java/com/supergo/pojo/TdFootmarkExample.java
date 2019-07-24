package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TdFootmarkExample implements Serializable {

	private static final long serialVersionUID = 7668840023833401412L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TdFootmarkExample() {
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

		public Criteria andFootmarkIdIsNull() {
			addCriterion("footmark_id is null");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdIsNotNull() {
			addCriterion("footmark_id is not null");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdEqualTo(Integer value) {
			addCriterion("footmark_id =", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdNotEqualTo(Integer value) {
			addCriterion("footmark_id <>", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdGreaterThan(Integer value) {
			addCriterion("footmark_id >", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("footmark_id >=", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdLessThan(Integer value) {
			addCriterion("footmark_id <", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdLessThanOrEqualTo(Integer value) {
			addCriterion("footmark_id <=", value, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdIn(List<Integer> values) {
			addCriterion("footmark_id in", values, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdNotIn(List<Integer> values) {
			addCriterion("footmark_id not in", values, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdBetween(Integer value1, Integer value2) {
			addCriterion("footmark_id between", value1, value2, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andFootmarkIdNotBetween(Integer value1, Integer value2) {
			addCriterion("footmark_id not between", value1, value2, "footmarkId");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(Integer value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(Integer value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(Integer value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(Integer value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Integer value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<Integer> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<Integer> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(Integer value1, Integer value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(BigDecimal value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(BigDecimal value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(BigDecimal value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("price >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(BigDecimal value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<BigDecimal> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<BigDecimal> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andIntroduceIsNull() {
			addCriterion("introduce is null");
			return (Criteria) this;
		}

		public Criteria andIntroduceIsNotNull() {
			addCriterion("introduce is not null");
			return (Criteria) this;
		}

		public Criteria andIntroduceEqualTo(String value) {
			addCriterion("introduce =", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotEqualTo(String value) {
			addCriterion("introduce <>", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceGreaterThan(String value) {
			addCriterion("introduce >", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
			addCriterion("introduce >=", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLessThan(String value) {
			addCriterion("introduce <", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLessThanOrEqualTo(String value) {
			addCriterion("introduce <=", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceLike(String value) {
			addCriterion("introduce like", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotLike(String value) {
			addCriterion("introduce not like", value, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceIn(List<String> values) {
			addCriterion("introduce in", values, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotIn(List<String> values) {
			addCriterion("introduce not in", values, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceBetween(String value1, String value2) {
			addCriterion("introduce between", value1, value2, "introduce");
			return (Criteria) this;
		}

		public Criteria andIntroduceNotBetween(String value1, String value2) {
			addCriterion("introduce not between", value1, value2, "introduce");
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

		public Criteria andUodateIdIsNull() {
			addCriterion("uodate_id is null");
			return (Criteria) this;
		}

		public Criteria andUodateIdIsNotNull() {
			addCriterion("uodate_id is not null");
			return (Criteria) this;
		}

		public Criteria andUodateIdEqualTo(String value) {
			addCriterion("uodate_id =", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdNotEqualTo(String value) {
			addCriterion("uodate_id <>", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdGreaterThan(String value) {
			addCriterion("uodate_id >", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdGreaterThanOrEqualTo(String value) {
			addCriterion("uodate_id >=", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdLessThan(String value) {
			addCriterion("uodate_id <", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdLessThanOrEqualTo(String value) {
			addCriterion("uodate_id <=", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdLike(String value) {
			addCriterion("uodate_id like", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdNotLike(String value) {
			addCriterion("uodate_id not like", value, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdIn(List<String> values) {
			addCriterion("uodate_id in", values, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdNotIn(List<String> values) {
			addCriterion("uodate_id not in", values, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdBetween(String value1, String value2) {
			addCriterion("uodate_id between", value1, value2, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUodateIdNotBetween(String value1, String value2) {
			addCriterion("uodate_id not between", value1, value2, "uodateId");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeIsNull() {
			addCriterion("udpate_time is null");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeIsNotNull() {
			addCriterion("udpate_time is not null");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeEqualTo(Date value) {
			addCriterion("udpate_time =", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeNotEqualTo(Date value) {
			addCriterion("udpate_time <>", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeGreaterThan(Date value) {
			addCriterion("udpate_time >", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("udpate_time >=", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeLessThan(Date value) {
			addCriterion("udpate_time <", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeLessThanOrEqualTo(Date value) {
			addCriterion("udpate_time <=", value, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeIn(List<Date> values) {
			addCriterion("udpate_time in", values, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeNotIn(List<Date> values) {
			addCriterion("udpate_time not in", values, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeBetween(Date value1, Date value2) {
			addCriterion("udpate_time between", value1, value2, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andUdpateTimeNotBetween(Date value1, Date value2) {
			addCriterion("udpate_time not between", value1, value2, "udpateTime");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetIsNull() {
			addCriterion("footmark_deletet is null");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetIsNotNull() {
			addCriterion("footmark_deletet is not null");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetEqualTo(String value) {
			addCriterion("footmark_deletet =", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetNotEqualTo(String value) {
			addCriterion("footmark_deletet <>", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetGreaterThan(String value) {
			addCriterion("footmark_deletet >", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetGreaterThanOrEqualTo(String value) {
			addCriterion("footmark_deletet >=", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetLessThan(String value) {
			addCriterion("footmark_deletet <", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetLessThanOrEqualTo(String value) {
			addCriterion("footmark_deletet <=", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetLike(String value) {
			addCriterion("footmark_deletet like", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetNotLike(String value) {
			addCriterion("footmark_deletet not like", value, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetIn(List<String> values) {
			addCriterion("footmark_deletet in", values, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetNotIn(List<String> values) {
			addCriterion("footmark_deletet not in", values, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetBetween(String value1, String value2) {
			addCriterion("footmark_deletet between", value1, value2, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkDeletetNotBetween(String value1, String value2) {
			addCriterion("footmark_deletet not between", value1, value2, "footmarkDeletet");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1IsNull() {
			addCriterion("footmark_remaks1 is null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1IsNotNull() {
			addCriterion("footmark_remaks1 is not null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1EqualTo(String value) {
			addCriterion("footmark_remaks1 =", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1NotEqualTo(String value) {
			addCriterion("footmark_remaks1 <>", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1GreaterThan(String value) {
			addCriterion("footmark_remaks1 >", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1GreaterThanOrEqualTo(String value) {
			addCriterion("footmark_remaks1 >=", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1LessThan(String value) {
			addCriterion("footmark_remaks1 <", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1LessThanOrEqualTo(String value) {
			addCriterion("footmark_remaks1 <=", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1Like(String value) {
			addCriterion("footmark_remaks1 like", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1NotLike(String value) {
			addCriterion("footmark_remaks1 not like", value, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1In(List<String> values) {
			addCriterion("footmark_remaks1 in", values, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1NotIn(List<String> values) {
			addCriterion("footmark_remaks1 not in", values, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1Between(String value1, String value2) {
			addCriterion("footmark_remaks1 between", value1, value2, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks1NotBetween(String value1, String value2) {
			addCriterion("footmark_remaks1 not between", value1, value2, "footmarkRemaks1");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2IsNull() {
			addCriterion("footmark_remaks2 is null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2IsNotNull() {
			addCriterion("footmark_remaks2 is not null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2EqualTo(String value) {
			addCriterion("footmark_remaks2 =", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2NotEqualTo(String value) {
			addCriterion("footmark_remaks2 <>", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2GreaterThan(String value) {
			addCriterion("footmark_remaks2 >", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2GreaterThanOrEqualTo(String value) {
			addCriterion("footmark_remaks2 >=", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2LessThan(String value) {
			addCriterion("footmark_remaks2 <", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2LessThanOrEqualTo(String value) {
			addCriterion("footmark_remaks2 <=", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2Like(String value) {
			addCriterion("footmark_remaks2 like", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2NotLike(String value) {
			addCriterion("footmark_remaks2 not like", value, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2In(List<String> values) {
			addCriterion("footmark_remaks2 in", values, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2NotIn(List<String> values) {
			addCriterion("footmark_remaks2 not in", values, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2Between(String value1, String value2) {
			addCriterion("footmark_remaks2 between", value1, value2, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks2NotBetween(String value1, String value2) {
			addCriterion("footmark_remaks2 not between", value1, value2, "footmarkRemaks2");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3IsNull() {
			addCriterion("footmark_remaks3 is null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3IsNotNull() {
			addCriterion("footmark_remaks3 is not null");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3EqualTo(String value) {
			addCriterion("footmark_remaks3 =", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3NotEqualTo(String value) {
			addCriterion("footmark_remaks3 <>", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3GreaterThan(String value) {
			addCriterion("footmark_remaks3 >", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3GreaterThanOrEqualTo(String value) {
			addCriterion("footmark_remaks3 >=", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3LessThan(String value) {
			addCriterion("footmark_remaks3 <", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3LessThanOrEqualTo(String value) {
			addCriterion("footmark_remaks3 <=", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3Like(String value) {
			addCriterion("footmark_remaks3 like", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3NotLike(String value) {
			addCriterion("footmark_remaks3 not like", value, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3In(List<String> values) {
			addCriterion("footmark_remaks3 in", values, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3NotIn(List<String> values) {
			addCriterion("footmark_remaks3 not in", values, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3Between(String value1, String value2) {
			addCriterion("footmark_remaks3 between", value1, value2, "footmarkRemaks3");
			return (Criteria) this;
		}

		public Criteria andFootmarkRemaks3NotBetween(String value1, String value2) {
			addCriterion("footmark_remaks3 not between", value1, value2, "footmarkRemaks3");
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