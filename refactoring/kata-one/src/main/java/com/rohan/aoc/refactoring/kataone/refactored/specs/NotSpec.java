package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

public class NotSpec implements Spec {
    private final Spec spec;

    private NotSpec(Spec spec) {
        this.spec = spec;
    }

    public static NotSpec not(Spec spec) {
        return new NotSpec(spec);
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return !spec.isSatisfiedBy(estate);
    }
}