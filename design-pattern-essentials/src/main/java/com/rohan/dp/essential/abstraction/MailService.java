package com.rohan.dp.essential.abstraction;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        // Send email
        disconnect();
    }

    // These are implementation details. If the implementation details
    // changes the main class will be unaware of it.
    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }
}
