package com.rohan.dp.solid.srp.example1.good;

import java.util.ArrayList;
import java.util.List;

/**
 * Concern: Storing and manipulation of journal entries
 */
public class Journal {
    private final List<String> entries = new ArrayList<>();

    // Total number of entries across however many journals
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }


    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
