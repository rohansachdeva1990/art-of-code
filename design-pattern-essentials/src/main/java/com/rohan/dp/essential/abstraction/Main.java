package com.rohan.dp.essential.abstraction;

public class Main {
    public static void main(String[] args) {
        var mailService = new MailService();
        mailService.sendEmail();
    }
}
