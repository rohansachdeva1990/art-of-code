package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.Spec;

import java.util.ArrayList;
import java.util.List;

public class AndSpecBuilder {
    private List<Spec> specs = new ArrayList<>();

    public AndSpecBuilder withSpec(Spec spec) {
        specs.add(spec);
        return this;
    }

    public AndSpec build() {
        return new AndSpec(specs.toArray(new Spec[specs.size()]));
    }
}