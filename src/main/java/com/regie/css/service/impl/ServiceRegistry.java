package com.regie.css.service.impl;

import com.regie.css.service.Service;

import java.util.HashMap;

public class ServiceRegistry {
    static HashMap<String, Service> services = new HashMap<String, Service>();

    public static Service getService(String strClass) {
        if (!services.containsKey(strClass)) {
            registerService(strClass);
        }
        return services.get(strClass);
    }

    private static void registerService(String strClass) {
        try {
            Class<?> serviceClass = Class.forName("com.regie.css.service.impl." + strClass + "ServiceImpl");
            services.put(strClass, (Service) serviceClass.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
