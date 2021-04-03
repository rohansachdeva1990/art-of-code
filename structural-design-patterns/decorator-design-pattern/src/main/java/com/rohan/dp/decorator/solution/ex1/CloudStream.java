package com.rohan.dp.decorator.solution.ex1;

public class CloudStream implements Stream {

    public void write(String data) {
        System.out.println("Storing " + data);
    }
}
