package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.RealEstate;

public class AreaRangeSpec implements Spec {
    private final float minArea;
    private final float maxArea;

    public AreaRangeSpec(float minArea, float maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() >= minArea && estate.getBuildingArea() <= maxArea;
    }
}