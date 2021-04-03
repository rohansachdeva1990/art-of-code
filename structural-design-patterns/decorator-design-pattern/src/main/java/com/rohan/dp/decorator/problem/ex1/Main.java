package com.rohan.dp.decorator.problem.ex1;

public class Main {
    public static void main(String[] args) {
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("some data");
    }
}
