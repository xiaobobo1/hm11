package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class YpqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public YpqlExample() {
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

        public Criteria andYpqlidIsNull() {
            addCriterion("ypqlid is null");
            return (Criteria) this;
        }

        public Criteria andYpqlidIsNotNull() {
            addCriterion("ypqlid is not null");
            return (Criteria) this;
        }

        public Criteria andYpqlidEqualTo(Integer value) {
            addCriterion("ypqlid =", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidNotEqualTo(Integer value) {
            addCriterion("ypqlid <>", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidGreaterThan(Integer value) {
            addCriterion("ypqlid >", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ypqlid >=", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidLessThan(Integer value) {
            addCriterion("ypqlid <", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidLessThanOrEqualTo(Integer value) {
            addCriterion("ypqlid <=", value, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidIn(List<Integer> values) {
            addCriterion("ypqlid in", values, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidNotIn(List<Integer> values) {
            addCriterion("ypqlid not in", values, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidBetween(Integer value1, Integer value2) {
            addCriterion("ypqlid between", value1, value2, "ypqlid");
            return (Criteria) this;
        }

        public Criteria andYpqlidNotBetween(Integer value1, Integer value2) {
            addCriterion("ypqlid not between", value1, value2, "ypqlid");
            return (Criteria) this;
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

        public Criteria andLydwIsNull() {
            addCriterion("lydw is null");
            return (Criteria) this;
        }

        public Criteria andLydwIsNotNull() {
            addCriterion("lydw is not null");
            return (Criteria) this;
        }

        public Criteria andLydwEqualTo(String value) {
            addCriterion("lydw =", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwNotEqualTo(String value) {
            addCriterion("lydw <>", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwGreaterThan(String value) {
            addCriterion("lydw >", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwGreaterThanOrEqualTo(String value) {
            addCriterion("lydw >=", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwLessThan(String value) {
            addCriterion("lydw <", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwLessThanOrEqualTo(String value) {
            addCriterion("lydw <=", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwLike(String value) {
            addCriterion("lydw like", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwNotLike(String value) {
            addCriterion("lydw not like", value, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwIn(List<String> values) {
            addCriterion("lydw in", values, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwNotIn(List<String> values) {
            addCriterion("lydw not in", values, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwBetween(String value1, String value2) {
            addCriterion("lydw between", value1, value2, "lydw");
            return (Criteria) this;
        }

        public Criteria andLydwNotBetween(String value1, String value2) {
            addCriterion("lydw not between", value1, value2, "lydw");
            return (Criteria) this;
        }

        public Criteria andLycountIsNull() {
            addCriterion("lycount is null");
            return (Criteria) this;
        }

        public Criteria andLycountIsNotNull() {
            addCriterion("lycount is not null");
            return (Criteria) this;
        }

        public Criteria andLycountEqualTo(Integer value) {
            addCriterion("lycount =", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountNotEqualTo(Integer value) {
            addCriterion("lycount <>", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountGreaterThan(Integer value) {
            addCriterion("lycount >", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lycount >=", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountLessThan(Integer value) {
            addCriterion("lycount <", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountLessThanOrEqualTo(Integer value) {
            addCriterion("lycount <=", value, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountIn(List<Integer> values) {
            addCriterion("lycount in", values, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountNotIn(List<Integer> values) {
            addCriterion("lycount not in", values, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountBetween(Integer value1, Integer value2) {
            addCriterion("lycount between", value1, value2, "lycount");
            return (Criteria) this;
        }

        public Criteria andLycountNotBetween(Integer value1, Integer value2) {
            addCriterion("lycount not between", value1, value2, "lycount");
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