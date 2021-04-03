package com.rohan.dp.strategy.solution.ex1;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String filename) {
        System.out.println("Applying B&W filter");
    }
}
