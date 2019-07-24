package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBusinessLogExample implements Serializable {

	private static final long serialVersionUID = 7015243652576213090L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbBusinessLogExample() {
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

		public Criteria andBusinesslogIdIsNull() {
			addCriterion("businesslog_id is null");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdIsNotNull() {
			addCriterion("businesslog_id is not null");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdEqualTo(Integer value) {
			addCriterion("businesslog_id =", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdNotEqualTo(Integer value) {
			addCriterion("businesslog_id <>", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdGreaterThan(Integer value) {
			addCriterion("businesslog_id >", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("businesslog_id >=", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdLessThan(Integer value) {
			addCriterion("businesslog_id <", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdLessThanOrEqualTo(Integer value) {
			addCriterion("businesslog_id <=", value, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdIn(List<Integer> values) {
			addCriterion("businesslog_id in", values, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdNotIn(List<Integer> values) {
			addCriterion("businesslog_id not in", values, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdBetween(Integer value1, Integer value2) {
			addCriterion("businesslog_id between", value1, value2, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinesslogIdNotBetween(Integer value1, Integer value2) {
			addCriterion("businesslog_id not between", value1, value2, "businesslogId");
			return (Criteria) this;
		}

		public Criteria andBusinessNameIsNull() {
			addCriterion("business_name is null");
			return (Criteria) this;
		}

		public Criteria andBusinessNameIsNotNull() {
			addCriterion("business_name is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessNameEqualTo(String value) {
			addCriterion("business_name =", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameNotEqualTo(String value) {
			addCriterion("business_name <>", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameGreaterThan(String value) {
			addCriterion("business_name >", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
			addCriterion("business_name >=", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameLessThan(String value) {
			addCriterion("business_name <", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameLessThanOrEqualTo(String value) {
			addCriterion("business_name <=", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameLike(String value) {
			addCriterion("business_name like", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameNotLike(String value) {
			addCriterion("business_name not like", value, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameIn(List<String> values) {
			addCriterion("business_name in", values, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameNotIn(List<String> values) {
			addCriterion("business_name not in", values, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameBetween(String value1, String value2) {
			addCriterion("business_name between", value1, value2, "businessName");
			return (Criteria) this;
		}

		public Criteria andBusinessNameNotBetween(String value1, String value2) {
			addCriterion("business_name not between", value1, value2, "businessName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameIsNull() {
			addCriterion("auditing_name is null");
			return (Criteria) this;
		}

		public Criteria andAuditingNameIsNotNull() {
			addCriterion("auditing_name is not null");
			return (Criteria) this;
		}

		public Criteria andAuditingNameEqualTo(String value) {
			addCriterion("auditing_name =", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameNotEqualTo(String value) {
			addCriterion("auditing_name <>", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameGreaterThan(String value) {
			addCriterion("auditing_name >", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameGreaterThanOrEqualTo(String value) {
			addCriterion("auditing_name >=", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameLessThan(String value) {
			addCriterion("auditing_name <", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameLessThanOrEqualTo(String value) {
			addCriterion("auditing_name <=", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameLike(String value) {
			addCriterion("auditing_name like", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameNotLike(String value) {
			addCriterion("auditing_name not like", value, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameIn(List<String> values) {
			addCriterion("auditing_name in", values, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameNotIn(List<String> values) {
			addCriterion("auditing_name not in", values, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameBetween(String value1, String value2) {
			addCriterion("auditing_name between", value1, value2, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingNameNotBetween(String value1, String value2) {
			addCriterion("auditing_name not between", value1, value2, "auditingName");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusIsNull() {
			addCriterion("auditing_status is null");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusIsNotNull() {
			addCriterion("auditing_status is not null");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusEqualTo(Integer value) {
			addCriterion("auditing_status =", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusNotEqualTo(Integer value) {
			addCriterion("auditing_status <>", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusGreaterThan(Integer value) {
			addCriterion("auditing_status >", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("auditing_status >=", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusLessThan(Integer value) {
			addCriterion("auditing_status <", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusLessThanOrEqualTo(Integer value) {
			addCriterion("auditing_status <=", value, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusIn(List<Integer> values) {
			addCriterion("auditing_status in", values, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusNotIn(List<Integer> values) {
			addCriterion("auditing_status not in", values, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusBetween(Integer value1, Integer value2) {
			addCriterion("auditing_status between", value1, value2, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andAuditingStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("auditing_status not between", value1, value2, "auditingStatus");
			return (Criteria) this;
		}

		public Criteria andReasonIsNull() {
			addCriterion("reason is null");
			return (Criteria) this;
		}

		public Criteria andReasonIsNotNull() {
			addCriterion("reason is not null");
			return (Criteria) this;
		}

		public Criteria andReasonEqualTo(String value) {
			addCriterion("reason =", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonNotEqualTo(String value) {
			addCriterion("reason <>", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonGreaterThan(String value) {
			addCriterion("reason >", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonGreaterThanOrEqualTo(String value) {
			addCriterion("reason >=", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonLessThan(String value) {
			addCriterion("reason <", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonLessThanOrEqualTo(String value) {
			addCriterion("reason <=", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonLike(String value) {
			addCriterion("reason like", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonNotLike(String value) {
			addCriterion("reason not like", value, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonIn(List<String> values) {
			addCriterion("reason in", values, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonNotIn(List<String> values) {
			addCriterion("reason not in", values, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonBetween(String value1, String value2) {
			addCriterion("reason between", value1, value2, "reason");
			return (Criteria) this;
		}

		public Criteria andReasonNotBetween(String value1, String value2) {
			addCriterion("reason not between", value1, value2, "reason");
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

		public Criteria andCreateIdEqualTo(String value) {
			addCriterion("create_id =", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotEqualTo(String value) {
			addCriterion("create_id <>", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThan(String value) {
			addCriterion("create_id >", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
			addCriterion("create_id >=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThan(String value) {
			addCriterion("create_id <", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThanOrEqualTo(String value) {
			addCriterion("create_id <=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLike(String value) {
			addCriterion("create_id like", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotLike(String value) {
			addCriterion("create_id not like", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdIn(List<String> values) {
			addCriterion("create_id in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotIn(List<String> values) {
			addCriterion("create_id not in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdBetween(String value1, String value2) {
			addCriterion("create_id between", value1, value2, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotBetween(String value1, String value2) {
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

		public Criteria andUpdateIdEqualTo(String value) {
			addCriterion("update_id =", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotEqualTo(String value) {
			addCriterion("update_id <>", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThan(String value) {
			addCriterion("update_id >", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
			addCriterion("update_id >=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThan(String value) {
			addCriterion("update_id <", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThanOrEqualTo(String value) {
			addCriterion("update_id <=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLike(String value) {
			addCriterion("update_id like", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotLike(String value) {
			addCriterion("update_id not like", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIn(List<String> values) {
			addCriterion("update_id in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotIn(List<String> values) {
			addCriterion("update_id not in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdBetween(String value1, String value2) {
			addCriterion("update_id between", value1, value2, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotBetween(String value1, String value2) {
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