package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstateMaterial;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

/**
 * Follows SRP
 */
class MaterialSpec implements Spec {
    private EstateMaterial material;

    MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}