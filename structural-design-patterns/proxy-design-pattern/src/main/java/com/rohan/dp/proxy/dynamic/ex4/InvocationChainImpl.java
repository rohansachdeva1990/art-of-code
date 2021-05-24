package com.rohan.dp.proxy.dynamic.ex4;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InvocationChainImpl implements InvocationChain {

    private List<Invocation> invocations = new ArrayList<>();
    private Object result;
    private Iterator<Invocation> tasks;

    public InvocationChainImpl() {
        invocations.add(new HtmlInvocation());
        invocations.add(new ValueInvocation());

        tasks = invocations.iterator();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        if (tasks.hasNext()) {
            this.result = tasks.next().invoke(proxy, method, args, this);
        }
        return this.result;
    }
}
