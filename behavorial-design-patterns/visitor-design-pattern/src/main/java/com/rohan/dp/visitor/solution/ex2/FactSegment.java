package com.rohan.dp.visitor.solution.ex2;

public class FactSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.applyFilter(this);
    }
}
