package com.rohan.dp.iterator.problem;

/**
 * Here we changed internal data structure, this will break the code else where
 */
public class BrowserHistoryUsingArray {
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public String[] getUrls() {
        return urls;
    }
}
