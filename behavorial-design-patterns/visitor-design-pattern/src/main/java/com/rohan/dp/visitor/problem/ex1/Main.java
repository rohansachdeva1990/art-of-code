package com.rohan.dp.visitor.problem.ex1;

public class Main {
    public static void main(String[] args) {

        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.highlight();

    }
}
