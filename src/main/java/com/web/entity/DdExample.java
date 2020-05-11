package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class DdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DdExample() {
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

        public Criteria andDdidIsNull() {
            addCriterion("ddid is null");
            return (Criteria) this;
        }

        public Criteria andDdidIsNotNull() {
            addCriterion("ddid is not null");
            return (Criteria) this;
        }

        public Criteria andDdidEqualTo(Integer value) {
            addCriterion("ddid =", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotEqualTo(Integer value) {
            addCriterion("ddid <>", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThan(Integer value) {
            addCriterion("ddid >", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddid >=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThan(Integer value) {
            addCriterion("ddid <", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidLessThanOrEqualTo(Integer value) {
            addCriterion("ddid <=", value, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidIn(List<Integer> values) {
            addCriterion("ddid in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotIn(List<Integer> values) {
            addCriterion("ddid not in", values, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidBetween(Integer value1, Integer value2) {
            addCriterion("ddid between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andDdidNotBetween(Integer value1, Integer value2) {
            addCriterion("ddid not between", value1, value2, "ddid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andDdcountIsNull() {
            addCriterion("ddcount is null");
            return (Criteria) this;
        }

        public Criteria andDdcountIsNotNull() {
            addCriterion("ddcount is not null");
            return (Criteria) this;
        }

        public Criteria andDdcountEqualTo(Integer value) {
            addCriterion("ddcount =", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountNotEqualTo(Integer value) {
            addCriterion("ddcount <>", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountGreaterThan(Integer value) {
            addCriterion("ddcount >", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ddcount >=", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountLessThan(Integer value) {
            addCriterion("ddcount <", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountLessThanOrEqualTo(Integer value) {
            addCriterion("ddcount <=", value, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountIn(List<Integer> values) {
            addCriterion("ddcount in", values, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountNotIn(List<Integer> values) {
            addCriterion("ddcount not in", values, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountBetween(Integer value1, Integer value2) {
            addCriterion("ddcount between", value1, value2, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDdcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ddcount not between", value1, value2, "ddcount");
            return (Criteria) this;
        }

        public Criteria andDhdateIsNull() {
            addCriterion("dhdate is null");
            return (Criteria) this;
        }

        public Criteria andDhdateIsNotNull() {
            addCriterion("dhdate is not null");
            return (Criteria) this;
        }

        public Criteria andDhdateEqualTo(String value) {
            addCriterion("dhdate =", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateNotEqualTo(String value) {
            addCriterion("dhdate <>", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateGreaterThan(String value) {
            addCriterion("dhdate >", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateGreaterThanOrEqualTo(String value) {
            addCriterion("dhdate >=", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateLessThan(String value) {
            addCriterion("dhdate <", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateLessThanOrEqualTo(String value) {
            addCriterion("dhdate <=", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateLike(String value) {
            addCriterion("dhdate like", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateNotLike(String value) {
            addCriterion("dhdate not like", value, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateIn(List<String> values) {
            addCriterion("dhdate in", values, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateNotIn(List<String> values) {
            addCriterion("dhdate not in", values, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateBetween(String value1, String value2) {
            addCriterion("dhdate between", value1, value2, "dhdate");
            return (Criteria) this;
        }

        public Criteria andDhdateNotBetween(String value1, String value2) {
            addCriterion("dhdate not between", value1, value2, "dhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateIsNull() {
            addCriterion("jhdate is null");
            return (Criteria) this;
        }

        public Criteria andJhdateIsNotNull() {
            addCriterion("jhdate is not null");
            return (Criteria) this;
        }

        public Criteria andJhdateEqualTo(String value) {
            addCriterion("jhdate =", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateNotEqualTo(String value) {
            addCriterion("jhdate <>", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateGreaterThan(String value) {
            addCriterion("jhdate >", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateGreaterThanOrEqualTo(String value) {
            addCriterion("jhdate >=", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateLessThan(String value) {
            addCriterion("jhdate <", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateLessThanOrEqualTo(String value) {
            addCriterion("jhdate <=", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateLike(String value) {
            addCriterion("jhdate like", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateNotLike(String value) {
            addCriterion("jhdate not like", value, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateIn(List<String> values) {
            addCriterion("jhdate in", values, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateNotIn(List<String> values) {
            addCriterion("jhdate not in", values, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateBetween(String value1, String value2) {
            addCriterion("jhdate between", value1, value2, "jhdate");
            return (Criteria) this;
        }

        public Criteria andJhdateNotBetween(String value1, String value2) {
            addCriterion("jhdate not between", value1, value2, "jhdate");
            return (Criteria) this;
        }

        public Criteria andScaddressIsNull() {
            addCriterion("scaddress is null");
            return (Criteria) this;
        }

        public Criteria andScaddressIsNotNull() {
            addCriterion("scaddress is not null");
            return (Criteria) this;
        }

        public Criteria andScaddressEqualTo(String value) {
            addCriterion("scaddress =", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotEqualTo(String value) {
            addCriterion("scaddress <>", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressGreaterThan(String value) {
            addCriterion("scaddress >", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressGreaterThanOrEqualTo(String value) {
            addCriterion("scaddress >=", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLessThan(String value) {
            addCriterion("scaddress <", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLessThanOrEqualTo(String value) {
            addCriterion("scaddress <=", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressLike(String value) {
            addCriterion("scaddress like", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotLike(String value) {
            addCriterion("scaddress not like", value, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressIn(List<String> values) {
            addCriterion("scaddress in", values, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotIn(List<String> values) {
            addCriterion("scaddress not in", values, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressBetween(String value1, String value2) {
            addCriterion("scaddress between", value1, value2, "scaddress");
            return (Criteria) this;
        }

        public Criteria andScaddressNotBetween(String value1, String value2) {
            addCriterion("scaddress not between", value1, value2, "scaddress");
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