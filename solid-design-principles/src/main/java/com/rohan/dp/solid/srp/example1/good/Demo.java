package com.rohan.dp.solid.srp.example1.good;

public class Demo {

    public static void main(String[] args) throws Exception {
        Journal j = new Journal();

        j.addEntry("I am feeling determined");
        j.addEntry("I am feeling content");

        System.out.println(j);

        Persistence p = new Persistence();
        p.saveToFile(j, "somefile.txt", true);
    }

}
