package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.EstateMaterial;
import com.rohan.aoc.refactoring.kataone.RealEstate;
import com.rohan.aoc.refactoring.kataone.Spec;

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