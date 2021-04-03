package com.rohan.dp.memento.solution.ex2;

import java.util.Stack;

public class History {

    private final Stack<DocumentMemento> states = new Stack<>();

    public void push(DocumentMemento state) {
        states.push(state);
    }

    public DocumentMemento pop() {
        return states.pop();
    }
}
