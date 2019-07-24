package com.supergo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbImageExample implements Serializable {

	private static final long serialVersionUID = 5086765754895246801L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TbImageExample() {
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

		public Criteria andImgIdIsNull() {
			addCriterion("img_id is null");
			return (Criteria) this;
		}

		public Criteria andImgIdIsNotNull() {
			addCriterion("img_id is not null");
			return (Criteria) this;
		}

		public Criteria andImgIdEqualTo(Integer value) {
			addCriterion("img_id =", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdNotEqualTo(Integer value) {
			addCriterion("img_id <>", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdGreaterThan(Integer value) {
			addCriterion("img_id >", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("img_id >=", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdLessThan(Integer value) {
			addCriterion("img_id <", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdLessThanOrEqualTo(Integer value) {
			addCriterion("img_id <=", value, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdIn(List<Integer> values) {
			addCriterion("img_id in", values, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdNotIn(List<Integer> values) {
			addCriterion("img_id not in", values, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdBetween(Integer value1, Integer value2) {
			addCriterion("img_id between", value1, value2, "imgId");
			return (Criteria) this;
		}

		public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
			addCriterion("img_id not between", value1, value2, "imgId");
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

		public Criteria andImgColorIsNull() {
			addCriterion("img_color is null");
			return (Criteria) this;
		}

		public Criteria andImgColorIsNotNull() {
			addCriterion("img_color is not null");
			return (Criteria) this;
		}

		public Criteria andImgColorEqualTo(String value) {
			addCriterion("img_color =", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorNotEqualTo(String value) {
			addCriterion("img_color <>", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorGreaterThan(String value) {
			addCriterion("img_color >", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorGreaterThanOrEqualTo(String value) {
			addCriterion("img_color >=", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorLessThan(String value) {
			addCriterion("img_color <", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorLessThanOrEqualTo(String value) {
			addCriterion("img_color <=", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorLike(String value) {
			addCriterion("img_color like", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorNotLike(String value) {
			addCriterion("img_color not like", value, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorIn(List<String> values) {
			addCriterion("img_color in", values, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorNotIn(List<String> values) {
			addCriterion("img_color not in", values, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorBetween(String value1, String value2) {
			addCriterion("img_color between", value1, value2, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgColorNotBetween(String value1, String value2) {
			addCriterion("img_color not between", value1, value2, "imgColor");
			return (Criteria) this;
		}

		public Criteria andImgPathIsNull() {
			addCriterion("img_path is null");
			return (Criteria) this;
		}

		public Criteria andImgPathIsNotNull() {
			addCriterion("img_path is not null");
			return (Criteria) this;
		}

		public Criteria andImgPathEqualTo(String value) {
			addCriterion("img_path =", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathNotEqualTo(String value) {
			addCriterion("img_path <>", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathGreaterThan(String value) {
			addCriterion("img_path >", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathGreaterThanOrEqualTo(String value) {
			addCriterion("img_path >=", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathLessThan(String value) {
			addCriterion("img_path <", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathLessThanOrEqualTo(String value) {
			addCriterion("img_path <=", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathLike(String value) {
			addCriterion("img_path like", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathNotLike(String value) {
			addCriterion("img_path not like", value, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathIn(List<String> values) {
			addCriterion("img_path in", values, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathNotIn(List<String> values) {
			addCriterion("img_path not in", values, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathBetween(String value1, String value2) {
			addCriterion("img_path between", value1, value2, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgPathNotBetween(String value1, String value2) {
			addCriterion("img_path not between", value1, value2, "imgPath");
			return (Criteria) this;
		}

		public Criteria andImgSuffixIsNull() {
			addCriterion("img_suffix is null");
			return (Criteria) this;
		}

		public Criteria andImgSuffixIsNotNull() {
			addCriterion("img_suffix is not null");
			return (Criteria) this;
		}

		public Criteria andImgSuffixEqualTo(String value) {
			addCriterion("img_suffix =", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixNotEqualTo(String value) {
			addCriterion("img_suffix <>", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixGreaterThan(String value) {
			addCriterion("img_suffix >", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixGreaterThanOrEqualTo(String value) {
			addCriterion("img_suffix >=", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixLessThan(String value) {
			addCriterion("img_suffix <", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixLessThanOrEqualTo(String value) {
			addCriterion("img_suffix <=", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixLike(String value) {
			addCriterion("img_suffix like", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixNotLike(String value) {
			addCriterion("img_suffix not like", value, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixIn(List<String> values) {
			addCriterion("img_suffix in", values, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixNotIn(List<String> values) {
			addCriterion("img_suffix not in", values, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixBetween(String value1, String value2) {
			addCriterion("img_suffix between", value1, value2, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andImgSuffixNotBetween(String value1, String value2) {
			addCriterion("img_suffix not between", value1, value2, "imgSuffix");
			return (Criteria) this;
		}

		public Criteria andIsMasterIsNull() {
			addCriterion("is_master is null");
			return (Criteria) this;
		}

		public Criteria andIsMasterIsNotNull() {
			addCriterion("is_master is not null");
			return (Criteria) this;
		}

		public Criteria andIsMasterEqualTo(String value) {
			addCriterion("is_master =", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterNotEqualTo(String value) {
			addCriterion("is_master <>", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterGreaterThan(String value) {
			addCriterion("is_master >", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterGreaterThanOrEqualTo(String value) {
			addCriterion("is_master >=", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterLessThan(String value) {
			addCriterion("is_master <", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterLessThanOrEqualTo(String value) {
			addCriterion("is_master <=", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterLike(String value) {
			addCriterion("is_master like", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterNotLike(String value) {
			addCriterion("is_master not like", value, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterIn(List<String> values) {
			addCriterion("is_master in", values, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterNotIn(List<String> values) {
			addCriterion("is_master not in", values, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterBetween(String value1, String value2) {
			addCriterion("is_master between", value1, value2, "isMaster");
			return (Criteria) this;
		}

		public Criteria andIsMasterNotBetween(String value1, String value2) {
			addCriterion("is_master not between", value1, value2, "isMaster");
			return (Criteria) this;
		}

		public Criteria andImgOrderIsNull() {
			addCriterion("img_order is null");
			return (Criteria) this;
		}

		public Criteria andImgOrderIsNotNull() {
			addCriterion("img_order is not null");
			return (Criteria) this;
		}

		public Criteria andImgOrderEqualTo(Integer value) {
			addCriterion("img_order =", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderNotEqualTo(Integer value) {
			addCriterion("img_order <>", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderGreaterThan(Integer value) {
			addCriterion("img_order >", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("img_order >=", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderLessThan(Integer value) {
			addCriterion("img_order <", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderLessThanOrEqualTo(Integer value) {
			addCriterion("img_order <=", value, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderIn(List<Integer> values) {
			addCriterion("img_order in", values, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderNotIn(List<Integer> values) {
			addCriterion("img_order not in", values, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderBetween(Integer value1, Integer value2) {
			addCriterion("img_order between", value1, value2, "imgOrder");
			return (Criteria) this;
		}

		public Criteria andImgOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("img_order not between", value1, value2, "imgOrder");
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