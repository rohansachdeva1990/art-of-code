package com.rohan.dp.factory.ex2;

import com.rohan.dp.factory.ex2.page.CartPage;
import com.rohan.dp.factory.ex2.page.ItemPage;
import com.rohan.dp.factory.ex2.page.SearchPage;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
