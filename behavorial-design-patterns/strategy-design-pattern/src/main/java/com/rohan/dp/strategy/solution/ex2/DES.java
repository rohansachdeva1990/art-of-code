package com.rohan.dp.strategy.solution.ex2;

public class DES implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println(message + " encrypted with DES");
        return "EncryptedWithDES" + message;
    }
}
