package com.rohan.dp.proxy.dynamic.ex3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.stream.Collectors;

public class PersonProxy implements InvocationHandler {

    private final boolean isKing;
    private final Person person;

    private PersonProxy(Person person, boolean isKing) {
        this.person = person;
        this.isKing = isKing;
    }

    static Person create(Person person, boolean isKing) {
        return (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class[]{Person.class}, new PersonProxy(person, isKing));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if ("getName".equals(methodName)) {
            String is = isKing ? "is King of the Pirates!!!!" : " is Normal Pirate";
            return method.invoke(person, args) + " " + is;
        }

        if ("getContacts".equals(methodName)) {
            List<Contact> contacts = (List<Contact>) method.invoke(person, args);
            return contacts.stream()
                    .filter(contact -> ContactType.HOME.equals(contact.getContactType()))
                    .collect(Collectors.toList());
        }

        return method.invoke(person, args);
    }
}
