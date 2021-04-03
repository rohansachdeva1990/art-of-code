package com.rohan.dp.bridge.problem.ex1;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }
}
