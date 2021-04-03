package com.rohan.dp.iterator.solution.ex3;

public class Main {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));
        collection.add(new Product(4, "d"));

        final Iterator<Product> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
