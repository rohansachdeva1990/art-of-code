package com.rohan.dp.builder.solution.ex3;

// Builder Facade
//The reason of extending builder is to expose other builder in the vicinity.
// And gives a fluent experience while creating objects
public class PersonBuilder {

    // "Being protected" is very important.
    protected Person person = new Person();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public Person build() {
        return person;
    }
}
