package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

public class NotSpec implements Spec {
    private final Spec spec;

    public NotSpec(Spec spec) {
        this.spec = spec;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return !spec.isSatisfiedBy(estate);
    }
}