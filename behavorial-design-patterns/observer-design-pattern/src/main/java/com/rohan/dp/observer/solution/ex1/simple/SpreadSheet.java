package com.rohan.dp.observer.solution.ex1.simple;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified");
    }
}
