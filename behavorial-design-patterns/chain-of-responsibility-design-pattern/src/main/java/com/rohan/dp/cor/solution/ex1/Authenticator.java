package com.rohan.dp.cor.solution.ex1;

// Purely responsible for authentication of requests
public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        var isValid = ("admin".equals(request.getUsername()) && "1234".equals(request.getPassword()));
        System.out.println("Authentication");
        return !isValid;
    }
}
