package com.regie.css.controller.impl;

import com.regie.css.common.ResponseTypesEnum;
import com.regie.css.controller.TodoController;
import com.regie.css.model.Todo;
import com.regie.css.repository.TodoRepo;
import com.regie.css.repository.impl.RepoRegistry;
import com.regie.css.service.TodoService;
import com.regie.css.service.impl.ServiceRegistry;
import com.regie.css.util.Request;
import com.regie.css.util.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TodoControllerImpl implements TodoController {
    private final TodoService todoService = (TodoService) ServiceRegistry.getService("Todo");
    private final TodoRepo todoRepo = (TodoRepo) RepoRegistry.getRepo("Todo");

    @Override
    public Response getTodoList(Request request) {
        String id = (String) request.get("id");

        Response response = ResponseTypesEnum.SUCCESS.getResponse();

        List<Todo> todoList = todoRepo.getTodoListByUser(id);
        JSONArray todoListJSON = new JSONArray();
        for (Todo todo : todoList) {
            JSONObject todoJSON = new JSONObject();
            todoJSON.put("content", todo.getContent());
            todoListJSON.put(todoJSON);
        }

        response.put("todoList", todoListJSON);
        return response;
    }
}
