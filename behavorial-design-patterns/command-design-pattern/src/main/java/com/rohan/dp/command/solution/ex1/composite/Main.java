package com.rohan.dp.command.solution.ex1.composite;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();

    }
}
