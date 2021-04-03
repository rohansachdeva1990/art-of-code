package com.rohan.dp.adapter.solution.ex1;

import com.rohan.dp.adapter.solution.ex1.thirdparty.Caramel;

// Way - 1 (Preferred)
// Favor composition over inheritance
public class CaramelFilter implements Filter {

    // Composition
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
