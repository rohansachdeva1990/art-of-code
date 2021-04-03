package com.rohan.dp.singleton.solution.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * BasicSingleton can be defeated using reflection
 *
 * - Here the developer intentionally wants to break the code.
 * - This way is very explicit in nature.
 *
 */
public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. Reflection
        Constructor<BasicSingleton> constructor = BasicSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BasicSingleton instance1 = constructor.newInstance();
        instance1.setValue(12);
        BasicSingleton instance2 = constructor.newInstance();

        String comparisonOutput = String.format("I1: %d and I2: %d", instance1.getValue(), instance2.getValue());
        System.out.println(comparisonOutput);
    }
}
