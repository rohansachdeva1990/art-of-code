package com.rohan.dp.proxy.dynamic.ex3;

import java.util.stream.IntStream;

import static com.rohan.dp.proxy.dynamic.ex3.ContactType.*;

public class Demo {
    public static void main(String[] args) {
        PersonImpl person = new PersonImpl("Luffy", "One Piece");
        person.addContact(ContactImpl.of(HOME, "1111"));
        person.addContact(ContactImpl.of(OFFICE, "2222"));
        person.addContact(ContactImpl.of(PERSONAL, "3333"));


        Person proxyPerson = PersonProxy.create(person, true);

        IntStream.range(0, 10).forEach(value -> System.out.println(proxyPerson.getContacts()));
    }
}
