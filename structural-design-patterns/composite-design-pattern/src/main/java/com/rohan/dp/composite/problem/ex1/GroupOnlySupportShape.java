package com.rohan.dp.composite.problem.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * Here we cannot add a group within a group
 */
public class GroupOnlySupportShape {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void render() {
        for (var shape : shapes) {
            shape.render();
        }
    }
}
