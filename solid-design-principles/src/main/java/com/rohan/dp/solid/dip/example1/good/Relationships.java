package com.rohan.dp.solid.dip.example1.good;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.rohan.dp.solid.dip.example1.good.Relationship.CHILD;
import static com.rohan.dp.solid.dip.example1.good.Relationship.PARENT;

/**
 * Class to model relationships
 */
public class Relationships implements RelationshipBrowser {

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, PARENT, child));
        relations.add(new Triplet<>(child, CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream().
                filter(x -> x.getValue0().getName().equals(name)
                        && x.getValue1().equals(PARENT))
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
