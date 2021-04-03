package com.rohan.dp.memento.solution.ex2;

public class Main {

    public static void main(String[] args) {
        var document = new Document();
        var history = new History();

        document.setContent("Hello");
        history.push(document.createMemento());

        document.setFontName("Font 1");
        history.push(document.createMemento());

        document.setFontSize(10);

        System.out.println(document);

        document.undo(history.pop());
        System.out.println(document);

        document.undo(history.pop());
        System.out.println(document);
    }
}
