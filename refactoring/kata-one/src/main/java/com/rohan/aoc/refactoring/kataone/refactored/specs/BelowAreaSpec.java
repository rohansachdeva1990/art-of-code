package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

public class BelowAreaSpec implements Spec {
    private float maxBuildingArea;

    private BelowAreaSpec(float maxBuildingArea) {
        this.maxBuildingArea = maxBuildingArea;
    }

    public static BelowAreaSpec belowArea(float maxBuildingArea) {
        return new BelowAreaSpec(maxBuildingArea);
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() < maxBuildingArea;
    }
}
