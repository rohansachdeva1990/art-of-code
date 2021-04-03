package com.rohan.dp.facade.solution.ex1;

// Facade
public class NotificationService {

    // This will be the only place to update if any of the dependent class changes.
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
