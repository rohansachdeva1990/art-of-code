package com.rohan.dp.proxy.dynamic.ex3;

public class ContactImpl implements Contact {

    private final ContactType contactType;
    private final String number;

    public ContactImpl(ContactType contactType, String number) {
        this.contactType = contactType;
        this.number = number;
    }

    public static Contact of(ContactType contactType, String number) {
        return new ContactImpl(contactType, number);
    }

    @Override
    public ContactType getContactType() {
        return contactType;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", contactType, number);
    }
}
