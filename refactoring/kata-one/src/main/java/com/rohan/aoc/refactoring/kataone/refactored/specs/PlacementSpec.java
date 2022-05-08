package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstatePlacement;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

public class PlacementSpec implements Spec {
    private EstatePlacement placement;

    private PlacementSpec(EstatePlacement placement) {
        this.placement = placement;
    }

    /**
     * Here we are following static factory method design pattern
     */
    public static PlacementSpec placedIn(EstatePlacement placement) {
        return new PlacementSpec(placement);
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getPlacement().equals(placement);
    }
}