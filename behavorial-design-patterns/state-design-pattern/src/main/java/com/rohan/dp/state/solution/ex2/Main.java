package com.rohan.dp.state.solution.ex2;

public class Main {
    public static void main(String[] args) {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
