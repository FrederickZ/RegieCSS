package com.regie.css.util.qo;

import java.util.ArrayList;
import java.util.List;

public class QueryObject {
    private String strClass;
    private List<Criteria> criteriaList = new ArrayList<Criteria>();

    public QueryObject(String strClass) {
        this.strClass = strClass;
    }

    public void addCriteria(Criteria criteria) {
        criteriaList.add(criteria);
    }

    public String getStrClass() {
        return strClass;
    }

    public List<Criteria> getCriteriaList() {
        return criteriaList;
    }
}
