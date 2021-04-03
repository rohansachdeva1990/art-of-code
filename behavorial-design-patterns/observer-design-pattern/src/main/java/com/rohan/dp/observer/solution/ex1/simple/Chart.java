package com.rohan.dp.observer.solution.ex1.simple;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
