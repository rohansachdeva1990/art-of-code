package com.rohan.dp.cor.solution.ex1;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }
}
