package com.rohan.dp.singleton.solution.ex1;

import com.rohan.dp.singleton.solution.ex1.BasicSingleton;

public class Demo {
    public static void main(String[] args) {

        // 1. We cannot instantiate the BasicSingleton because the constructor is private
        //BasicSingleton obj = new BasicSingleton(); // Does not compiles

        // 2. There are some problems with this approach, but this simple implementation does the job.
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        System.out.println(singleton.getValue());
    }
}
