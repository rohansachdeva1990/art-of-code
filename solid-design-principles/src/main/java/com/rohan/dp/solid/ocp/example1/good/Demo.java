package com.rohan.dp.solid.ocp.example1.good;


import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = Arrays.asList(apple, tree, house);
        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products: ");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN)).forEach(product ->
                System.out.println(" - " + product.getName() + " is green"));

        System.out.println("Large Blue Items: ");
        betterFilter.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE)
        )).forEach(product -> System.out.println(" - " + product.getName() + " is large and blue"));

    }
}
