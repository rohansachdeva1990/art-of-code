package com.rohan.dp.state.solution.ex1;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        /*
         * This also shows Open/Close principle. It is open for extension but closed from modification
         * */

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
