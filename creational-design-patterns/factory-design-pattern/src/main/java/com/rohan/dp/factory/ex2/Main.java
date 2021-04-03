package com.rohan.dp.factory.ex2;

/**
 * This is inspired from tools which creates websites for you
 */
public class Main {
    public static void main(String[] args) {
        var site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
