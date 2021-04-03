package com.rohan.dp.singleton.solution.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serialization Problem.
 * <p>
 * <p>
 * - When JVM deserialize the object, it doesn't really care that the constructor is private or public.
 * - It is going to construct an object anyway
 *
 *  This issue can be fixed by providing readResolve and writeResolve inside the
 */
public class Serialization {

    static void saveToFile(BasicSingleton basicSingleton,
                           String filename) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(basicSingleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (BasicSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws Exception {

        final BasicSingleton singleton1 = BasicSingleton.getInstance();
        singleton1.setValue(111);

        final String filename = "singleton.bin";
        saveToFile(singleton1, filename);

        singleton1.setValue(222);

        final BasicSingleton singleton2 = readFromFile(filename);

        System.out.println("Are equal ? : " + (singleton1 == singleton2));
        System.out.println("Singleton1 value : " + singleton1.getValue());
        System.out.println("Singleton2 value : " + singleton2.getValue());
        /*
        Are equal ? : false
        Singleton1 value : 222
        Singleton2 value : 111
         */

        // After adding the readResolve method in the singleton, we will get the same object
        // even after the deserialization

    }
}
