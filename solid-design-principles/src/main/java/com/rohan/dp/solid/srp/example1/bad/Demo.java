package com.rohan.dp.solid.srp.example1.bad;

public class Demo {

    public static void main(String[] args) throws Exception{
        Journal j = new Journal();

        j.addEntry("I am feeling determined");
        j.addEntry("I am feeling content");

        System.out.println(j);

        j.save("pers");

    }
}
