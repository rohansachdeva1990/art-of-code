package com.rohan.aoc.refactoring.kataone.refactored.specs;


import com.rohan.aoc.refactoring.kataone.refactored.EstateMaterial;
import com.rohan.aoc.refactoring.kataone.refactored.EstatePlacement;
import com.rohan.aoc.refactoring.kataone.refactored.EstateType;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

public class Specs {
    private Specs() {
    }

    public static AreaRangeSpec ofAreaRange(float minArea, float maxArea) {
        return new AreaRangeSpec(minArea, maxArea);
    }

    public static BelowAreaSpec belowArea(float maxBuildingArea) {
        return new BelowAreaSpec(maxBuildingArea);
    }

    public static MaterialSpec ofMaterial(EstateMaterial material) {
        return new MaterialSpec(material);
    }

    public static NotSpec not(Spec spec) {
        return new NotSpec(spec);
    }

    /**
     * Here we are following static factory method design pattern
     */
    public static PlacementSpec placedIn(EstatePlacement placement) {
        return new PlacementSpec(placement);
    }

    public static TypeSpec ofType(EstateType type) {
        return new TypeSpec(type);
    }
}
