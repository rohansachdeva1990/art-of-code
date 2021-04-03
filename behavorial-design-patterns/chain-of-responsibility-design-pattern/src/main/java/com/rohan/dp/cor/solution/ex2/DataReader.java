package com.rohan.dp.cor.solution.ex2;

public abstract class DataReader {

    private DataReader next;

    public void read(String fileName) {

        if (fileName.endsWith(getExtension())) {
            doRead(fileName);
            return;
        }

        // Not found, pass to next type of reader...
        if (next != null) {
            next.read(fileName);
        } else {
            throw new UnsupportedOperationException("File format not supported.");
        }
    }

    public abstract void doRead(String fileName);

    public abstract String getExtension();

    public void setNext(DataReader next) {
        this.next = next;
    }

    public DataReader getNext() {
        return next;
    }
}
