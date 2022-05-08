package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstatePlacement;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

class PlacementSpec implements Spec {
    private EstatePlacement placement;

    PlacementSpec(EstatePlacement placement) {
        this.placement = placement;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getPlacement().equals(placement);
    }
}