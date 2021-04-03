package com.rohan.dp.proxy.problem.ex1;

/*
Problem with this approach, if we have 1000 ebooks in db.
then for just opening one file, all the files would be loaded eagerly.
 */
public class Main {
    public static void main(String[] args) {
        var library = new Library();
        // Real app this will come from database
        String[] fileNames = {"a", "b", "c"};

        for (var fileName : fileNames) {
            library.add(new Ebook(fileName));
        }

        library.openEbook("a");
    }
}

/**
 * Output:
 * <p>
 * Loading the ebook a
 * Loading the ebook b
 * Loading the ebook c
 * Showing the ebook a
 */