package com.rohan.dp.template.problem.ex2;

/**
 * This class represents a window in a GUI framework. Application
 * developers can use this framework to build desktop applications.
 * <p>
 * The Window class has a method for closing a window. Certain
 * windows may need to execute some code before or after a window
 * is closed.
 * <p>
 * We cannot hardcode this behaviour in the Window class because
 * the code that needs to be executed is different from one window to
 * another.
 * <p>
 * Use the template method pattern to solve this problem.
 */
public class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }
}
