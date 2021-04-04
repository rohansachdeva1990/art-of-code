package com.rohan.dp.solid.dip.example1.bad;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

import static com.rohan.dp.solid.dip.example1.bad.Relationship.CHILD;
import static com.rohan.dp.solid.dip.example1.bad.Relationship.PARENT;


/**
 * Class to model relationships
 *
 * LOW level means - kind of no business logic, it has SRP most of the times,
 * here it is just managing the relationships
 *
 *
 * THIS IS A LOW LEVEL MODULE AS WE ARE PLAYING WITH THE DATA STRUCTURE ON HOW TO STORE
 * A RELATIONSHIP, WHICH INDEED CAN BE ABSTRACTED FROM THE USER.
 *
 * PROBLEM: We are exposing an internal storage implementation as public getter for everyone.
 *
 */
public class Relationships {

    private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, PARENT, child));
        relations.add(new Triplet<>(child, CHILD, parent));
    }

    public List<Triplet<Person, Relationship, Person>> getRelations() {
        return relations;
    }
}
