package com.rohan.dp.command.solution.ex1.undo.editor;

// Business Layer
public class HtmlDocument {

    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
