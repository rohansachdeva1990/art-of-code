package com.rohan.dp.solid.dip.example1.good;

import java.util.List;

/**
 * This class is responsible for researching and analyzing relationships
 * <p>
 * THIS IS A HIGH LEVEL MODULE
 * <p>
 * Its a high level module because it allows us to perform operation on low level construct,
 * here we normally don't care about how relationship is internally managed.
 * This layer should just do the job of just analysing stuff.
 */
public class Research {

    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("Oracle");
        for (Person child : children) {
            System.out.println("Oracle has a child called: " + child.getName());
        }
    }

}
