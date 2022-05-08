package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.EstateType;
import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

public class TypeSpec implements Spec {
    private EstateType type;

    private TypeSpec(EstateType type) {
        this.type = type;
    }

    public static TypeSpec ofType(EstateType type) {
        return new TypeSpec(type);
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getType().equals(type);
    }
}