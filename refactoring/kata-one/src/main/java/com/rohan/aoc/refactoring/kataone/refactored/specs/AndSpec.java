package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;
import com.rohan.aoc.refactoring.kataone.refactored.Spec;

import java.util.stream.Stream;

public class AndSpec implements Spec {
    private Spec[] specs;
    
    public AndSpec(Spec... specs) {
        this.specs = specs;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return Stream.of(specs)
                .allMatch(spec -> spec.isSatisfiedBy(estate));
    }
}