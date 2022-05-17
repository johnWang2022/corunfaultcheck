package com.corun.faultcheck.fault.check.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaultInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FaultInfoExample() {
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(String value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(String value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(String value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(String value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(String value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(String value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLike(String value) {
            addCriterion("image_id like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotLike(String value) {
            addCriterion("image_id not like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<String> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<String> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(String value1, String value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(String value1, String value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andStartPointXIsNull() {
            addCriterion("start_point_x is null");
            return (Criteria) this;
        }

        public Criteria andStartPointXIsNotNull() {
            addCriterion("start_point_x is not null");
            return (Criteria) this;
        }

        public Criteria andStartPointXEqualTo(Long value) {
            addCriterion("start_point_x =", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotEqualTo(Long value) {
            addCriterion("start_point_x <>", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXGreaterThan(Long value) {
            addCriterion("start_point_x >", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXGreaterThanOrEqualTo(Long value) {
            addCriterion("start_point_x >=", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXLessThan(Long value) {
            addCriterion("start_point_x <", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXLessThanOrEqualTo(Long value) {
            addCriterion("start_point_x <=", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXIn(List<Long> values) {
            addCriterion("start_point_x in", values, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotIn(List<Long> values) {
            addCriterion("start_point_x not in", values, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXBetween(Long value1, Long value2) {
            addCriterion("start_point_x between", value1, value2, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotBetween(Long value1, Long value2) {
            addCriterion("start_point_x not between", value1, value2, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointYIsNull() {
            addCriterion("start_point_y is null");
            return (Criteria) this;
        }

        public Criteria andStartPointYIsNotNull() {
            addCriterion("start_point_y is not null");
            return (Criteria) this;
        }

        public Criteria andStartPointYEqualTo(Long value) {
            addCriterion("start_point_y =", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotEqualTo(Long value) {
            addCriterion("start_point_y <>", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYGreaterThan(Long value) {
            addCriterion("start_point_y >", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYGreaterThanOrEqualTo(Long value) {
            addCriterion("start_point_y >=", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYLessThan(Long value) {
            addCriterion("start_point_y <", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYLessThanOrEqualTo(Long value) {
            addCriterion("start_point_y <=", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYIn(List<Long> values) {
            addCriterion("start_point_y in", values, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotIn(List<Long> values) {
            addCriterion("start_point_y not in", values, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYBetween(Long value1, Long value2) {
            addCriterion("start_point_y between", value1, value2, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotBetween(Long value1, Long value2) {
            addCriterion("start_point_y not between", value1, value2, "startPointY");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Long value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Long value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Long value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Long value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Long value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Long> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Long> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Long value1, Long value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Long value1, Long value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Long value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Long value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Long value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Long value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Long value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Long value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Long> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Long> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Long value1, Long value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Long value1, Long value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNull() {
            addCriterion("fault_type is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("fault_type is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(Integer value) {
            addCriterion("fault_type =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(Integer value) {
            addCriterion("fault_type <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(Integer value) {
            addCriterion("fault_type >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fault_type >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(Integer value) {
            addCriterion("fault_type <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fault_type <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<Integer> values) {
            addCriterion("fault_type in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<Integer> values) {
            addCriterion("fault_type not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(Integer value1, Integer value2) {
            addCriterion("fault_type between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fault_type not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Integer value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Integer value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Integer value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Integer value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Integer> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Integer> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
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