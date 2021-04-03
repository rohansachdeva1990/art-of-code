package com.rohan.dp.strategy.solution.ex2;

public class ChatClient {

    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        var encryptedMessage = encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message..." + encryptedMessage);
    }
}
