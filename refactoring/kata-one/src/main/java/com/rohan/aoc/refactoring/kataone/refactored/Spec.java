package com.rohan.aoc.refactoring.kataone.refactored;

/**
 * Follows ISP
 */
public interface Spec {
    boolean isSatisfiedBy(RealEstate estate);
}
