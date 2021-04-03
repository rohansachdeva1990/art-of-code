package com.rohan.dp.composite.solution.ex1;

public class Main {

    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape()); // squared
        group1.add(new Shape()); // squared

        var group2 = new Group();
        group2.add(new Shape()); // circle
        group2.add(new Shape()); // circle

        var group = new Group();
        group.add(group1);
        group.add(group2);

        // Now we are working on component level
        group.render();
        group.move();
    }
}
