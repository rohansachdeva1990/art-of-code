package com.rohan.dp.strategy.problem.ex1;

public class ImageStorage {

    // Can be enum, just added for simplicity
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    // Violates SRP
    // This function needs to be changed for every new compression or filtering type
    public void store(String filename) {
        // Compress it: JPEG, PNG,...
        if (compressor.equals("jpeg")) {
            System.out.println("Compressing using JPEG");
        } else if (compressor.equals("png")) {
            System.out.println("Compressing using PNG");
        }

        // Apply Filter B&W, Contrast
        if (filter.equals("B&W")) {
            System.out.println("Applying B&W filter");
        } else if (filter.equals("high-contrast")) {
            System.out.println("Applying high contrast filter");
        }
    }
}
