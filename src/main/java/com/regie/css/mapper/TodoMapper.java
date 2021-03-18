package com.regie.css.mapper;

import com.regie.css.model.Todo;
import com.regie.css.util.qo.QueryObject;

import java.util.List;

public interface TodoMapper extends Mapper {
    void insert(Todo todo);
    List<Todo> retrieve(QueryObject query);
    void delete(Todo todo);
}
