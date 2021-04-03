package com.rohan.dp.strategy.solution.ex1;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println("Applying high contrast filter");
    }
}
