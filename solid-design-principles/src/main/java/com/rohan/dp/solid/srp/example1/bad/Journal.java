package com.rohan.dp.solid.srp.example1.bad;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    public void load(String filename) {
        // Load content to journal from a file
    }

    public void load(URL url) {
        // Load content to journal from url
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
