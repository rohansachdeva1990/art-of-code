package com.rohan.dp.proxy.problem.ex1;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        // check for file exists
        ebooks.get(fileName).show();
    }

}
