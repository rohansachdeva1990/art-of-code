package com.rohan.dp.visitor.solution.ex2;

public class FormatSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.applyFilter(this);
    }
}
