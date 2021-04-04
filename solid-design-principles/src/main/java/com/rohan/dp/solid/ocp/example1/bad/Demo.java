package com.rohan.dp.solid.ocp.example1.bad;


import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products: ");
        pf.filterByColor(products, Color.GREEN).forEach(product ->
                System.out.println(" - " + product.getName() + " is green"));

    }
}
