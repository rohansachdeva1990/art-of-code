package com.rohan.dp.mediator.solution.ex2;

// Concrete Subject
public class CheckBox extends UIControl {

    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
