package com.rohan.dp.visitor.solution.ex2;

public class ReverbFilter implements AudioFilter {
    @Override
    public void applyFilter(FactSegment fact) {
        System.out.println("Reverb on fact segment");
    }

    @Override
    public void applyFilter(FormatSegment format) {
        System.out.println("Reverb on format segment");
    }
}
