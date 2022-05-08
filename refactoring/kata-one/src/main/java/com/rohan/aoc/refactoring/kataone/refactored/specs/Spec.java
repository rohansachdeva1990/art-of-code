package com.rohan.aoc.refactoring.kataone.refactored.specs;

import com.rohan.aoc.refactoring.kataone.refactored.RealEstate;

/**
 * Follows ISP
 */
public interface Spec {
    boolean isSatisfiedBy(RealEstate estate);
}
