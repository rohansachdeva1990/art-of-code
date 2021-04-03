package com.rohan.dp.iterator.solution.ex2;


public class BrowserHistory {
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {

        private BrowserHistory history;
        private int index = 0;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
