package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class YpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public YpExample() {
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

        public Criteria andYpidIsNull() {
            addCriterion("ypid is null");
            return (Criteria) this;
        }

        public Criteria andYpidIsNotNull() {
            addCriterion("ypid is not null");
            return (Criteria) this;
        }

        public Criteria andYpidEqualTo(Integer value) {
            addCriterion("ypid =", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidNotEqualTo(Integer value) {
            addCriterion("ypid <>", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidGreaterThan(Integer value) {
            addCriterion("ypid >", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ypid >=", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidLessThan(Integer value) {
            addCriterion("ypid <", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidLessThanOrEqualTo(Integer value) {
            addCriterion("ypid <=", value, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidIn(List<Integer> values) {
            addCriterion("ypid in", values, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidNotIn(List<Integer> values) {
            addCriterion("ypid not in", values, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidBetween(Integer value1, Integer value2) {
            addCriterion("ypid between", value1, value2, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpidNotBetween(Integer value1, Integer value2) {
            addCriterion("ypid not between", value1, value2, "ypid");
            return (Criteria) this;
        }

        public Criteria andYpnameIsNull() {
            addCriterion("ypname is null");
            return (Criteria) this;
        }

        public Criteria andYpnameIsNotNull() {
            addCriterion("ypname is not null");
            return (Criteria) this;
        }

        public Criteria andYpnameEqualTo(String value) {
            addCriterion("ypname =", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameNotEqualTo(String value) {
            addCriterion("ypname <>", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameGreaterThan(String value) {
            addCriterion("ypname >", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameGreaterThanOrEqualTo(String value) {
            addCriterion("ypname >=", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameLessThan(String value) {
            addCriterion("ypname <", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameLessThanOrEqualTo(String value) {
            addCriterion("ypname <=", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameLike(String value) {
            addCriterion("ypname like", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameNotLike(String value) {
            addCriterion("ypname not like", value, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameIn(List<String> values) {
            addCriterion("ypname in", values, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameNotIn(List<String> values) {
            addCriterion("ypname not in", values, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameBetween(String value1, String value2) {
            addCriterion("ypname between", value1, value2, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpnameNotBetween(String value1, String value2) {
            addCriterion("ypname not between", value1, value2, "ypname");
            return (Criteria) this;
        }

        public Criteria andYpggIsNull() {
            addCriterion("ypgg is null");
            return (Criteria) this;
        }

        public Criteria andYpggIsNotNull() {
            addCriterion("ypgg is not null");
            return (Criteria) this;
        }

        public Criteria andYpggEqualTo(String value) {
            addCriterion("ypgg =", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggNotEqualTo(String value) {
            addCriterion("ypgg <>", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggGreaterThan(String value) {
            addCriterion("ypgg >", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggGreaterThanOrEqualTo(String value) {
            addCriterion("ypgg >=", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggLessThan(String value) {
            addCriterion("ypgg <", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggLessThanOrEqualTo(String value) {
            addCriterion("ypgg <=", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggLike(String value) {
            addCriterion("ypgg like", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggNotLike(String value) {
            addCriterion("ypgg not like", value, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggIn(List<String> values) {
            addCriterion("ypgg in", values, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggNotIn(List<String> values) {
            addCriterion("ypgg not in", values, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggBetween(String value1, String value2) {
            addCriterion("ypgg between", value1, value2, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpggNotBetween(String value1, String value2) {
            addCriterion("ypgg not between", value1, value2, "ypgg");
            return (Criteria) this;
        }

        public Criteria andYpdwIsNull() {
            addCriterion("ypdw is null");
            return (Criteria) this;
        }

        public Criteria andYpdwIsNotNull() {
            addCriterion("ypdw is not null");
            return (Criteria) this;
        }

        public Criteria andYpdwEqualTo(String value) {
            addCriterion("ypdw =", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwNotEqualTo(String value) {
            addCriterion("ypdw <>", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwGreaterThan(String value) {
            addCriterion("ypdw >", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwGreaterThanOrEqualTo(String value) {
            addCriterion("ypdw >=", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwLessThan(String value) {
            addCriterion("ypdw <", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwLessThanOrEqualTo(String value) {
            addCriterion("ypdw <=", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwLike(String value) {
            addCriterion("ypdw like", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwNotLike(String value) {
            addCriterion("ypdw not like", value, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwIn(List<String> values) {
            addCriterion("ypdw in", values, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwNotIn(List<String> values) {
            addCriterion("ypdw not in", values, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwBetween(String value1, String value2) {
            addCriterion("ypdw between", value1, value2, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYpdwNotBetween(String value1, String value2) {
            addCriterion("ypdw not between", value1, value2, "ypdw");
            return (Criteria) this;
        }

        public Criteria andYppriceIsNull() {
            addCriterion("ypprice is null");
            return (Criteria) this;
        }

        public Criteria andYppriceIsNotNull() {
            addCriterion("ypprice is not null");
            return (Criteria) this;
        }

        public Criteria andYppriceEqualTo(Double value) {
            addCriterion("ypprice =", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceNotEqualTo(Double value) {
            addCriterion("ypprice <>", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceGreaterThan(Double value) {
            addCriterion("ypprice >", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ypprice >=", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceLessThan(Double value) {
            addCriterion("ypprice <", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceLessThanOrEqualTo(Double value) {
            addCriterion("ypprice <=", value, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceIn(List<Double> values) {
            addCriterion("ypprice in", values, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceNotIn(List<Double> values) {
            addCriterion("ypprice not in", values, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceBetween(Double value1, Double value2) {
            addCriterion("ypprice between", value1, value2, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYppriceNotBetween(Double value1, Double value2) {
            addCriterion("ypprice not between", value1, value2, "ypprice");
            return (Criteria) this;
        }

        public Criteria andYpbztimeIsNull() {
            addCriterion("ypbztime is null");
            return (Criteria) this;
        }

        public Criteria andYpbztimeIsNotNull() {
            addCriterion("ypbztime is not null");
            return (Criteria) this;
        }

        public Criteria andYpbztimeEqualTo(String value) {
            addCriterion("ypbztime =", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeNotEqualTo(String value) {
            addCriterion("ypbztime <>", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeGreaterThan(String value) {
            addCriterion("ypbztime >", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeGreaterThanOrEqualTo(String value) {
            addCriterion("ypbztime >=", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeLessThan(String value) {
            addCriterion("ypbztime <", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeLessThanOrEqualTo(String value) {
            addCriterion("ypbztime <=", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeLike(String value) {
            addCriterion("ypbztime like", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeNotLike(String value) {
            addCriterion("ypbztime not like", value, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeIn(List<String> values) {
            addCriterion("ypbztime in", values, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeNotIn(List<String> values) {
            addCriterion("ypbztime not in", values, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeBetween(String value1, String value2) {
            addCriterion("ypbztime between", value1, value2, "ypbztime");
            return (Criteria) this;
        }

        public Criteria andYpbztimeNotBetween(String value1, String value2) {
            addCriterion("ypbztime not between", value1, value2, "ypbztime");
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