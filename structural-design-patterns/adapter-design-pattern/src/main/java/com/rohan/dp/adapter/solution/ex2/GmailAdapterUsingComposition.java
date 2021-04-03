package com.rohan.dp.adapter.solution.ex2;

import com.rohan.dp.adapter.solution.ex2.gmail.GmailClient;

public class GmailAdapterUsingComposition implements EmailProvider {

    private GmailClient gmailClient;

    public GmailAdapterUsingComposition(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
