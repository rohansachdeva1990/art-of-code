package com.rohan.dp.observer.solution.ex1.push;

/**
 * Our spreadsheet is not aware about the datasource class.
 */
public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified: " + value);
    }
}
