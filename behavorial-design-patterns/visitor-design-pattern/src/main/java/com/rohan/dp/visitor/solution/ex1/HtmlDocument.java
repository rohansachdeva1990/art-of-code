package com.rohan.dp.visitor.solution.ex1;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    /**
     * This showcases an extensibility point.
     * - We can pass new type of operation to it, without modifying it.
     * - Also satisfies OCP
     */
    public void execute(Operation operation) {
        for (var node : nodes) {
            node.execute(operation);
        }
    }
}
