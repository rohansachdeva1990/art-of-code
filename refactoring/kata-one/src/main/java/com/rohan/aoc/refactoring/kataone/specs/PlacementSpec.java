package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.EstatePlacement;
import com.rohan.aoc.refactoring.kataone.RealEstate;

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