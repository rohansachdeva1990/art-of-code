package com.rohan.dp.solid.lsp.example1.good;


import com.rohan.dp.solid.lsp.example1.good.shapes.Shape;
import com.rohan.dp.solid.lsp.example1.good.shapes.ShapeFactory;

public class Demo {

    static void useIt(Shape r) {
        System.out.println("Area: " + r.getArea());
    }

    public static void main(String[] args) {
        Shape rc = ShapeFactory.newRectangle(2, 3);
        useIt(rc);

        Shape sq = ShapeFactory.newSquare(5);
        useIt(sq);
    }
}
