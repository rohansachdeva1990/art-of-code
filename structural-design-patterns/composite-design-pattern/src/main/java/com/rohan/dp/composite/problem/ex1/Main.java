package com.rohan.dp.composite.problem.ex1;

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

        // This will recursively render the added entities.
        group.render();
    }
}
