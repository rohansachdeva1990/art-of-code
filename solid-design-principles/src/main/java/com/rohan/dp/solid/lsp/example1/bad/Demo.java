package com.rohan.dp.solid.lsp.example1.bad;

public class Demo {

    // This function would have no idea about the special handling of the of logic inside the square.
    // It only knows about the rectangle
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);

        // area = width * 10
        System.out.println(
                "Expected area of " + (width * 10) +
                        ", got " + r.getArea()
        );
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        // How many possible rectangle we pass we would expect the same result.
        useIt(rc);

        Rectangle sq = new Square();
        sq.setWidth(5);
        useIt(sq);
    }

}
