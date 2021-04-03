package com.rohan.dp.visitor.solution.ex2;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private final List<Segment> segments = new ArrayList<>();

    private WavFile() {
    }

    public static WavFile read(String filename) {
        var wavFile = new WavFile();
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        return wavFile;
    }

    public void add(Segment segment) {
        segments.add(segment);
    }

    public void applyFilter(AudioFilter filter) {
        for (var segment : segments) {
            segment.applyFilter(filter);
        }
    }
}
