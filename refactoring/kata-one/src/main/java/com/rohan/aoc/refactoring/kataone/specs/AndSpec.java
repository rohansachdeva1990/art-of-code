package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.RealEstate;
import com.rohan.aoc.refactoring.kataone.Spec;

public record AndSpec(Spec firstSpec, Spec secondSpec) implements Spec {
    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return firstSpec.isSatisfiedBy(estate) &&
                secondSpec.isSatisfiedBy(estate);
    }
}