package com.rohan.dp.mediator.solution.ex1.observer;

public class ListBox extends UIControl {

    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
