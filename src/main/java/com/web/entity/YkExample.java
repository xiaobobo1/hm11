package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class YkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public YkExample() {
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

        public Criteria andYkidIsNull() {
            addCriterion("ykid is null");
            return (Criteria) this;
        }

        public Criteria andYkidIsNotNull() {
            addCriterion("ykid is not null");
            return (Criteria) this;
        }

        public Criteria andYkidEqualTo(Integer value) {
            addCriterion("ykid =", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidNotEqualTo(Integer value) {
            addCriterion("ykid <>", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidGreaterThan(Integer value) {
            addCriterion("ykid >", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ykid >=", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidLessThan(Integer value) {
            addCriterion("ykid <", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidLessThanOrEqualTo(Integer value) {
            addCriterion("ykid <=", value, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidIn(List<Integer> values) {
            addCriterion("ykid in", values, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidNotIn(List<Integer> values) {
            addCriterion("ykid not in", values, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidBetween(Integer value1, Integer value2) {
            addCriterion("ykid between", value1, value2, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkidNotBetween(Integer value1, Integer value2) {
            addCriterion("ykid not between", value1, value2, "ykid");
            return (Criteria) this;
        }

        public Criteria andYkfzidIsNull() {
            addCriterion("ykfzid is null");
            return (Criteria) this;
        }

        public Criteria andYkfzidIsNotNull() {
            addCriterion("ykfzid is not null");
            return (Criteria) this;
        }

        public Criteria andYkfzidEqualTo(Integer value) {
            addCriterion("ykfzid =", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidNotEqualTo(Integer value) {
            addCriterion("ykfzid <>", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidGreaterThan(Integer value) {
            addCriterion("ykfzid >", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ykfzid >=", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidLessThan(Integer value) {
            addCriterion("ykfzid <", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidLessThanOrEqualTo(Integer value) {
            addCriterion("ykfzid <=", value, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidIn(List<Integer> values) {
            addCriterion("ykfzid in", values, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidNotIn(List<Integer> values) {
            addCriterion("ykfzid not in", values, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidBetween(Integer value1, Integer value2) {
            addCriterion("ykfzid between", value1, value2, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYkfzidNotBetween(Integer value1, Integer value2) {
            addCriterion("ykfzid not between", value1, value2, "ykfzid");
            return (Criteria) this;
        }

        public Criteria andYklbIsNull() {
            addCriterion("yklb is null");
            return (Criteria) this;
        }

        public Criteria andYklbIsNotNull() {
            addCriterion("yklb is not null");
            return (Criteria) this;
        }

        public Criteria andYklbEqualTo(String value) {
            addCriterion("yklb =", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbNotEqualTo(String value) {
            addCriterion("yklb <>", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbGreaterThan(String value) {
            addCriterion("yklb >", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbGreaterThanOrEqualTo(String value) {
            addCriterion("yklb >=", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbLessThan(String value) {
            addCriterion("yklb <", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbLessThanOrEqualTo(String value) {
            addCriterion("yklb <=", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbLike(String value) {
            addCriterion("yklb like", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbNotLike(String value) {
            addCriterion("yklb not like", value, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbIn(List<String> values) {
            addCriterion("yklb in", values, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbNotIn(List<String> values) {
            addCriterion("yklb not in", values, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbBetween(String value1, String value2) {
            addCriterion("yklb between", value1, value2, "yklb");
            return (Criteria) this;
        }

        public Criteria andYklbNotBetween(String value1, String value2) {
            addCriterion("yklb not between", value1, value2, "yklb");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("area not between", value1, value2, "area");
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