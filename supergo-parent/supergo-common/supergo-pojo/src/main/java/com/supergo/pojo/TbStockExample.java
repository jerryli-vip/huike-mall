package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbStockExample implements Serializable {

	private static final long serialVersionUID = 6935597943584267579L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbStockExample() {
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

		public Criteria andInventoryIsNull() {
			addCriterion("inventory is null");
			return (Criteria) this;
		}

		public Criteria andInventoryIsNotNull() {
			addCriterion("inventory is not null");
			return (Criteria) this;
		}

		public Criteria andInventoryEqualTo(Integer value) {
			addCriterion("inventory =", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryNotEqualTo(Integer value) {
			addCriterion("inventory <>", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryGreaterThan(Integer value) {
			addCriterion("inventory >", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
			addCriterion("inventory >=", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryLessThan(Integer value) {
			addCriterion("inventory <", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryLessThanOrEqualTo(Integer value) {
			addCriterion("inventory <=", value, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryIn(List<Integer> values) {
			addCriterion("inventory in", values, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryNotIn(List<Integer> values) {
			addCriterion("inventory not in", values, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryBetween(Integer value1, Integer value2) {
			addCriterion("inventory between", value1, value2, "inventory");
			return (Criteria) this;
		}

		public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
			addCriterion("inventory not between", value1, value2, "inventory");
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