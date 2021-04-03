package com.rohan.dp.factory.ex2;

public class WebsiteFactory {

    private WebsiteFactory() {
    }

    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                throw new IllegalArgumentException(type + " is not supported by this factory");
        }
    }
}
