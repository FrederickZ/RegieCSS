package com.regie.css.repository;

import com.regie.css.model.Todo;

import java.util.List;

public interface TodoRepo extends Repo {
    List<Todo> getTodoListByUser(String id);
}
