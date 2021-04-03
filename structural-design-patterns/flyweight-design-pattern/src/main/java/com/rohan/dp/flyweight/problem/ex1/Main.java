package com.rohan.dp.flyweight.problem.ex1;

public class Main {
    public static void main(String[] args) {
        var service = new PointService();
        for (var point : service.getPoints()) {
            point.draw();
        }
    }
}
