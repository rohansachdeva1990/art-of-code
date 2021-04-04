package com.rohan.dp.solid.dip.example1.good;

import java.util.List;

/**
 * Rule says we should work with the interfaces.
 * This is the abstraction that you are expected to implement at the low level to expose to high level
 */
public interface RelationshipBrowser {

    List<Person> findAllChildrenOf(String name);

}
