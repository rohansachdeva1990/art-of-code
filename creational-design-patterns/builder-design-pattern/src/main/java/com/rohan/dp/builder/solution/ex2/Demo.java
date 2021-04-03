package com.rohan.dp.builder.solution.ex2;

/**
 * Idea is to use RECURSIVE GENERICS
 */
public class Demo {

    public static void main(String[] args) {

        EmployeeBuilder eb = new EmployeeBuilder();
        Person rohan = eb.withName("Rohan")
                .worksAt("Developer")
                .build();
        ;

        System.out.println(rohan);
    }
}
