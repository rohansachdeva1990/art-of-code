package com.rohan.dp.observer.solution.ex1.push;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart got updated: " + value);
    }
}
