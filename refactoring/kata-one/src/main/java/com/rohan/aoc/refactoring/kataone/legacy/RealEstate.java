package com.rohan.aoc.refactoring.kataone.legacy;

public class RealEstate {
    private int id;
    private float buildingArea;
    private EstatePlacement placement;
    private EstateType type;
    private EstateMaterial material;

    public RealEstate(int id, float buildingArea, EstatePlacement placement, EstateType type, EstateMaterial material) {
        this.id = id;
        this.buildingArea = buildingArea;
        this.placement = placement;
        this.type = type;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public EstatePlacement getPlacement() {
        return placement;
    }

    public EstateType getType() {
        return type;
    }

    public EstateMaterial getMaterial() {
        return material;
    }

    public float getBuildingArea() {
        return buildingArea;
    }
}
