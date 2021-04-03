package com.rohan.dp.essential.encapsulation;

public class Account {

    private float balance;

    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withDraw(float amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public float getBalance() {
        return balance;
    }
    // We should try to minimize access of the internal state
    // even using the setter methods and use meaningful operations
    // on the class
/*
    public void setBalance(float balance) {
        // We can add validation here to throw exceptions
        this.balance = balance;
    }
*/
}
