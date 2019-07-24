package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbProductExample implements Serializable {

	private static final long serialVersionUID = -610498896168231623L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbProductExample() {
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

		public Criteria andShopIdIsNull() {
			addCriterion("shop_id is null");
			return (Criteria) this;
		}

		public Criteria andShopIdIsNotNull() {
			addCriterion("shop_id is not null");
			return (Criteria) this;
		}

		public Criteria andShopIdEqualTo(Integer value) {
			addCriterion("shop_id =", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotEqualTo(Integer value) {
			addCriterion("shop_id <>", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThan(Integer value) {
			addCriterion("shop_id >", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("shop_id >=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThan(Integer value) {
			addCriterion("shop_id <", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThanOrEqualTo(Integer value) {
			addCriterion("shop_id <=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdIn(List<Integer> values) {
			addCriterion("shop_id in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotIn(List<Integer> values) {
			addCriterion("shop_id not in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdBetween(Integer value1, Integer value2) {
			addCriterion("shop_id between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
			addCriterion("shop_id not between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andClassify1IsNull() {
			addCriterion("classify1 is null");
			return (Criteria) this;
		}

		public Criteria andClassify1IsNotNull() {
			addCriterion("classify1 is not null");
			return (Criteria) this;
		}

		public Criteria andClassify1EqualTo(String value) {
			addCriterion("classify1 =", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1NotEqualTo(String value) {
			addCriterion("classify1 <>", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1GreaterThan(String value) {
			addCriterion("classify1 >", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1GreaterThanOrEqualTo(String value) {
			addCriterion("classify1 >=", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1LessThan(String value) {
			addCriterion("classify1 <", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1LessThanOrEqualTo(String value) {
			addCriterion("classify1 <=", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1Like(String value) {
			addCriterion("classify1 like", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1NotLike(String value) {
			addCriterion("classify1 not like", value, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1In(List<String> values) {
			addCriterion("classify1 in", values, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1NotIn(List<String> values) {
			addCriterion("classify1 not in", values, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1Between(String value1, String value2) {
			addCriterion("classify1 between", value1, value2, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify1NotBetween(String value1, String value2) {
			addCriterion("classify1 not between", value1, value2, "classify1");
			return (Criteria) this;
		}

		public Criteria andClassify2IsNull() {
			addCriterion("classify2 is null");
			return (Criteria) this;
		}

		public Criteria andClassify2IsNotNull() {
			addCriterion("classify2 is not null");
			return (Criteria) this;
		}

		public Criteria andClassify2EqualTo(String value) {
			addCriterion("classify2 =", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2NotEqualTo(String value) {
			addCriterion("classify2 <>", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2GreaterThan(String value) {
			addCriterion("classify2 >", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2GreaterThanOrEqualTo(String value) {
			addCriterion("classify2 >=", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2LessThan(String value) {
			addCriterion("classify2 <", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2LessThanOrEqualTo(String value) {
			addCriterion("classify2 <=", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2Like(String value) {
			addCriterion("classify2 like", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2NotLike(String value) {
			addCriterion("classify2 not like", value, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2In(List<String> values) {
			addCriterion("classify2 in", values, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2NotIn(List<String> values) {
			addCriterion("classify2 not in", values, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2Between(String value1, String value2) {
			addCriterion("classify2 between", value1, value2, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify2NotBetween(String value1, String value2) {
			addCriterion("classify2 not between", value1, value2, "classify2");
			return (Criteria) this;
		}

		public Criteria andClassify3IsNull() {
			addCriterion("classify3 is null");
			return (Criteria) this;
		}

		public Criteria andClassify3IsNotNull() {
			addCriterion("classify3 is not null");
			return (Criteria) this;
		}

		public Criteria andClassify3EqualTo(String value) {
			addCriterion("classify3 =", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3NotEqualTo(String value) {
			addCriterion("classify3 <>", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3GreaterThan(String value) {
			addCriterion("classify3 >", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3GreaterThanOrEqualTo(String value) {
			addCriterion("classify3 >=", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3LessThan(String value) {
			addCriterion("classify3 <", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3LessThanOrEqualTo(String value) {
			addCriterion("classify3 <=", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3Like(String value) {
			addCriterion("classify3 like", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3NotLike(String value) {
			addCriterion("classify3 not like", value, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3In(List<String> values) {
			addCriterion("classify3 in", values, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3NotIn(List<String> values) {
			addCriterion("classify3 not in", values, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3Between(String value1, String value2) {
			addCriterion("classify3 between", value1, value2, "classify3");
			return (Criteria) this;
		}

		public Criteria andClassify3NotBetween(String value1, String value2) {
			addCriterion("classify3 not between", value1, value2, "classify3");
			return (Criteria) this;
		}

		public Criteria andTemplateIsNull() {
			addCriterion("template is null");
			return (Criteria) this;
		}

		public Criteria andTemplateIsNotNull() {
			addCriterion("template is not null");
			return (Criteria) this;
		}

		public Criteria andTemplateEqualTo(String value) {
			addCriterion("template =", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateNotEqualTo(String value) {
			addCriterion("template <>", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateGreaterThan(String value) {
			addCriterion("template >", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateGreaterThanOrEqualTo(String value) {
			addCriterion("template >=", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateLessThan(String value) {
			addCriterion("template <", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateLessThanOrEqualTo(String value) {
			addCriterion("template <=", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateLike(String value) {
			addCriterion("template like", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateNotLike(String value) {
			addCriterion("template not like", value, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateIn(List<String> values) {
			addCriterion("template in", values, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateNotIn(List<String> values) {
			addCriterion("template not in", values, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateBetween(String value1, String value2) {
			addCriterion("template between", value1, value2, "template");
			return (Criteria) this;
		}

		public Criteria andTemplateNotBetween(String value1, String value2) {
			addCriterion("template not between", value1, value2, "template");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andBrandIsNull() {
			addCriterion("brand is null");
			return (Criteria) this;
		}

		public Criteria andBrandIsNotNull() {
			addCriterion("brand is not null");
			return (Criteria) this;
		}

		public Criteria andBrandEqualTo(String value) {
			addCriterion("brand =", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotEqualTo(String value) {
			addCriterion("brand <>", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandGreaterThan(String value) {
			addCriterion("brand >", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandGreaterThanOrEqualTo(String value) {
			addCriterion("brand >=", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLessThan(String value) {
			addCriterion("brand <", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLessThanOrEqualTo(String value) {
			addCriterion("brand <=", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLike(String value) {
			addCriterion("brand like", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotLike(String value) {
			addCriterion("brand not like", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandIn(List<String> values) {
			addCriterion("brand in", values, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotIn(List<String> values) {
			addCriterion("brand not in", values, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandBetween(String value1, String value2) {
			addCriterion("brand between", value1, value2, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotBetween(String value1, String value2) {
			addCriterion("brand not between", value1, value2, "brand");
			return (Criteria) this;
		}

		public Criteria andSubtitleIsNull() {
			addCriterion("subtitle is null");
			return (Criteria) this;
		}

		public Criteria andSubtitleIsNotNull() {
			addCriterion("subtitle is not null");
			return (Criteria) this;
		}

		public Criteria andSubtitleEqualTo(String value) {
			addCriterion("subtitle =", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotEqualTo(String value) {
			addCriterion("subtitle <>", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleGreaterThan(String value) {
			addCriterion("subtitle >", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
			addCriterion("subtitle >=", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLessThan(String value) {
			addCriterion("subtitle <", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLessThanOrEqualTo(String value) {
			addCriterion("subtitle <=", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleLike(String value) {
			addCriterion("subtitle like", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotLike(String value) {
			addCriterion("subtitle not like", value, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleIn(List<String> values) {
			addCriterion("subtitle in", values, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotIn(List<String> values) {
			addCriterion("subtitle not in", values, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleBetween(String value1, String value2) {
			addCriterion("subtitle between", value1, value2, "subtitle");
			return (Criteria) this;
		}

		public Criteria andSubtitleNotBetween(String value1, String value2) {
			addCriterion("subtitle not between", value1, value2, "subtitle");
			return (Criteria) this;
		}

		public Criteria andPacklistIsNull() {
			addCriterion("packlist is null");
			return (Criteria) this;
		}

		public Criteria andPacklistIsNotNull() {
			addCriterion("packlist is not null");
			return (Criteria) this;
		}

		public Criteria andPacklistEqualTo(String value) {
			addCriterion("packlist =", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistNotEqualTo(String value) {
			addCriterion("packlist <>", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistGreaterThan(String value) {
			addCriterion("packlist >", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistGreaterThanOrEqualTo(String value) {
			addCriterion("packlist >=", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistLessThan(String value) {
			addCriterion("packlist <", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistLessThanOrEqualTo(String value) {
			addCriterion("packlist <=", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistLike(String value) {
			addCriterion("packlist like", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistNotLike(String value) {
			addCriterion("packlist not like", value, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistIn(List<String> values) {
			addCriterion("packlist in", values, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistNotIn(List<String> values) {
			addCriterion("packlist not in", values, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistBetween(String value1, String value2) {
			addCriterion("packlist between", value1, value2, "packlist");
			return (Criteria) this;
		}

		public Criteria andPacklistNotBetween(String value1, String value2) {
			addCriterion("packlist not between", value1, value2, "packlist");
			return (Criteria) this;
		}

		public Criteria andAfterserviceIsNull() {
			addCriterion("afterservice is null");
			return (Criteria) this;
		}

		public Criteria andAfterserviceIsNotNull() {
			addCriterion("afterservice is not null");
			return (Criteria) this;
		}

		public Criteria andAfterserviceEqualTo(String value) {
			addCriterion("afterservice =", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceNotEqualTo(String value) {
			addCriterion("afterservice <>", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceGreaterThan(String value) {
			addCriterion("afterservice >", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceGreaterThanOrEqualTo(String value) {
			addCriterion("afterservice >=", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceLessThan(String value) {
			addCriterion("afterservice <", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceLessThanOrEqualTo(String value) {
			addCriterion("afterservice <=", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceLike(String value) {
			addCriterion("afterservice like", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceNotLike(String value) {
			addCriterion("afterservice not like", value, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceIn(List<String> values) {
			addCriterion("afterservice in", values, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceNotIn(List<String> values) {
			addCriterion("afterservice not in", values, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceBetween(String value1, String value2) {
			addCriterion("afterservice between", value1, value2, "afterservice");
			return (Criteria) this;
		}

		public Criteria andAfterserviceNotBetween(String value1, String value2) {
			addCriterion("afterservice not between", value1, value2, "afterservice");
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