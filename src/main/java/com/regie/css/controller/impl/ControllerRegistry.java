package com.regie.css.controller.impl;

import com.regie.css.controller.Controller;

import java.util.HashMap;

public class ControllerRegistry {
    static HashMap<String, Controller> controllers = new HashMap<String, Controller>();

    public static Controller getController(String strClass) {
        if (!controllers.containsKey(strClass)) {
            registerController(strClass);
        }
        return controllers.get(strClass);
    }

    private static void registerController(String strClass) {
        try {
            Class<?> controllerClass = Class.forName("com.regie.css.controller.impl." + strClass + "ControllerImpl");
            controllers.put(strClass, (Controller) controllerClass.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
