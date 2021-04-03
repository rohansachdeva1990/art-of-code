package com.rohan.dp.factory.ex2;

import com.rohan.dp.factory.ex2.page.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return Collections.unmodifiableList(pages);
    }

    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();
}
