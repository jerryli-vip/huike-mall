package com.supergo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TdCollectionExample implements Serializable {

	private static final long serialVersionUID = 1423397897857653189L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TdCollectionExample() {
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

		public Criteria andCollectionIdIsNull() {
			addCriterion("collection_id is null");
			return (Criteria) this;
		}

		public Criteria andCollectionIdIsNotNull() {
			addCriterion("collection_id is not null");
			return (Criteria) this;
		}

		public Criteria andCollectionIdEqualTo(Integer value) {
			addCriterion("collection_id =", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdNotEqualTo(Integer value) {
			addCriterion("collection_id <>", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdGreaterThan(Integer value) {
			addCriterion("collection_id >", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("collection_id >=", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdLessThan(Integer value) {
			addCriterion("collection_id <", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdLessThanOrEqualTo(Integer value) {
			addCriterion("collection_id <=", value, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdIn(List<Integer> values) {
			addCriterion("collection_id in", values, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdNotIn(List<Integer> values) {
			addCriterion("collection_id not in", values, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdBetween(Integer value1, Integer value2) {
			addCriterion("collection_id between", value1, value2, "collectionId");
			return (Criteria) this;
		}

		public Criteria andCollectionIdNotBetween(Integer value1, Integer value2) {
			addCriterion("collection_id not between", value1, value2, "collectionId");
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

		public Criteria andCollectionRemaks1IsNull() {
			addCriterion("collection_remaks1 is null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1IsNotNull() {
			addCriterion("collection_remaks1 is not null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1EqualTo(String value) {
			addCriterion("collection_remaks1 =", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1NotEqualTo(String value) {
			addCriterion("collection_remaks1 <>", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1GreaterThan(String value) {
			addCriterion("collection_remaks1 >", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1GreaterThanOrEqualTo(String value) {
			addCriterion("collection_remaks1 >=", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1LessThan(String value) {
			addCriterion("collection_remaks1 <", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1LessThanOrEqualTo(String value) {
			addCriterion("collection_remaks1 <=", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1Like(String value) {
			addCriterion("collection_remaks1 like", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1NotLike(String value) {
			addCriterion("collection_remaks1 not like", value, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1In(List<String> values) {
			addCriterion("collection_remaks1 in", values, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1NotIn(List<String> values) {
			addCriterion("collection_remaks1 not in", values, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1Between(String value1, String value2) {
			addCriterion("collection_remaks1 between", value1, value2, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks1NotBetween(String value1, String value2) {
			addCriterion("collection_remaks1 not between", value1, value2, "collectionRemaks1");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2IsNull() {
			addCriterion("collection_remaks2 is null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2IsNotNull() {
			addCriterion("collection_remaks2 is not null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2EqualTo(String value) {
			addCriterion("collection_remaks2 =", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2NotEqualTo(String value) {
			addCriterion("collection_remaks2 <>", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2GreaterThan(String value) {
			addCriterion("collection_remaks2 >", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2GreaterThanOrEqualTo(String value) {
			addCriterion("collection_remaks2 >=", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2LessThan(String value) {
			addCriterion("collection_remaks2 <", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2LessThanOrEqualTo(String value) {
			addCriterion("collection_remaks2 <=", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2Like(String value) {
			addCriterion("collection_remaks2 like", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2NotLike(String value) {
			addCriterion("collection_remaks2 not like", value, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2In(List<String> values) {
			addCriterion("collection_remaks2 in", values, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2NotIn(List<String> values) {
			addCriterion("collection_remaks2 not in", values, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2Between(String value1, String value2) {
			addCriterion("collection_remaks2 between", value1, value2, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks2NotBetween(String value1, String value2) {
			addCriterion("collection_remaks2 not between", value1, value2, "collectionRemaks2");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3IsNull() {
			addCriterion("collection_remaks3 is null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3IsNotNull() {
			addCriterion("collection_remaks3 is not null");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3EqualTo(String value) {
			addCriterion("collection_remaks3 =", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3NotEqualTo(String value) {
			addCriterion("collection_remaks3 <>", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3GreaterThan(String value) {
			addCriterion("collection_remaks3 >", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3GreaterThanOrEqualTo(String value) {
			addCriterion("collection_remaks3 >=", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3LessThan(String value) {
			addCriterion("collection_remaks3 <", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3LessThanOrEqualTo(String value) {
			addCriterion("collection_remaks3 <=", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3Like(String value) {
			addCriterion("collection_remaks3 like", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3NotLike(String value) {
			addCriterion("collection_remaks3 not like", value, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3In(List<String> values) {
			addCriterion("collection_remaks3 in", values, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3NotIn(List<String> values) {
			addCriterion("collection_remaks3 not in", values, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3Between(String value1, String value2) {
			addCriterion("collection_remaks3 between", value1, value2, "collectionRemaks3");
			return (Criteria) this;
		}

		public Criteria andCollectionRemaks3NotBetween(String value1, String value2) {
			addCriterion("collection_remaks3 not between", value1, value2, "collectionRemaks3");
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