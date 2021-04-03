package com.rohan.dp.cor.solution.ex1;


import static java.util.Objects.requireNonNull;

public class Webserver {

    private Handler handler;

    public Webserver(Handler handler) {
        // Web server should have at least one handler
        this.handler = requireNonNull(handler);
    }

    public void handle(HttpRequest request) {
        System.out.println("Handling new http request....");
        handler.handle(request);
    }
}
