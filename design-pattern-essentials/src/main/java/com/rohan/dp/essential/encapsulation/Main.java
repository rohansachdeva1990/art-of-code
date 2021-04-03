package com.rohan.dp.essential.encapsulation;

public class Main {
    public static void main(String[] args) {
        var account = new Account();
        account.deposit(10);
        account.withDraw(5);
        System.out.println(account.getBalance());
    }
}
