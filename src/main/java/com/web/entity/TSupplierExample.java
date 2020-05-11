package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class TSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TSupplierExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
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

        public Criteria andSIdIsNull() {
            addCriterion("sId is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("sId is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("sId =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("sId <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("sId >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sId >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("sId <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("sId <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("sId in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("sId not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("sId between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sId not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("sName is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("sName is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("sName =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("sName <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("sName >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("sName >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("sName <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("sName <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("sName like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("sName not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("sName in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("sName not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("sName between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("sName not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("sAddress is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("sAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("sAddress =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("sAddress <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("sAddress >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sAddress >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("sAddress <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("sAddress <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("sAddress like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("sAddress not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("sAddress in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("sAddress not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("sAddress between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("sAddress not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSTelIsNull() {
            addCriterion("sTel is null");
            return (Criteria) this;
        }

        public Criteria andSTelIsNotNull() {
            addCriterion("sTel is not null");
            return (Criteria) this;
        }

        public Criteria andSTelEqualTo(String value) {
            addCriterion("sTel =", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotEqualTo(String value) {
            addCriterion("sTel <>", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThan(String value) {
            addCriterion("sTel >", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThanOrEqualTo(String value) {
            addCriterion("sTel >=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThan(String value) {
            addCriterion("sTel <", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThanOrEqualTo(String value) {
            addCriterion("sTel <=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLike(String value) {
            addCriterion("sTel like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotLike(String value) {
            addCriterion("sTel not like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelIn(List<String> values) {
            addCriterion("sTel in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotIn(List<String> values) {
            addCriterion("sTel not in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelBetween(String value1, String value2) {
            addCriterion("sTel between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotBetween(String value1, String value2) {
            addCriterion("sTel not between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSSituationIsNull() {
            addCriterion("sSituation is null");
            return (Criteria) this;
        }

        public Criteria andSSituationIsNotNull() {
            addCriterion("sSituation is not null");
            return (Criteria) this;
        }

        public Criteria andSSituationEqualTo(String value) {
            addCriterion("sSituation =", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationNotEqualTo(String value) {
            addCriterion("sSituation <>", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationGreaterThan(String value) {
            addCriterion("sSituation >", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationGreaterThanOrEqualTo(String value) {
            addCriterion("sSituation >=", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationLessThan(String value) {
            addCriterion("sSituation <", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationLessThanOrEqualTo(String value) {
            addCriterion("sSituation <=", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationLike(String value) {
            addCriterion("sSituation like", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationNotLike(String value) {
            addCriterion("sSituation not like", value, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationIn(List<String> values) {
            addCriterion("sSituation in", values, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationNotIn(List<String> values) {
            addCriterion("sSituation not in", values, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationBetween(String value1, String value2) {
            addCriterion("sSituation between", value1, value2, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSSituationNotBetween(String value1, String value2) {
            addCriterion("sSituation not between", value1, value2, "sSituation");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteIsNull() {
            addCriterion("sIsdelete is null");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteIsNotNull() {
            addCriterion("sIsdelete is not null");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteEqualTo(Integer value) {
            addCriterion("sIsdelete =", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteNotEqualTo(Integer value) {
            addCriterion("sIsdelete <>", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteGreaterThan(Integer value) {
            addCriterion("sIsdelete >", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("sIsdelete >=", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteLessThan(Integer value) {
            addCriterion("sIsdelete <", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("sIsdelete <=", value, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteIn(List<Integer> values) {
            addCriterion("sIsdelete in", values, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteNotIn(List<Integer> values) {
            addCriterion("sIsdelete not in", values, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("sIsdelete between", value1, value2, "sIsdelete");
            return (Criteria) this;
        }

        public Criteria andSIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("sIsdelete not between", value1, value2, "sIsdelete");
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