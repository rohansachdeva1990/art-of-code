package com.rohan.dp.solid.isp.example1.bad;

/**
 * I only want to print. Even though we don't provide scan and fax
 * capability we are still giving user an indication that the we can
 * support scan and fax. Which is not true.
 *
 * The user might
 */
public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document document) {
        // I can only do this
    }

    @Override
    public void scan(Document document) {
        // Do nothing
        // Or throw some notSupportedException.
        // We cannot throw a run time exception as user application might
        // have weired behavior.  And if we plan to add a checked exception then
        // our interface would become weird and not clear.
    }

    @Override
    public void fax(Document document) {

    }
}
