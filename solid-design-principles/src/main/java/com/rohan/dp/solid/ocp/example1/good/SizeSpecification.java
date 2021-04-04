package com.rohan.dp.solid.ocp.example1.good;

import com.rohan.oo.design.ocp.example1.Size;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.size == item.getSize();
    }
}
