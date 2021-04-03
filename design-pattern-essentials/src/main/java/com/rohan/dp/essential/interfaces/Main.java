package com.rohan.dp.essential.interfaces;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    // It can still change on class level if TaxCalculator2020 is updated. But in enterprise apps this is
    // done by dependency injection frameworks.
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2020();
    }
}
