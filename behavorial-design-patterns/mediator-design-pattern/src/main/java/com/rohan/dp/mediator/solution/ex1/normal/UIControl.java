package com.rohan.dp.mediator.solution.ex1.normal;

public abstract class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
