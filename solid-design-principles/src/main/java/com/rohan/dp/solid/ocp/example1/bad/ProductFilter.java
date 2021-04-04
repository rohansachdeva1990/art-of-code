package com.rohan.dp.solid.ocp.example1.bad;



import java.util.List;
import java.util.stream.Stream;

/**
 * We are violating the OCP because whenever we want to make new filter we need
 * to jump into this class and add a new function
 */
public class ProductFilter {

    // Initial Request
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.getColor() == color);
    }

    // In future you got a request to filter by size
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products,
                                                Color color,
                                                Size size) {
        return products.stream().filter(product -> product.getSize() == size &&
                product.getColor() == color);
    }


}
