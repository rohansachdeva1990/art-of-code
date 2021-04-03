package com.rohan.dp.decorator.problem.ex1;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var compressed = compress(data);
        super.write(compressed);
    }

    private String compress(String data) {
        return data.substring(1, 5);
    }
}
