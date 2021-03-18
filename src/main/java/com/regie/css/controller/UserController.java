package com.regie.css.controller;

import com.regie.css.util.Request;
import com.regie.css.util.Response;

public interface UserController extends Controller {
    Response login(Request request);
}
