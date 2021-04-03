package com.rohan.dp.mediator.solution.ex1.observer;

public class ArticleDialogBox {

    private final ListBox articleListBox = new ListBox();
    private final TextBox titleTextBox = new TextBox();
    private final Button saveButton = new Button();

    public ArticleDialogBox() {
        articleListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    // Test Method for showcase
    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBox.getContent()); // "Article 1"
        System.out.println("Button: " + saveButton.isEnabled()); // true

        titleTextBox.setContent("");
        System.out.println("TextBox: " + titleTextBox.getContent()); // ""
        System.out.println("Button: " + saveButton.isEnabled()); // false
    }
}
