package com.rohan.dp.solid.dip.example1.bad;

import org.javatuples.Triplet;

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

    public Research(Relationships relationships) {

        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();

        relations.stream().
                filter(x -> x.getValue0().getName().equals("Oracle")
                        && x.getValue1().equals(Relationship.PARENT))
                .forEach(p -> System.out.println("Oracle  has a child called: " + p.getValue2()));
    }

}
