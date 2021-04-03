package com.rohan.dp.strategy.solution.ex1;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String filename) {
        System.out.println("Compressing using JPEG Compressor");
    }
}
