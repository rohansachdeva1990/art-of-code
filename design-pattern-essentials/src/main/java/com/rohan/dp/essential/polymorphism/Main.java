package com.rohan.dp.essential.polymorphism;

public class Main {
    public static void main(String[] args) {
        drawUIControl(new CheckBox());
        drawUIControl(new TextBox());
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
