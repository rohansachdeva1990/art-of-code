package com.rohan.dp.strategy.solution.ex2;

public class AES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println(message + " encrypted with AES");
        return "encryptedwithAES" + message;
    }
}
