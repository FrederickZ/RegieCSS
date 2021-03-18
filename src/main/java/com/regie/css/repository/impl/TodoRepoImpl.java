package com.regie.css.repository.impl;

import com.regie.css.mapper.TodoMapper;
import com.regie.css.mapper.impl.MapperRegistry;
import com.regie.css.model.Todo;
import com.regie.css.repository.TodoRepo;
import com.regie.css.util.qo.Criteria;
import com.regie.css.util.qo.OperatorEnum;
import com.regie.css.util.qo.QueryObject;

import java.util.List;

public class TodoRepoImpl implements TodoRepo {
    TodoMapper todoMapper = (TodoMapper) MapperRegistry.getMapper("Todo");

    @Override
    public List<Todo> getTodoListByUser(String id) {
        QueryObject query = new QueryObject("Todo");
        query.addCriteria(new Criteria("user", OperatorEnum.EQUAL, id));
        return todoMapper.retrieve(query);
    }
}
