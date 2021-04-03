package com.rohan.dp.bridge.problem.ex1;

public class SonyRemoteControl extends RemoteControl {

    // Use sony library here

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOF");
    }
}
