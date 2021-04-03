package com.rohan.dp.visitor.solution.ex2;

public class NoiseReductionFilter implements AudioFilter {
    @Override
    public void applyFilter(FactSegment fact) {
        System.out.println("Noise reduction on fact segment");
    }

    @Override
    public void applyFilter(FormatSegment format) {
        System.out.println("Noise reduction on format segment");
    }
}
