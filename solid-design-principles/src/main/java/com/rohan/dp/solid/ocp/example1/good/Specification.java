package com.rohan.dp.solid.ocp.example1.good;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
