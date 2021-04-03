package com.rohan.dp.visitor.problem.ex1;

public class AnchorNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("Highlight Anchor");
    }
}
