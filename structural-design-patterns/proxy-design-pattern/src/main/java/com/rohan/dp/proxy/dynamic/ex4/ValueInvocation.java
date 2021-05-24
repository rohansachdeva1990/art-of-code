package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.Supplier;

public class ValueInvocation implements Invocation {

    @Override
    @SuppressWarnings("unchecked")
    public Object invoke(Object proxy, Method method, Object[] args, InvocationChain chain) {
        var suppliers = (Map<FieldKey, Supplier<String>>) proxy;
        IsFieldKey isFieldKey = method.getAnnotation(IsFieldKey.class);
        if (isFieldKey != null) {
            return suppliers.get(isFieldKey.value()).get();
        }
        return null;
    }
}
