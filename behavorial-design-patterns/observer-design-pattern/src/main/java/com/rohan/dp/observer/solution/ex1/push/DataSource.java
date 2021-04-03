package com.rohan.dp.observer.solution.ex1.push;

public class DataSource extends Subject {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
