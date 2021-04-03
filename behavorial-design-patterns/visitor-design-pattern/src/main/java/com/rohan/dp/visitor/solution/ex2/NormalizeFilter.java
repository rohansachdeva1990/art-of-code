package com.rohan.dp.visitor.solution.ex2;

public class NormalizeFilter implements AudioFilter {
    @Override
    public void applyFilter(FactSegment fact) {
        System.out.println("Normalizing fact segment");
    }

    @Override
    public void applyFilter(FormatSegment format) {
        System.out.println("Normalizing format segment");

    }
}
