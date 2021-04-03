package com.rohan.dp.facade.problem.ex1;

public class Main {
    /**
     *
     * Problem:-
     * 1. Everytime we need to send a message, we have to follow all these steps
     */
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        var message  = new Message("Hello world");
        server.send(authToken, message, "targetIp");
        connection.disconnect();
    }
}
