package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbPercentConversionExample implements Serializable {

	private static final long serialVersionUID = 8466547719316760850L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbPercentConversionExample() {
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

		public Criteria andPercentConversionIdIsNull() {
			addCriterion("percent_conversion_id is null");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdIsNotNull() {
			addCriterion("percent_conversion_id is not null");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdEqualTo(Integer value) {
			addCriterion("percent_conversion_id =", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdNotEqualTo(Integer value) {
			addCriterion("percent_conversion_id <>", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdGreaterThan(Integer value) {
			addCriterion("percent_conversion_id >", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("percent_conversion_id >=", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdLessThan(Integer value) {
			addCriterion("percent_conversion_id <", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdLessThanOrEqualTo(Integer value) {
			addCriterion("percent_conversion_id <=", value, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdIn(List<Integer> values) {
			addCriterion("percent_conversion_id in", values, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdNotIn(List<Integer> values) {
			addCriterion("percent_conversion_id not in", values, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdBetween(Integer value1, Integer value2) {
			addCriterion("percent_conversion_id between", value1, value2, "percentConversionId");
			return (Criteria) this;
		}

		public Criteria andPercentConversionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("percent_conversion_id not between", value1, value2, "percentConversionId");
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

		public Criteria andBak4IsNull() {
			addCriterion("bak4 is null");
			return (Criteria) this;
		}

		public Criteria andBak4IsNotNull() {
			addCriterion("bak4 is not null");
			return (Criteria) this;
		}

		public Criteria andBak4EqualTo(String value) {
			addCriterion("bak4 =", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4NotEqualTo(String value) {
			addCriterion("bak4 <>", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4GreaterThan(String value) {
			addCriterion("bak4 >", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4GreaterThanOrEqualTo(String value) {
			addCriterion("bak4 >=", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4LessThan(String value) {
			addCriterion("bak4 <", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4LessThanOrEqualTo(String value) {
			addCriterion("bak4 <=", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4Like(String value) {
			addCriterion("bak4 like", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4NotLike(String value) {
			addCriterion("bak4 not like", value, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4In(List<String> values) {
			addCriterion("bak4 in", values, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4NotIn(List<String> values) {
			addCriterion("bak4 not in", values, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4Between(String value1, String value2) {
			addCriterion("bak4 between", value1, value2, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak4NotBetween(String value1, String value2) {
			addCriterion("bak4 not between", value1, value2, "bak4");
			return (Criteria) this;
		}

		public Criteria andBak5IsNull() {
			addCriterion("bak5 is null");
			return (Criteria) this;
		}

		public Criteria andBak5IsNotNull() {
			addCriterion("bak5 is not null");
			return (Criteria) this;
		}

		public Criteria andBak5EqualTo(String value) {
			addCriterion("bak5 =", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5NotEqualTo(String value) {
			addCriterion("bak5 <>", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5GreaterThan(String value) {
			addCriterion("bak5 >", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5GreaterThanOrEqualTo(String value) {
			addCriterion("bak5 >=", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5LessThan(String value) {
			addCriterion("bak5 <", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5LessThanOrEqualTo(String value) {
			addCriterion("bak5 <=", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5Like(String value) {
			addCriterion("bak5 like", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5NotLike(String value) {
			addCriterion("bak5 not like", value, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5In(List<String> values) {
			addCriterion("bak5 in", values, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5NotIn(List<String> values) {
			addCriterion("bak5 not in", values, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5Between(String value1, String value2) {
			addCriterion("bak5 between", value1, value2, "bak5");
			return (Criteria) this;
		}

		public Criteria andBak5NotBetween(String value1, String value2) {
			addCriterion("bak5 not between", value1, value2, "bak5");
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