package com.rohan.dp.cor.solution.ex2;

public class Main {
    public static void main(String[] args) {
        var reader = DataReaderFactory.createDataReader();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
