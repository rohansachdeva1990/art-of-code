package com.rohan.dp.builder.solution.ex3;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.setStreetAddress(streetAddress);
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.setPostCode(postcode);
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.setCity(city);
        return this;
    }
}
