package com.rohan.dp.iterator.solution.ex1;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();
}
