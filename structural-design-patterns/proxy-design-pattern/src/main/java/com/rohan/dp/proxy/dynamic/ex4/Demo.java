package com.rohan.dp.proxy.dynamic.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Map<FieldKey, Supplier<String>> suppliers = new HashMap<>();
        suppliers.put(FieldKey.a1, () -> "Hello");

        Person person = ProxyFactory.INSTANCE.getProxy(suppliers);
        System.out.println(person.getName());
    }
}
