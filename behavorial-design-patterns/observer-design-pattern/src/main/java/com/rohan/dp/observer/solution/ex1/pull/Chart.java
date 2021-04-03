package com.rohan.dp.observer.solution.ex1.pull;

public class Chart implements Observer {

    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSource.getValue());
    }
}
