package com.regie.css.controller;

import com.regie.css.util.Request;
import com.regie.css.util.Response;

public interface TodoController extends Controller {
    Response getTodoList(Request request);
}
