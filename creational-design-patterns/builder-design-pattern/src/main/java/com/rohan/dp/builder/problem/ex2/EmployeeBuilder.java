package com.rohan.dp.builder.problem.ex2;

/**
 * Some times we need to preserve the existing builder and add new possibilities by
 * extending an existing builder.
 */
public class EmployeeBuilder extends PersonBuilder {

    public EmployeeBuilder worksAt(String position){
        person.setPosition(position);
        return this;
    }
}
