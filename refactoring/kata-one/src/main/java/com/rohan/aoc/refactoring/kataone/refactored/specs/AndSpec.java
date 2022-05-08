package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

public class AndSpec implements Spec {
    private final Spec firstSpec;
    private final Spec secondSpec;

    public AndSpec(Spec firstSpec, Spec secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return firstSpec.isSatisfiedBy(estate) &&
                secondSpec.isSatisfiedBy(estate);
    }
}