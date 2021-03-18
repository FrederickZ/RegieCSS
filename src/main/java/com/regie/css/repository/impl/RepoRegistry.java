package com.regie.css.repository.impl;

import com.regie.css.repository.Repo;

import java.util.HashMap;

public class RepoRegistry {
    static HashMap<String, Repo> repos = new HashMap<String, Repo>();

    public static Repo getRepo(String strClass) {
        if (!repos.containsKey(strClass)) {
            registerRepo(strClass);
        }
        return repos.get(strClass);
    }

    private static void registerRepo(String strClass) {
        try {
            Class<?> repoClass = Class.forName("com.regie.css.repository.impl." + strClass + "RepoImpl");
            repos.put(strClass, (Repo) repoClass.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
