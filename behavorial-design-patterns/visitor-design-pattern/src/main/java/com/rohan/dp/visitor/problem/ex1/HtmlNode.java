package com.rohan.dp.visitor.problem.ex1;

// Can be abstract if we want to share common behavior
public interface HtmlNode {
    void highlight();

    // Suppose in future we need to extract the text from the HTML document
    // String plainText();
}
