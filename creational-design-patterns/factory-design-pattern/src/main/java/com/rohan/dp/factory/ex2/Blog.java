package com.rohan.dp.factory.ex2;

import com.rohan.dp.factory.ex2.page.AboutPage;
import com.rohan.dp.factory.ex2.page.CommentPage;
import com.rohan.dp.factory.ex2.page.ContactPage;
import com.rohan.dp.factory.ex2.page.PostPage;

public class Blog extends Website{
    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
