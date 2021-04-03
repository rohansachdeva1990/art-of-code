package com.rohan.dp.proxy.solution.ex1;

public class LoggingEbookProxy implements Ebook {

    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        // Lazy initialization
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }
        System.out.println("Logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
