package com.rohan.dp.state.solution.ex1;

public class Canvas {

    private Tool currentTool;

    // Canvas class is delegating to abstract
    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
