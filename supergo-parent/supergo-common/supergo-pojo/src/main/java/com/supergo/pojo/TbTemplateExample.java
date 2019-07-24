package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTemplateExample implements Serializable {

	private static final long serialVersionUID = -16947877961576105L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbTemplateExample() {
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

		public Criteria andTemplateIdIsNull() {
			addCriterion("template_id is null");
			return (Criteria) this;
		}

		public Criteria andTemplateIdIsNotNull() {
			addCriterion("template_id is not null");
			return (Criteria) this;
		}

		public Criteria andTemplateIdEqualTo(Integer value) {
			addCriterion("template_id =", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotEqualTo(Integer value) {
			addCriterion("template_id <>", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdGreaterThan(Integer value) {
			addCriterion("template_id >", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("template_id >=", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdLessThan(Integer value) {
			addCriterion("template_id <", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
			addCriterion("template_id <=", value, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdIn(List<Integer> values) {
			addCriterion("template_id in", values, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotIn(List<Integer> values) {
			addCriterion("template_id not in", values, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
			addCriterion("template_id between", value1, value2, "templateId");
			return (Criteria) this;
		}

		public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
			addCriterion("template_id not between", value1, value2, "templateId");
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

		public Criteria andTemplateNameIsNull() {
			addCriterion("template_name is null");
			return (Criteria) this;
		}

		public Criteria andTemplateNameIsNotNull() {
			addCriterion("template_name is not null");
			return (Criteria) this;
		}

		public Criteria andTemplateNameEqualTo(String value) {
			addCriterion("template_name =", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameNotEqualTo(String value) {
			addCriterion("template_name <>", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameGreaterThan(String value) {
			addCriterion("template_name >", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
			addCriterion("template_name >=", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameLessThan(String value) {
			addCriterion("template_name <", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameLessThanOrEqualTo(String value) {
			addCriterion("template_name <=", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameLike(String value) {
			addCriterion("template_name like", "%" + value + "%", "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameNotLike(String value) {
			addCriterion("template_name not like", value, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameIn(List<String> values) {
			addCriterion("template_name in", values, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameNotIn(List<String> values) {
			addCriterion("template_name not in", values, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameBetween(String value1, String value2) {
			addCriterion("template_name between", value1, value2, "templateName");
			return (Criteria) this;
		}

		public Criteria andTemplateNameNotBetween(String value1, String value2) {
			addCriterion("template_name not between", value1, value2, "templateName");
			return (Criteria) this;
		}

		public Criteria andBrandsIsNull() {
			addCriterion("brands is null");
			return (Criteria) this;
		}

		public Criteria andBrandsIsNotNull() {
			addCriterion("brands is not null");
			return (Criteria) this;
		}

		public Criteria andBrandsEqualTo(String value) {
			addCriterion("brands =", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsNotEqualTo(String value) {
			addCriterion("brands <>", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsGreaterThan(String value) {
			addCriterion("brands >", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsGreaterThanOrEqualTo(String value) {
			addCriterion("brands >=", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsLessThan(String value) {
			addCriterion("brands <", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsLessThanOrEqualTo(String value) {
			addCriterion("brands <=", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsLike(String value) {
			addCriterion("brands like", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsNotLike(String value) {
			addCriterion("brands not like", value, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsIn(List<String> values) {
			addCriterion("brands in", values, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsNotIn(List<String> values) {
			addCriterion("brands not in", values, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsBetween(String value1, String value2) {
			addCriterion("brands between", value1, value2, "brands");
			return (Criteria) this;
		}

		public Criteria andBrandsNotBetween(String value1, String value2) {
			addCriterion("brands not between", value1, value2, "brands");
			return (Criteria) this;
		}

		public Criteria andSpecsIsNull() {
			addCriterion("specs is null");
			return (Criteria) this;
		}

		public Criteria andSpecsIsNotNull() {
			addCriterion("specs is not null");
			return (Criteria) this;
		}

		public Criteria andSpecsEqualTo(String value) {
			addCriterion("specs =", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsNotEqualTo(String value) {
			addCriterion("specs <>", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsGreaterThan(String value) {
			addCriterion("specs >", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsGreaterThanOrEqualTo(String value) {
			addCriterion("specs >=", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsLessThan(String value) {
			addCriterion("specs <", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsLessThanOrEqualTo(String value) {
			addCriterion("specs <=", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsLike(String value) {
			addCriterion("specs like", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsNotLike(String value) {
			addCriterion("specs not like", value, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsIn(List<String> values) {
			addCriterion("specs in", values, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsNotIn(List<String> values) {
			addCriterion("specs not in", values, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsBetween(String value1, String value2) {
			addCriterion("specs between", value1, value2, "specs");
			return (Criteria) this;
		}

		public Criteria andSpecsNotBetween(String value1, String value2) {
			addCriterion("specs not between", value1, value2, "specs");
			return (Criteria) this;
		}

		public Criteria andAttributeIsNull() {
			addCriterion("attribute is null");
			return (Criteria) this;
		}

		public Criteria andAttributeIsNotNull() {
			addCriterion("attribute is not null");
			return (Criteria) this;
		}

		public Criteria andAttributeEqualTo(String value) {
			addCriterion("attribute =", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotEqualTo(String value) {
			addCriterion("attribute <>", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeGreaterThan(String value) {
			addCriterion("attribute >", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeGreaterThanOrEqualTo(String value) {
			addCriterion("attribute >=", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLessThan(String value) {
			addCriterion("attribute <", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLessThanOrEqualTo(String value) {
			addCriterion("attribute <=", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeLike(String value) {
			addCriterion("attribute like", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotLike(String value) {
			addCriterion("attribute not like", value, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeIn(List<String> values) {
			addCriterion("attribute in", values, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotIn(List<String> values) {
			addCriterion("attribute not in", values, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeBetween(String value1, String value2) {
			addCriterion("attribute between", value1, value2, "attribute");
			return (Criteria) this;
		}

		public Criteria andAttributeNotBetween(String value1, String value2) {
			addCriterion("attribute not between", value1, value2, "attribute");
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