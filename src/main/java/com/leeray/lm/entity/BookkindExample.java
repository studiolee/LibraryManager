package com.leeray.lm.entity;

import java.util.ArrayList;
import java.util.List;

public class BookkindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookkindExample() {
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

        public Criteria andBknoIsNull() {
            addCriterion("BKNO is null");
            return (Criteria) this;
        }

        public Criteria andBknoIsNotNull() {
            addCriterion("BKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBknoEqualTo(String value) {
            addCriterion("BKNO =", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoNotEqualTo(String value) {
            addCriterion("BKNO <>", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoGreaterThan(String value) {
            addCriterion("BKNO >", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoGreaterThanOrEqualTo(String value) {
            addCriterion("BKNO >=", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoLessThan(String value) {
            addCriterion("BKNO <", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoLessThanOrEqualTo(String value) {
            addCriterion("BKNO <=", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoLike(String value) {
            addCriterion("BKNO like", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoNotLike(String value) {
            addCriterion("BKNO not like", value, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoIn(List<String> values) {
            addCriterion("BKNO in", values, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoNotIn(List<String> values) {
            addCriterion("BKNO not in", values, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoBetween(String value1, String value2) {
            addCriterion("BKNO between", value1, value2, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknoNotBetween(String value1, String value2) {
            addCriterion("BKNO not between", value1, value2, "bkno");
            return (Criteria) this;
        }

        public Criteria andBknameIsNull() {
            addCriterion("BKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBknameIsNotNull() {
            addCriterion("BKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBknameEqualTo(String value) {
            addCriterion("BKNAME =", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameNotEqualTo(String value) {
            addCriterion("BKNAME <>", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameGreaterThan(String value) {
            addCriterion("BKNAME >", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameGreaterThanOrEqualTo(String value) {
            addCriterion("BKNAME >=", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameLessThan(String value) {
            addCriterion("BKNAME <", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameLessThanOrEqualTo(String value) {
            addCriterion("BKNAME <=", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameLike(String value) {
            addCriterion("BKNAME like", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameNotLike(String value) {
            addCriterion("BKNAME not like", value, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameIn(List<String> values) {
            addCriterion("BKNAME in", values, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameNotIn(List<String> values) {
            addCriterion("BKNAME not in", values, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameBetween(String value1, String value2) {
            addCriterion("BKNAME between", value1, value2, "bkname");
            return (Criteria) this;
        }

        public Criteria andBknameNotBetween(String value1, String value2) {
            addCriterion("BKNAME not between", value1, value2, "bkname");
            return (Criteria) this;
        }

        public Criteria andBkdIsNull() {
            addCriterion("BKD is null");
            return (Criteria) this;
        }

        public Criteria andBkdIsNotNull() {
            addCriterion("BKD is not null");
            return (Criteria) this;
        }

        public Criteria andBkdEqualTo(String value) {
            addCriterion("BKD =", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdNotEqualTo(String value) {
            addCriterion("BKD <>", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdGreaterThan(String value) {
            addCriterion("BKD >", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdGreaterThanOrEqualTo(String value) {
            addCriterion("BKD >=", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdLessThan(String value) {
            addCriterion("BKD <", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdLessThanOrEqualTo(String value) {
            addCriterion("BKD <=", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdLike(String value) {
            addCriterion("BKD like", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdNotLike(String value) {
            addCriterion("BKD not like", value, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdIn(List<String> values) {
            addCriterion("BKD in", values, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdNotIn(List<String> values) {
            addCriterion("BKD not in", values, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdBetween(String value1, String value2) {
            addCriterion("BKD between", value1, value2, "bkd");
            return (Criteria) this;
        }

        public Criteria andBkdNotBetween(String value1, String value2) {
            addCriterion("BKD not between", value1, value2, "bkd");
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