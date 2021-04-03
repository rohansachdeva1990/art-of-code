package com.rohan.dp.visitor.solution.ex2;

// Visitor
public interface AudioFilter {
    void applyFilter(FactSegment fact);

    void applyFilter(FormatSegment format);
}
