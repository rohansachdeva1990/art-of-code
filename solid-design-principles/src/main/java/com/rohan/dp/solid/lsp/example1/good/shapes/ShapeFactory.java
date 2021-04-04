package com.rohan.dp.solid.lsp.example1.good.shapes;

/**
 * So, hide the construction logic of this entities by a factory
 *
 * prevent direct modification of width and height individually. That way, you
 * don't end up triggering nasty side effects that violate LSP
 */
public class ShapeFactory {
    public static Shape newRectangle(int width, int height) {
        return new Shape(width, height);
    }

    public static Shape newSquare(int side) {
        return new Shape(side, side);
    }
}
