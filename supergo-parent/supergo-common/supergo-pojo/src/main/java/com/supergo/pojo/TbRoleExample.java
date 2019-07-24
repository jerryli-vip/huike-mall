package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRoleExample implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5256695253043323232L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbRoleExample() {
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

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Integer value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Integer value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Integer value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Integer value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Integer> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Integer> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNull() {
			addCriterion("role_name is null");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNotNull() {
			addCriterion("role_name is not null");
			return (Criteria) this;
		}

		public Criteria andRoleNameEqualTo(String value) {
			addCriterion("role_name =", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotEqualTo(String value) {
			addCriterion("role_name <>", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThan(String value) {
			addCriterion("role_name >", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
			addCriterion("role_name >=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThan(String value) {
			addCriterion("role_name <", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThanOrEqualTo(String value) {
			addCriterion("role_name <=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLike(String value) {
			addCriterion("role_name like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotLike(String value) {
			addCriterion("role_name not like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameIn(List<String> values) {
			addCriterion("role_name in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotIn(List<String> values) {
			addCriterion("role_name not in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameBetween(String value1, String value2) {
			addCriterion("role_name between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotBetween(String value1, String value2) {
			addCriterion("role_name not between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andGradeIsNull() {
			addCriterion("grade is null");
			return (Criteria) this;
		}

		public Criteria andGradeIsNotNull() {
			addCriterion("grade is not null");
			return (Criteria) this;
		}

		public Criteria andGradeEqualTo(Integer value) {
			addCriterion("grade =", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotEqualTo(Integer value) {
			addCriterion("grade <>", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThan(Integer value) {
			addCriterion("grade >", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
			addCriterion("grade >=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThan(Integer value) {
			addCriterion("grade <", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeLessThanOrEqualTo(Integer value) {
			addCriterion("grade <=", value, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeIn(List<Integer> values) {
			addCriterion("grade in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotIn(List<Integer> values) {
			addCriterion("grade not in", values, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeBetween(Integer value1, Integer value2) {
			addCriterion("grade between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andGradeNotBetween(Integer value1, Integer value2) {
			addCriterion("grade not between", value1, value2, "grade");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIsNull() {
			addCriterion("role_description is null");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIsNotNull() {
			addCriterion("role_description is not null");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionEqualTo(String value) {
			addCriterion("role_description =", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotEqualTo(String value) {
			addCriterion("role_description <>", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionGreaterThan(String value) {
			addCriterion("role_description >", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("role_description >=", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLessThan(String value) {
			addCriterion("role_description <", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLessThanOrEqualTo(String value) {
			addCriterion("role_description <=", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionLike(String value) {
			addCriterion("role_description like", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotLike(String value) {
			addCriterion("role_description not like", value, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionIn(List<String> values) {
			addCriterion("role_description in", values, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotIn(List<String> values) {
			addCriterion("role_description not in", values, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionBetween(String value1, String value2) {
			addCriterion("role_description between", value1, value2, "roleDescription");
			return (Criteria) this;
		}

		public Criteria andRoleDescriptionNotBetween(String value1, String value2) {
			addCriterion("role_description not between", value1, value2, "roleDescription");
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

		public Criteria andRoleAuthorityIsNull() {
			addCriterion("role_authority is null");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIsNotNull() {
			addCriterion("role_authority is not null");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityEqualTo(Integer value) {
			addCriterion("role_authority =", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityNotEqualTo(Integer value) {
			addCriterion("role_authority <>", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityGreaterThan(Integer value) {
			addCriterion("role_authority >", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_authority >=", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityLessThan(Integer value) {
			addCriterion("role_authority <", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityLessThanOrEqualTo(Integer value) {
			addCriterion("role_authority <=", value, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityIn(List<Integer> values) {
			addCriterion("role_authority in", values, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityNotIn(List<Integer> values) {
			addCriterion("role_authority not in", values, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityBetween(Integer value1, Integer value2) {
			addCriterion("role_authority between", value1, value2, "roleAuthority");
			return (Criteria) this;
		}

		public Criteria andRoleAuthorityNotBetween(Integer value1, Integer value2) {
			addCriterion("role_authority not between", value1, value2, "roleAuthority");
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