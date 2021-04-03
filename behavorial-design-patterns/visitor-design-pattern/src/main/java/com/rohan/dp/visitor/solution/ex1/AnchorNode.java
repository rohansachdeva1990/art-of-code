package com.rohan.dp.visitor.solution.ex1;

/**
 * In future, if we add new operation supported to this node. This node would be completely unaware.
 * Hence, it satisfies OCP.
 */
public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
