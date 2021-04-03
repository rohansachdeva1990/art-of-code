package com.rohan.dp.adapter.solution.ex2;

import com.rohan.dp.adapter.solution.ex2.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {

    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
