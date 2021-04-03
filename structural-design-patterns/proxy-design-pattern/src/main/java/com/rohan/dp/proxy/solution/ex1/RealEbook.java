package com.rohan.dp.proxy.solution.ex1;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        // costly
        System.out.println("Loading the ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}

