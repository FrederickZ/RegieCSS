package com.regie.css.util.qo;

public class Criteria {
    private String field;
    private OperatorEnum operator;
    private Object value;

    public Criteria(String field, OperatorEnum operator, Object value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public OperatorEnum getOperator() {
        return operator;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
