package com.regie.css.util.qo;

public enum OperatorEnum {
    EQUAL("=", "$eq"),
    GREATER(">", "$gt"),
    GREATER_EQUAL(">=", "$gte");

    String mySQLOperator;
    String mongoDBOperator;

    OperatorEnum(String mySQLOperator, String mongoDBOperator) {
        this.mySQLOperator = mySQLOperator;
        this.mongoDBOperator = mongoDBOperator;
    }

    public String getMySQLOperator() {
        return mySQLOperator;
    }

    public String getMongoDBOperator() {
        return mongoDBOperator;
    }
}
