package com.rohan.dp.iterator.solution.ex2;


public class Main {
    public static void main(String[] args) {

        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        // Here we don't anything about internal of this browser history
        // So, if we change the internal structure of the browser history,
        // this code will be unaffected as we are working to the interface
        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
