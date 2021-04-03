package com.rohan.dp.cor.solution.ex1;

/**
 * Each class has a single responsibility and is isolated from each other
 */
public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Logger");
        return false;
    }
}
