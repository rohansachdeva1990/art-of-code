package com.rohan.dp.proxy.dynamic.ex3;

import java.util.ArrayList;
import java.util.List;

public class PersonImpl implements Person {
    private final String name;
    private final String address;
    private final List<Contact> contacts;

    public PersonImpl(String name, String address) {
        this.name = name;
        this.address = address;
        this.contacts = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    @Override
    public String toString() {
        return "PersonImpl{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", contacts=" + getContacts() +
                '}';
    }
}
