package com.rohan.dp.builder.solution.ex3;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.setCompanyName(companyName);
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.setPosition(position);
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.setAnnualIncome(annualIncome);
        return this;
    }

}
