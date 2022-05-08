package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstateMaterial;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

/**
 * Follows SRP
 */
public class MaterialSpec implements Spec {
    private EstateMaterial material;

    private MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    public static MaterialSpec ofMaterial(EstateMaterial material) {
        return new MaterialSpec(material);
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}