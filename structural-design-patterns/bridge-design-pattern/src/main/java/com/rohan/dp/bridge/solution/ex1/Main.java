package com.rohan.dp.bridge.solution.ex1;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();

        var advancedRemoteControl = new AdvancedRemoteControl(new SamsungTV());
        advancedRemoteControl.setChannel(10);
    }
}
