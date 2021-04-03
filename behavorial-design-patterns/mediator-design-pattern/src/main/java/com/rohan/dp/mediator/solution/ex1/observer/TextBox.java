package com.rohan.dp.mediator.solution.ex1.observer;

public class TextBox extends UIControl {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
