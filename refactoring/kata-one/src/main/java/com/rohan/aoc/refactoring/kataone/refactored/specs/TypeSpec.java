package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstateType;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

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