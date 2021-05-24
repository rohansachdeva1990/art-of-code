package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.Method;

public interface Invocation {
    Object invoke(Object proxy, Method method, Object[] args, InvocationChain chain);
}
