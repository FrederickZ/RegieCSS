package com.regie.css.view.ui;

import com.regie.css.controller.Controller;
import com.regie.css.controller.impl.ControllerRegistry;
import com.regie.css.model.Todo;
import com.regie.css.util.Args;
import com.regie.css.view.component.Component;
import com.regie.css.view.component.TodoListComponent;

import java.util.List;

/* css.regie.com/admin */

public class AdminUIPage extends UIPage {
    public final String PATH = String.format("/admin?id=%s", args.get("id"));

    public AdminUIPage(Args args) {
        super(args);
    }

    @Override
    public void run() {
        System.out.println("Welcome, admin!");
        TodoListComponent todoListComponent = new TodoListComponent(this);
        todoListComponent.show();
    }
}
