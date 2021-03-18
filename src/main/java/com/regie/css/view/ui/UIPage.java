package com.regie.css.view.ui;

import com.regie.css.common.SystemExitMessagesEnum;
import com.regie.css.controller.Controller;
import com.regie.css.controller.TodoController;
import com.regie.css.controller.impl.ControllerRegistry;
import com.regie.css.model.Todo;
import com.regie.css.util.Args;
import com.regie.css.util.Request;
import com.regie.css.util.Response;
import com.regie.css.view.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class UIPage extends Page {
    public UIPage(Args args) {
        super(args);
    }
}
