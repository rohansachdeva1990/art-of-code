package com.rohan.dp.flyweight.solution.ex1;

public class PointIcon {
    private final PointType type; // 4 bytes
    private final byte[] icon; // 20KB -> 20 MB (for 1000 pints)

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
