package com.rohan.aoc.refactoring.kataone.refactored;

import java.util.function.Predicate;

/**
 * Follows ISP
 */
public interface Spec extends Predicate<RealEstate> {
    boolean isSatisfiedBy(RealEstate estate);

    @Override
    default boolean test(RealEstate realEstate) {
        return isSatisfiedBy(realEstate);
    }
}
