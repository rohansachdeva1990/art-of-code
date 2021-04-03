package com.rohan.dp.command.solution.ex1.composite;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
