package com.rohan.dp.strategy.solution.ex2;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new AES());
        chatClient.send("a");
    }
}
