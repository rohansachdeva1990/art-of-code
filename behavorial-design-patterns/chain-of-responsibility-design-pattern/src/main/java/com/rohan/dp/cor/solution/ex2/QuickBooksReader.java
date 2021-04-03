package com.rohan.dp.cor.solution.ex2;

public class QuickBooksReader extends DataReader{
    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }

    @Override
    public String getExtension() {
        return ".qbw";
    }
}
