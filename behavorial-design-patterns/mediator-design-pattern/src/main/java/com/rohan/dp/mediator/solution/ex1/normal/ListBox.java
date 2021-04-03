package com.rohan.dp.mediator.solution.ex1.normal;

public class ListBox extends UIControl {

    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }
    // list of items


    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }
}
