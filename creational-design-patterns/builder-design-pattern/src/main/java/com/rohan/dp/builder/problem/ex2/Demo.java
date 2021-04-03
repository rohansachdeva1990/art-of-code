package com.rohan.dp.builder.problem.ex2;

public class Demo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person rohan = pb.withName("Rohan").
                // .worksAt() // is not available Compile Error
                build();

        // Even if we try
        EmployeeBuilder eb = new EmployeeBuilder();

        // We still can't chain worksAt because the withName does not return EmployeeBuilder
        // It returns person builder.
        // To solve it we must return something which is common to both interfaces
        //eb.withName("Rohan")
        //.worksArt(..) // Compile Error

    }
}
