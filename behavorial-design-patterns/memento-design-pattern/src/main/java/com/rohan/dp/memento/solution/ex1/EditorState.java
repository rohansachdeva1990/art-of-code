package com.rohan.dp.memento.solution.ex1;

/**
 * Momento
 */
public class EditorState {

    // So once we initialize it, we cannot accidentally change our state in the code
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
