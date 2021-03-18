package com.regie.css.view.component;

import com.regie.css.controller.TodoController;
import com.regie.css.controller.impl.ControllerRegistry;
import com.regie.css.util.Request;
import com.regie.css.util.Response;
import com.regie.css.view.Page;
import org.json.JSONArray;
import org.json.JSONObject;

public class TodoListComponent extends Component {
    public TodoListComponent(Page page) {
        super(page);
    }

    @Override
    public void show() {
        System.out.println("---- To-Do List ----");
        JSONArray todoListJSON = getTodoListJSON(page.args.get("id"));
        for (int i = 0; i < todoListJSON.length(); i++) {
            JSONObject todoJSON = (JSONObject) todoListJSON.get(i);
            System.out.println((i+1) + todoJSON.getString("content"));
        }
    }

    private JSONArray getTodoListJSON(String id) {
        TodoController todoController = (TodoController) ControllerRegistry.getController("Todo");
        Request request = new Request();
        request.put("id", id);
        Response response = todoController.getTodoList(request);
        if (response.get("status").equals("exit")) {
            System.out.println(response.get("message"));
            System.exit(0);
        }
        return (JSONArray) response.get("todoList");
    }
}
