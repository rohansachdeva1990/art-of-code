package com.rohan.dp.mediator.solution.ex1.normal;

public class ArticleDialogBox extends DialogBox {

    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    @Override
    public void changed(UIControl control) {
        if (control == articleListBox) {
            articleSelected();
        } else if (control == titleTextBox) {
            titleChanged();
        }
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
