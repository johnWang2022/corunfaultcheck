package com.corun.faultcheck.fault.check.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SheetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SheetsExample() {
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

        public Criteria andSheetsCodeIsNull() {
            addCriterion("sheets_code is null");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeIsNotNull() {
            addCriterion("sheets_code is not null");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeEqualTo(String value) {
            addCriterion("sheets_code =", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeNotEqualTo(String value) {
            addCriterion("sheets_code <>", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeGreaterThan(String value) {
            addCriterion("sheets_code >", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sheets_code >=", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeLessThan(String value) {
            addCriterion("sheets_code <", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeLessThanOrEqualTo(String value) {
            addCriterion("sheets_code <=", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeLike(String value) {
            addCriterion("sheets_code like", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeNotLike(String value) {
            addCriterion("sheets_code not like", value, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeIn(List<String> values) {
            addCriterion("sheets_code in", values, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeNotIn(List<String> values) {
            addCriterion("sheets_code not in", values, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeBetween(String value1, String value2) {
            addCriterion("sheets_code between", value1, value2, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andSheetsCodeNotBetween(String value1, String value2) {
            addCriterion("sheets_code not between", value1, value2, "sheetsCode");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdIsNull() {
            addCriterion("pro_line_config_id is null");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdIsNotNull() {
            addCriterion("pro_line_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdEqualTo(String value) {
            addCriterion("pro_line_config_id =", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdNotEqualTo(String value) {
            addCriterion("pro_line_config_id <>", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdGreaterThan(String value) {
            addCriterion("pro_line_config_id >", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_line_config_id >=", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdLessThan(String value) {
            addCriterion("pro_line_config_id <", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdLessThanOrEqualTo(String value) {
            addCriterion("pro_line_config_id <=", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdLike(String value) {
            addCriterion("pro_line_config_id like", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdNotLike(String value) {
            addCriterion("pro_line_config_id not like", value, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdIn(List<String> values) {
            addCriterion("pro_line_config_id in", values, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdNotIn(List<String> values) {
            addCriterion("pro_line_config_id not in", values, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdBetween(String value1, String value2) {
            addCriterion("pro_line_config_id between", value1, value2, "proLineConfigId");
            return (Criteria) this;
        }

        public Criteria andProLineConfigIdNotBetween(String value1, String value2) {
            addCriterion("pro_line_config_id not between", value1, value2, "proLineConfigId");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNull() {
            addCriterion("oper_person is null");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNotNull() {
            addCriterion("oper_person is not null");
            return (Criteria) this;
        }

        public Criteria andOperPersonEqualTo(String value) {
            addCriterion("oper_person =", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotEqualTo(String value) {
            addCriterion("oper_person <>", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThan(String value) {
            addCriterion("oper_person >", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThanOrEqualTo(String value) {
            addCriterion("oper_person >=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThan(String value) {
            addCriterion("oper_person <", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThanOrEqualTo(String value) {
            addCriterion("oper_person <=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLike(String value) {
            addCriterion("oper_person like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotLike(String value) {
            addCriterion("oper_person not like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonIn(List<String> values) {
            addCriterion("oper_person in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotIn(List<String> values) {
            addCriterion("oper_person not in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonBetween(String value1, String value2) {
            addCriterion("oper_person between", value1, value2, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotBetween(String value1, String value2) {
            addCriterion("oper_person not between", value1, value2, "operPerson");
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

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
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