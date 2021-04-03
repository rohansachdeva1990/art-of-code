package com.rohan.dp.composite.problem.ex1;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> objects = new ArrayList<>();

    public void add(Object object) {
        objects.add(object);
    }

    public void render() {
        // PROBLEM - 1: We need to explicitly cast.
        // PROBLEM - 2: For new type of function like size, position etc. we need to explicitly cast them again everywhere.
        // PROBLEM - 3: Makes the code very ugly.
        for (var object : objects) {
            if (object instanceof Shape) {
                ((Shape) object).render();
            } else {
                ((Group) object).render();
            }
        }
    }
}
