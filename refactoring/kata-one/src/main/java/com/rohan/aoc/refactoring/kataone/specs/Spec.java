package com.rohan.aoc.refactoring.kataone.specs;

import com.rohan.aoc.refactoring.kataone.RealEstate;

/**
 * Follows ISP
 */
public interface Spec {
    boolean isSatisfiedBy(RealEstate estate);
}
