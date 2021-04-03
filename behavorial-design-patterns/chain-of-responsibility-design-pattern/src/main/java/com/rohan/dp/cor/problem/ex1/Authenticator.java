package com.rohan.dp.cor.problem.ex1;

// Purely responsible for authentication of requests
public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        var isValid = ("admin".equals(request.getUsername()) && "1234".equals(request.getPassword()));
        System.out.println("Authentication");
        return isValid;
    }
}
