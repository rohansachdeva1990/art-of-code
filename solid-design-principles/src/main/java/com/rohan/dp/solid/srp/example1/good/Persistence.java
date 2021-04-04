package com.rohan.dp.solid.srp.example1.good;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

/**
 * The responsibility is to just do the job of a persistence layer.
 * concern :saving and loading of the the content.
 * <p>
 * TIP: Instead of having journal passed directly we could pass an entity
 * which has the same role as of a Journal.
 */
public class Persistence {
    public void saveToFile(Journal journal,
                           String filename,
                           boolean overwrite) throws FileNotFoundException {

        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal);
            }
        }
    }

    public void load(String filename) {
        // Load content to journal from a file
    }

    public void load(URL url) {
        // Load content to journal from url
    }
}
