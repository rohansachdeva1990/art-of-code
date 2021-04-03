package com.rohan.dp.proxy.solution.ex1;


public class Main {
    public static void main(String[] args) {
        var library = new Library();
        // Real app this will come from database
        String[] fileNames = {"a", "b", "c"};

        // Creating real ebook object is costly, thats why we create proxy object
        for (var fileName : fileNames) {
            // Our implementation is following OCP, if tomorrow we can supply different proxy implementation
            //library.add(new EbookProxy(fileName));
            // Similar to logging we can have a authorization proxy, if authorized we show the ebook to the user.
            // We don't need to load the file.
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}
