package com.rohan.dp.memento.solution.ex2;

public class Document {

    private String content;
    private String fontName;
    private int fontSize;

    public DocumentMemento createMemento() {
        return new DocumentMemento(content, fontName, fontSize);
    }

    public void undo(DocumentMemento documentMemento) {
        this.content = documentMemento.getContent();
        this.fontName = documentMemento.getFontName();
        this.fontSize = documentMemento.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
