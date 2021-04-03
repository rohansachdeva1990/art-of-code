package com.rohan.dp.adapter.solution.ex1;

import com.rohan.dp.adapter.solution.ex1.thirdparty.Caramel;

public class Main {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
