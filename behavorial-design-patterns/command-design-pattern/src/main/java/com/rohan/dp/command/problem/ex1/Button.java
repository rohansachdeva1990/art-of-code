package com.rohan.dp.command.problem.ex1;

public class Button {
    private String label;

    public void click() {
        // .. dependent on where we use this button (like add or delete)
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
