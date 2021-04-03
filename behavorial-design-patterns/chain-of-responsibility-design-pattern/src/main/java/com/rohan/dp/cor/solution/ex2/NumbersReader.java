package com.rohan.dp.cor.solution.ex2;

public class NumbersReader extends DataReader {

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

    @Override
    public String getExtension() {
        return ".numbers";
    }
}
