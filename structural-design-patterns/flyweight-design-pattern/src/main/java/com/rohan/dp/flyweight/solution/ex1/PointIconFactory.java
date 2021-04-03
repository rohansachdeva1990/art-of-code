package com.rohan.dp.flyweight.solution.ex1;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type)) {
            var icon = new PointIcon(type, getRawIcon(type));
            icons.put(type, icon);
        }

        return icons.get(type);
    }

    private byte[] getRawIcon(PointType type) {
        // Depending on the type we can read the mapped files.
        // Read the icon from filesystem or somewhere
        return null;
    }
}
