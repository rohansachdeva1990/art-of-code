package com.rohan.aoc.refactoring.kataone.refactored;

import com.rohan.aoc.refactoring.kataone.refactored.specs.AndSpecBuilder;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.rohan.aoc.refactoring.kataone.refactored.specs.Specs.*;

public class DeprecatedRealEstateFinder {
    private List<RealEstate> repository;

    public DeprecatedRealEstateFinder(List<RealEstate> repository) {
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

    @Deprecated
    public List<RealEstate> byBelowArea(float maxBuildingArea) {
        return bySpec(belowArea(maxBuildingArea));
    }

    @Deprecated
    public List<RealEstate> byMaterial(EstateMaterial material) {
        return bySpec(ofMaterial(material));
    }

    @Deprecated
    public List<RealEstate> byMaterialBelowArea(EstateMaterial material, float maxBuildingArea) {
        return bySpec(new AndSpecBuilder()
                .withSpec(ofMaterial(material))
                .withSpec(belowArea(maxBuildingArea))
                .build());
    }

    @Deprecated
    public List<RealEstate> byPlacement(EstatePlacement placement) {
        return bySpec(placedIn(placement));
    }

    @Deprecated
    public List<RealEstate> byAvoidingPlacement(EstatePlacement placement) {
        return bySpec(not(placedIn(placement)));
    }

    @Deprecated
    public List<RealEstate> byAreaRange(float minArea, float maxArea) {
        return bySpec(ofAreaRange(minArea, maxArea));
    }

    @Deprecated
    public List<RealEstate> byType(EstateType type) {
        return bySpec(ofType(type));
    }

    @Deprecated
    public List<RealEstate> byTypePlacementMaterial(EstateType type, EstatePlacement placement, EstateMaterial material) {
        return bySpec(new AndSpecBuilder()
                .withSpec(ofType(type))
                .withSpec(placedIn(placement))
                .withSpec(ofMaterial(material))
                .build());
    }
}
