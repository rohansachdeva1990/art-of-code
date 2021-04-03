package com.rohan.dp.cor.solution.ex2;

public class ExcelReader extends DataReader {
    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

    @Override
    public String getExtension() {
        return ".xls";
    }
}
