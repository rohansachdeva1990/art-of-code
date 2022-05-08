package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstateMaterial;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

/**
 * Follows SRP
 */
public class MaterialSpec implements Spec {
    private EstateMaterial material;

    public MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}