package com.rohan.dp.visitor.solution.ex1;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());

        // OCP in action O_o
        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());

    }
}
