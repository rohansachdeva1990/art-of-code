package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.Supplier;

public class DynamicProxyHandler implements InvocationHandler {

    private final Map<FieldKey, Supplier<String>> suppliers;
    private final InvocationChain chain;

    public DynamicProxyHandler(Map<FieldKey, Supplier<String>> suppliers) {
        this.suppliers = suppliers;
        this.chain = new InvocationChainImpl();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        return chain.invoke(suppliers, method, args);
    }
}
