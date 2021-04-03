package com.rohan.dp.adapter.solution.ex2;

/**
 * We’re building an email client like Outlook. Our client should be able to
 * connect to different mail servers such as Gmail, Yahoo, etc.
 * <p>
 * In the adapter package, you can see an interface called EmailProvider. Our
 * EmailClient class talks to this interface so it’s not coupled to a particular mail
 * service.
 * <p>
 * Here’s the problem: In the Gmail package, you can find the class (or classes)
 * that Google provides to connect to Gmail. These classes are shipped as a
 * third-party library that we can add to our application. We want to re-use these
 * classes but the GmailClient class does not extend our EmailProvider
 * interface.
 */
public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());
        emailClient.downloadEmails();
    }
}
