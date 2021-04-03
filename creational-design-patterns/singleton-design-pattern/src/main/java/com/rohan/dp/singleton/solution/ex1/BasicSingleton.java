package com.rohan.dp.singleton.solution.ex1;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    private int value = 0;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * To solve serialization problem
     */
    protected Object readResolve(){
        return INSTANCE;
    }
}
