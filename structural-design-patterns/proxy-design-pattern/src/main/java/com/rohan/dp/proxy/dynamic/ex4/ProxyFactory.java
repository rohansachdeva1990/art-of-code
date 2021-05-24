package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum ProxyFactory {

    INSTANCE;

    public Person getProxy(Map<FieldKey, Supplier<String>> suppliers) {
        return (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                Stream.of(Person.class).toArray(Class[]::new), new DynamicProxyHandler(suppliers));

    }
}
