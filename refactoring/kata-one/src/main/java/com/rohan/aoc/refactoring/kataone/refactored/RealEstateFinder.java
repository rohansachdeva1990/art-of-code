package com.rohan.aoc.refactoring.kataone.refactored;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RealEstateFinder {
    private final List<RealEstate> repository;

    public RealEstateFinder(List<RealEstate> repository) {
        this.repository = repository;
    }

    /**
     * Follows OCP
     */
    public List<RealEstate> bySpec(Predicate<RealEstate> spec) {
        return repository.stream()
                .filter(spec)
                .collect(Collectors.toList());
    }
}
