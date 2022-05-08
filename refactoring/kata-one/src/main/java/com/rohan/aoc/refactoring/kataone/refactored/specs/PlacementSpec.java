package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstatePlacement;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

public class PlacementSpec implements Spec {
    private EstatePlacement placement;

    public PlacementSpec(EstatePlacement placement) {
        this.placement = placement;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getPlacement().equals(placement);
    }
}