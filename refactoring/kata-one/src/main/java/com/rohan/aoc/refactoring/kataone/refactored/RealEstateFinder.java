package com.rohan.aoc.refactoring.kataone.refactored;

import com.rohan.aoc.refactoring.kataone.refactored.specs.*;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<RealEstate> byBelowArea(float maxBuildingArea) {
        return bySpec(new BelowAreaSpec(maxBuildingArea));
    }

    public List<RealEstate> byMaterial(EstateMaterial material) {
        return bySpec(new MaterialSpec(material));
    }

    public List<RealEstate> byMaterialBelowArea(EstateMaterial material, float maxBuildingArea) {
        return bySpec(new AndSpec(new MaterialSpec(material), new BelowAreaSpec(maxBuildingArea)));
    }

    public List<RealEstate> byPlacement(EstatePlacement placement) {
        return bySpec(new PlacementSpec(placement));
    }

    public List<RealEstate> byAvoidingPlacement(EstatePlacement placement) {
        return bySpec(new NotSpec(new PlacementSpec(placement)));
    }

    public List<RealEstate> byAreaRange(float minArea, float maxArea) {
        return bySpec(new AreaRangeSpec(minArea, maxArea));
    }

    public List<RealEstate> byType(EstateType type) {
        return bySpec(new TypeSpec(type));
    }

    public List<RealEstate> byTypePlacementMaterial(EstateType type, EstatePlacement placement, EstateMaterial material) {
        return bySpec(new AndSpec(
                        new TypeSpec(type),
                        new PlacementSpec(placement),
                        new MaterialSpec(material)
                )
        );
    }
}
