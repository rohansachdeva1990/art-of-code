package com.rohan.dp.visitor.problem.ex1;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("Highlight Heading");
    }
}
