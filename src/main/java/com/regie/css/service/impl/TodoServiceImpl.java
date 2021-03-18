package com.regie.css.service.impl;

import com.regie.css.repository.TodoRepo;
import com.regie.css.repository.impl.RepoRegistry;
import com.regie.css.model.Todo;
import com.regie.css.service.TodoService;

import java.util.List;

public class TodoServiceImpl implements TodoService {
    TodoRepo todoRepo = (TodoRepo) RepoRegistry.getRepo("Todo");
}
