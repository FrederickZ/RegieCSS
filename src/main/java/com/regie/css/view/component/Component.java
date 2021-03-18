package com.regie.css.view.component;

import com.regie.css.view.Page;

public abstract class Component {
    Page page;

    public Component(Page page) {
        this.page = page;
    }

    public abstract void show();
}
