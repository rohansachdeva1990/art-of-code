package com.rohan.dp.strategy.solution.ex1;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(
                new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStorage.store("a");

        imageStorage.store("b", new PngCompressor(), new HighContrastFilter());
    }
}
