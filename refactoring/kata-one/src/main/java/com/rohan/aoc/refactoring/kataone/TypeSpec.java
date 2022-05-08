package com.rohan.aoc.refactoring.kataone;

import com.rohan.aoc.refactoring.kataone.specs.Spec;

public class TypeSpec implements Spec {
    private EstateType type;

    public TypeSpec(EstateType type) {
        this.type = type;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getType().equals(type);
    }
}