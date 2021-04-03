package com.rohan.dp.cor.solution.ex2;

public class DataReaderFactory {

    public static DataReader createDataReader() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        numbersReader.setNext(quickBooksReader);
        excelReader.setNext(numbersReader);
        return excelReader;
    }
}
