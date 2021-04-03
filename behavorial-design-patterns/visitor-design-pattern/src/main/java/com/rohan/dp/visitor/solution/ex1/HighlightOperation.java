package com.rohan.dp.visitor.solution.ex1;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");

    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight-anchor");
    }
}
