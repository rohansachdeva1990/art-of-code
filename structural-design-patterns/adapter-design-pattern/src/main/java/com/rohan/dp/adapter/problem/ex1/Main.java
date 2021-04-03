package com.rohan.dp.adapter.problem.ex1;

public class Main {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());


        // Below throws compilation error because imageView does not support
        // third party filters (Does not implements Filter))
        // imageView.apply(new Caramel());

    }
}
