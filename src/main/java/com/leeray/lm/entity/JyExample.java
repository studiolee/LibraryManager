package com.leeray.lm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JyExample() {
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

        public Criteria andRnoIsNull() {
            addCriterion("RNO is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("RNO is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(String value) {
            addCriterion("RNO =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(String value) {
            addCriterion("RNO <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(String value) {
            addCriterion("RNO >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(String value) {
            addCriterion("RNO >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(String value) {
            addCriterion("RNO <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(String value) {
            addCriterion("RNO <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLike(String value) {
            addCriterion("RNO like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotLike(String value) {
            addCriterion("RNO not like", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<String> values) {
            addCriterion("RNO in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<String> values) {
            addCriterion("RNO not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(String value1, String value2) {
            addCriterion("RNO between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(String value1, String value2) {
            addCriterion("RNO not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andBnoIsNull() {
            addCriterion("BNO is null");
            return (Criteria) this;
        }

        public Criteria andBnoIsNotNull() {
            addCriterion("BNO is not null");
            return (Criteria) this;
        }

        public Criteria andBnoEqualTo(String value) {
            addCriterion("BNO =", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotEqualTo(String value) {
            addCriterion("BNO <>", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThan(String value) {
            addCriterion("BNO >", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoGreaterThanOrEqualTo(String value) {
            addCriterion("BNO >=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThan(String value) {
            addCriterion("BNO <", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLessThanOrEqualTo(String value) {
            addCriterion("BNO <=", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoLike(String value) {
            addCriterion("BNO like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotLike(String value) {
            addCriterion("BNO not like", value, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoIn(List<String> values) {
            addCriterion("BNO in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotIn(List<String> values) {
            addCriterion("BNO not in", values, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoBetween(String value1, String value2) {
            addCriterion("BNO between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andBnoNotBetween(String value1, String value2) {
            addCriterion("BNO not between", value1, value2, "bno");
            return (Criteria) this;
        }

        public Criteria andJdateIsNull() {
            addCriterion("JDATE is null");
            return (Criteria) this;
        }

        public Criteria andJdateIsNotNull() {
            addCriterion("JDATE is not null");
            return (Criteria) this;
        }

        public Criteria andJdateEqualTo(Date value) {
            addCriterion("JDATE =", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateNotEqualTo(Date value) {
            addCriterion("JDATE <>", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateGreaterThan(Date value) {
            addCriterion("JDATE >", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateGreaterThanOrEqualTo(Date value) {
            addCriterion("JDATE >=", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateLessThan(Date value) {
            addCriterion("JDATE <", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateLessThanOrEqualTo(Date value) {
            addCriterion("JDATE <=", value, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateIn(List<Date> values) {
            addCriterion("JDATE in", values, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateNotIn(List<Date> values) {
            addCriterion("JDATE not in", values, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateBetween(Date value1, Date value2) {
            addCriterion("JDATE between", value1, value2, "jdate");
            return (Criteria) this;
        }

        public Criteria andJdateNotBetween(Date value1, Date value2) {
            addCriterion("JDATE not between", value1, value2, "jdate");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("RDATE is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("RDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterion("RDATE =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterion("RDATE <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterion("RDATE >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RDATE >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterion("RDATE <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterion("RDATE <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterion("RDATE in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterion("RDATE not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterion("RDATE between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterion("RDATE not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andGhdateIsNull() {
            addCriterion("GHDATE is null");
            return (Criteria) this;
        }

        public Criteria andGhdateIsNotNull() {
            addCriterion("GHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGhdateEqualTo(Date value) {
            addCriterion("GHDATE =", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateNotEqualTo(Date value) {
            addCriterion("GHDATE <>", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateGreaterThan(Date value) {
            addCriterion("GHDATE >", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateGreaterThanOrEqualTo(Date value) {
            addCriterion("GHDATE >=", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateLessThan(Date value) {
            addCriterion("GHDATE <", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateLessThanOrEqualTo(Date value) {
            addCriterion("GHDATE <=", value, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateIn(List<Date> values) {
            addCriterion("GHDATE in", values, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateNotIn(List<Date> values) {
            addCriterion("GHDATE not in", values, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateBetween(Date value1, Date value2) {
            addCriterion("GHDATE between", value1, value2, "ghdate");
            return (Criteria) this;
        }

        public Criteria andGhdateNotBetween(Date value1, Date value2) {
            addCriterion("GHDATE not between", value1, value2, "ghdate");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("FINE is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("FINE is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(Float value) {
            addCriterion("FINE =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(Float value) {
            addCriterion("FINE <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(Float value) {
            addCriterion("FINE >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(Float value) {
            addCriterion("FINE >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(Float value) {
            addCriterion("FINE <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(Float value) {
            addCriterion("FINE <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<Float> values) {
            addCriterion("FINE in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<Float> values) {
            addCriterion("FINE not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(Float value1, Float value2) {
            addCriterion("FINE between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(Float value1, Float value2) {
            addCriterion("FINE not between", value1, value2, "fine");
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