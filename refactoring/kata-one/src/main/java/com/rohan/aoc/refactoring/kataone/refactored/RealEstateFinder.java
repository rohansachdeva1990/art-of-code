package com.rohan.aoc.refactoring.kataone.refactored;

import com.rohan.aoc.refactoring.kataone.refactored.specs.AndSpec;

import java.util.List;
import java.util.stream.Collectors;

import static com.rohan.aoc.refactoring.kataone.refactored.specs.AreaRangeSpec.ofAreaRange;
import static com.rohan.aoc.refactoring.kataone.refactored.specs.BelowAreaSpec.belowArea;
import static com.rohan.aoc.refactoring.kataone.refactored.specs.MaterialSpec.ofMaterial;
import static com.rohan.aoc.refactoring.kataone.refactored.specs.NotSpec.not;
import static com.rohan.aoc.refactoring.kataone.refactored.specs.PlacementSpec.placedIn;
import static com.rohan.aoc.refactoring.kataone.refactored.specs.TypeSpec.ofType;

public class RealEstateFinder {
    private List<RealEstate> repository;

    public RealEstateFinder(List<RealEstate> repository) {
        this.repository = repository;
    }

    /**
     * Follows OCP
     */
    public List<RealEstate> bySpec(Spec spec) {
        return repository.stream()
                .filter(spec::isSatisfiedBy)
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
        return bySpec(new AndSpec(ofMaterial(material), belowArea(maxBuildingArea)));
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
        return bySpec(new AndSpec(ofType(type), placedIn(placement), ofMaterial(material)));
    }
}
