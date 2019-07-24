package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbSysuserRoleExample implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6882436938074762205L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbSysuserRoleExample() {
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

		public Criteria andSysuserRoleIdIsNull() {
			addCriterion("sysuser_role_id is null");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdIsNotNull() {
			addCriterion("sysuser_role_id is not null");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdEqualTo(Integer value) {
			addCriterion("sysuser_role_id =", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdNotEqualTo(Integer value) {
			addCriterion("sysuser_role_id <>", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdGreaterThan(Integer value) {
			addCriterion("sysuser_role_id >", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("sysuser_role_id >=", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdLessThan(Integer value) {
			addCriterion("sysuser_role_id <", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("sysuser_role_id <=", value, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdIn(List<Integer> values) {
			addCriterion("sysuser_role_id in", values, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdNotIn(List<Integer> values) {
			addCriterion("sysuser_role_id not in", values, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("sysuser_role_id between", value1, value2, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andSysuserRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("sysuser_role_id not between", value1, value2, "sysuserRoleId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdIsNull() {
			addCriterion("role_authority_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdIsNotNull() {
			addCriterion("role_authority_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdEqualTo(Integer value) {
			addCriterion("role_authority_id =", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdNotEqualTo(Integer value) {
			addCriterion("role_authority_id <>", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdGreaterThan(Integer value) {
			addCriterion("role_authority_id >", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_authority_id >=", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdLessThan(Integer value) {
			addCriterion("role_authority_id <", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_authority_id <=", value, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdIn(List<Integer> values) {
			addCriterion("role_authority_id in", values, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdNotIn(List<Integer> values) {
			addCriterion("role_authority_id not in", values, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdBetween(Integer value1, Integer value2) {
			addCriterion("role_authority_id between", value1, value2, "roleAuthorityId");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_authority_id not between", value1, value2, "roleAuthorityId");
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