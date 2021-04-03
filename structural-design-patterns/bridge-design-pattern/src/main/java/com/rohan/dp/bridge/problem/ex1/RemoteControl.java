package com.rohan.dp.bridge.problem.ex1;

// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)


// Remote Control
//  SonyRemoteControl
//  SamsungRemoteControl (New)
//  AdvancedRemoteControl
//      SonyAdvancedRemoteControl
//      SamsungAdvancedRemoteControl (New)
//
// So, everytime we support new type of remote controls and tv brands the heirarchy will become complex.
// 2 types of remote control -> 2 new classes

public abstract class RemoteControl {

    public abstract void turnOn();

    public abstract void turnOff();
}
