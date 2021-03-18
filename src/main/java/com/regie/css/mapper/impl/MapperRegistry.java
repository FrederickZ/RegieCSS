package com.regie.css.mapper.impl;

import com.regie.css.mapper.Mapper;

import java.util.HashMap;

public class MapperRegistry {
    static HashMap<String, Mapper> mappers = new HashMap<String, Mapper>();

    public static Mapper getMapper(String strClass) {
        if (!mappers.containsKey(strClass)) {
            registerMapper(strClass);
        }
        return mappers.get(strClass);
    }

    private static void registerMapper(String strClass) {
        try {
            Class<?> mapperClass = Class.forName("com.regie.css.mapper.impl." + strClass + "MapperImpl");
            mappers.put(strClass, (Mapper) mapperClass.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
