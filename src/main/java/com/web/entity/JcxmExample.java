package com.web.entity;

import java.util.ArrayList;
import java.util.List;

public class JcxmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public JcxmExample() {
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

        public Criteria andMzblidIsNull() {
            addCriterion("mzblid is null");
            return (Criteria) this;
        }

        public Criteria andMzblidIsNotNull() {
            addCriterion("mzblid is not null");
            return (Criteria) this;
        }

        public Criteria andMzblidEqualTo(Integer value) {
            addCriterion("mzblid =", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidNotEqualTo(Integer value) {
            addCriterion("mzblid <>", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidGreaterThan(Integer value) {
            addCriterion("mzblid >", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mzblid >=", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidLessThan(Integer value) {
            addCriterion("mzblid <", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidLessThanOrEqualTo(Integer value) {
            addCriterion("mzblid <=", value, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidIn(List<Integer> values) {
            addCriterion("mzblid in", values, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidNotIn(List<Integer> values) {
            addCriterion("mzblid not in", values, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidBetween(Integer value1, Integer value2) {
            addCriterion("mzblid between", value1, value2, "mzblid");
            return (Criteria) this;
        }

        public Criteria andMzblidNotBetween(Integer value1, Integer value2) {
            addCriterion("mzblid not between", value1, value2, "mzblid");
            return (Criteria) this;
        }

        public Criteria andJcysIsNull() {
            addCriterion("jcys is null");
            return (Criteria) this;
        }

        public Criteria andJcysIsNotNull() {
            addCriterion("jcys is not null");
            return (Criteria) this;
        }

        public Criteria andJcysEqualTo(String value) {
            addCriterion("jcys =", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysNotEqualTo(String value) {
            addCriterion("jcys <>", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysGreaterThan(String value) {
            addCriterion("jcys >", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysGreaterThanOrEqualTo(String value) {
            addCriterion("jcys >=", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysLessThan(String value) {
            addCriterion("jcys <", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysLessThanOrEqualTo(String value) {
            addCriterion("jcys <=", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysLike(String value) {
            addCriterion("jcys like", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysNotLike(String value) {
            addCriterion("jcys not like", value, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysIn(List<String> values) {
            addCriterion("jcys in", values, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysNotIn(List<String> values) {
            addCriterion("jcys not in", values, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysBetween(String value1, String value2) {
            addCriterion("jcys between", value1, value2, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcysNotBetween(String value1, String value2) {
            addCriterion("jcys not between", value1, value2, "jcys");
            return (Criteria) this;
        }

        public Criteria andJcnrIsNull() {
            addCriterion("jcnr is null");
            return (Criteria) this;
        }

        public Criteria andJcnrIsNotNull() {
            addCriterion("jcnr is not null");
            return (Criteria) this;
        }

        public Criteria andJcnrEqualTo(String value) {
            addCriterion("jcnr =", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrNotEqualTo(String value) {
            addCriterion("jcnr <>", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrGreaterThan(String value) {
            addCriterion("jcnr >", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrGreaterThanOrEqualTo(String value) {
            addCriterion("jcnr >=", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrLessThan(String value) {
            addCriterion("jcnr <", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrLessThanOrEqualTo(String value) {
            addCriterion("jcnr <=", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrLike(String value) {
            addCriterion("jcnr like", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrNotLike(String value) {
            addCriterion("jcnr not like", value, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrIn(List<String> values) {
            addCriterion("jcnr in", values, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrNotIn(List<String> values) {
            addCriterion("jcnr not in", values, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrBetween(String value1, String value2) {
            addCriterion("jcnr between", value1, value2, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcnrNotBetween(String value1, String value2) {
            addCriterion("jcnr not between", value1, value2, "jcnr");
            return (Criteria) this;
        }

        public Criteria andJcfxIsNull() {
            addCriterion("jcfx is null");
            return (Criteria) this;
        }

        public Criteria andJcfxIsNotNull() {
            addCriterion("jcfx is not null");
            return (Criteria) this;
        }

        public Criteria andJcfxEqualTo(String value) {
            addCriterion("jcfx =", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxNotEqualTo(String value) {
            addCriterion("jcfx <>", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxGreaterThan(String value) {
            addCriterion("jcfx >", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxGreaterThanOrEqualTo(String value) {
            addCriterion("jcfx >=", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxLessThan(String value) {
            addCriterion("jcfx <", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxLessThanOrEqualTo(String value) {
            addCriterion("jcfx <=", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxLike(String value) {
            addCriterion("jcfx like", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxNotLike(String value) {
            addCriterion("jcfx not like", value, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxIn(List<String> values) {
            addCriterion("jcfx in", values, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxNotIn(List<String> values) {
            addCriterion("jcfx not in", values, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxBetween(String value1, String value2) {
            addCriterion("jcfx between", value1, value2, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJcfxNotBetween(String value1, String value2) {
            addCriterion("jcfx not between", value1, value2, "jcfx");
            return (Criteria) this;
        }

        public Criteria andJxjgIsNull() {
            addCriterion("jxjg is null");
            return (Criteria) this;
        }

        public Criteria andJxjgIsNotNull() {
            addCriterion("jxjg is not null");
            return (Criteria) this;
        }

        public Criteria andJxjgEqualTo(String value) {
            addCriterion("jxjg =", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgNotEqualTo(String value) {
            addCriterion("jxjg <>", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgGreaterThan(String value) {
            addCriterion("jxjg >", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgGreaterThanOrEqualTo(String value) {
            addCriterion("jxjg >=", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgLessThan(String value) {
            addCriterion("jxjg <", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgLessThanOrEqualTo(String value) {
            addCriterion("jxjg <=", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgLike(String value) {
            addCriterion("jxjg like", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgNotLike(String value) {
            addCriterion("jxjg not like", value, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgIn(List<String> values) {
            addCriterion("jxjg in", values, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgNotIn(List<String> values) {
            addCriterion("jxjg not in", values, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgBetween(String value1, String value2) {
            addCriterion("jxjg between", value1, value2, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJxjgNotBetween(String value1, String value2) {
            addCriterion("jxjg not between", value1, value2, "jxjg");
            return (Criteria) this;
        }

        public Criteria andJcfyIsNull() {
            addCriterion("jcfy is null");
            return (Criteria) this;
        }

        public Criteria andJcfyIsNotNull() {
            addCriterion("jcfy is not null");
            return (Criteria) this;
        }

        public Criteria andJcfyEqualTo(Double value) {
            addCriterion("jcfy =", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyNotEqualTo(Double value) {
            addCriterion("jcfy <>", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyGreaterThan(Double value) {
            addCriterion("jcfy >", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyGreaterThanOrEqualTo(Double value) {
            addCriterion("jcfy >=", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyLessThan(Double value) {
            addCriterion("jcfy <", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyLessThanOrEqualTo(Double value) {
            addCriterion("jcfy <=", value, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyIn(List<Double> values) {
            addCriterion("jcfy in", values, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyNotIn(List<Double> values) {
            addCriterion("jcfy not in", values, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyBetween(Double value1, Double value2) {
            addCriterion("jcfy between", value1, value2, "jcfy");
            return (Criteria) this;
        }

        public Criteria andJcfyNotBetween(Double value1, Double value2) {
            addCriterion("jcfy not between", value1, value2, "jcfy");
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