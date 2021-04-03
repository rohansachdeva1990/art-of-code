package com.rohan.dp.iterator.problem;

public class Main {
    public static void main(String[] args) {
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        /**
         * Problems with existing approach
         *
         *  1. If we change the internal data structure in future, this will break
         */
        for (var i = 0; i < history.getUrls().size(); i++) {
            var url = history.getUrls().get(i);
            System.out.println(url);
        }
    }
}
