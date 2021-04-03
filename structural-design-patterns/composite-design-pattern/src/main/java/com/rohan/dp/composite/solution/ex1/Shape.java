package com.rohan.dp.composite.solution.ex1;

public class Shape implements Component {

    @Override
    public void render() {
        System.out.println("Render Shape");
    }

    @Override
    public void move() {
        System.out.println("Move Shape");
    }
}
