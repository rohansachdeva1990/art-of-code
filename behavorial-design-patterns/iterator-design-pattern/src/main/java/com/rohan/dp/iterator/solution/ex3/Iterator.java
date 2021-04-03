package com.rohan.dp.iterator.solution.ex3;

public interface Iterator<T> {
    boolean hasNext();

    T current();

    void next();
}
