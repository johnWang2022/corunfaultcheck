package com.corun.faultcheck.fault.check.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaultImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FaultImagesExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSheetIdIsNull() {
            addCriterion("sheet_id is null");
            return (Criteria) this;
        }

        public Criteria andSheetIdIsNotNull() {
            addCriterion("sheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andSheetIdEqualTo(String value) {
            addCriterion("sheet_id =", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotEqualTo(String value) {
            addCriterion("sheet_id <>", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThan(String value) {
            addCriterion("sheet_id >", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdGreaterThanOrEqualTo(String value) {
            addCriterion("sheet_id >=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThan(String value) {
            addCriterion("sheet_id <", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLessThanOrEqualTo(String value) {
            addCriterion("sheet_id <=", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdLike(String value) {
            addCriterion("sheet_id like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotLike(String value) {
            addCriterion("sheet_id not like", value, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdIn(List<String> values) {
            addCriterion("sheet_id in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotIn(List<String> values) {
            addCriterion("sheet_id not in", values, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdBetween(String value1, String value2) {
            addCriterion("sheet_id between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andSheetIdNotBetween(String value1, String value2) {
            addCriterion("sheet_id not between", value1, value2, "sheetId");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNull() {
            addCriterion("original_url is null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNotNull() {
            addCriterion("original_url is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlEqualTo(String value) {
            addCriterion("original_url =", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotEqualTo(String value) {
            addCriterion("original_url <>", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThan(String value) {
            addCriterion("original_url >", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("original_url >=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThan(String value) {
            addCriterion("original_url <", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThanOrEqualTo(String value) {
            addCriterion("original_url <=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLike(String value) {
            addCriterion("original_url like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotLike(String value) {
            addCriterion("original_url not like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIn(List<String> values) {
            addCriterion("original_url in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotIn(List<String> values) {
            addCriterion("original_url not in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlBetween(String value1, String value2) {
            addCriterion("original_url between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotBetween(String value1, String value2) {
            addCriterion("original_url not between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlIsNull() {
            addCriterion("calcu_url is null");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlIsNotNull() {
            addCriterion("calcu_url is not null");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlEqualTo(String value) {
            addCriterion("calcu_url =", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlNotEqualTo(String value) {
            addCriterion("calcu_url <>", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlGreaterThan(String value) {
            addCriterion("calcu_url >", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("calcu_url >=", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlLessThan(String value) {
            addCriterion("calcu_url <", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlLessThanOrEqualTo(String value) {
            addCriterion("calcu_url <=", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlLike(String value) {
            addCriterion("calcu_url like", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlNotLike(String value) {
            addCriterion("calcu_url not like", value, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlIn(List<String> values) {
            addCriterion("calcu_url in", values, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlNotIn(List<String> values) {
            addCriterion("calcu_url not in", values, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlBetween(String value1, String value2) {
            addCriterion("calcu_url between", value1, value2, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andCalcuUrlNotBetween(String value1, String value2) {
            addCriterion("calcu_url not between", value1, value2, "calcuUrl");
            return (Criteria) this;
        }

        public Criteria andStopIdIsNull() {
            addCriterion("stop_id is null");
            return (Criteria) this;
        }

        public Criteria andStopIdIsNotNull() {
            addCriterion("stop_id is not null");
            return (Criteria) this;
        }

        public Criteria andStopIdEqualTo(String value) {
            addCriterion("stop_id =", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotEqualTo(String value) {
            addCriterion("stop_id <>", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdGreaterThan(String value) {
            addCriterion("stop_id >", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdGreaterThanOrEqualTo(String value) {
            addCriterion("stop_id >=", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLessThan(String value) {
            addCriterion("stop_id <", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLessThanOrEqualTo(String value) {
            addCriterion("stop_id <=", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdLike(String value) {
            addCriterion("stop_id like", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotLike(String value) {
            addCriterion("stop_id not like", value, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdIn(List<String> values) {
            addCriterion("stop_id in", values, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotIn(List<String> values) {
            addCriterion("stop_id not in", values, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdBetween(String value1, String value2) {
            addCriterion("stop_id between", value1, value2, "stopId");
            return (Criteria) this;
        }

        public Criteria andStopIdNotBetween(String value1, String value2) {
            addCriterion("stop_id not between", value1, value2, "stopId");
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
    }

    /**
     */
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