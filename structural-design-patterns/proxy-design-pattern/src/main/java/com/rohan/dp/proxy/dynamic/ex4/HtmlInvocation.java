package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.Method;

public class HtmlInvocation implements Invocation {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args, InvocationChain chain) {
        String result = (String) chain.invoke(proxy, method, args);
        return String.format("<p>%s<p>", result);
    }
}
