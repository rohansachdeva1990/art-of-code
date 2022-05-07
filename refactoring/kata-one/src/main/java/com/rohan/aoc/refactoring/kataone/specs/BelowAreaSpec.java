package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.RealEstate;
import com.rohan.aoc.refactoring.kataone.Spec;

public class BelowAreaSpec implements Spec {
    private float maxBuildingArea;

    public BelowAreaSpec(float maxBuildingArea) {
        this.maxBuildingArea = maxBuildingArea;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() < maxBuildingArea;
    }
}
