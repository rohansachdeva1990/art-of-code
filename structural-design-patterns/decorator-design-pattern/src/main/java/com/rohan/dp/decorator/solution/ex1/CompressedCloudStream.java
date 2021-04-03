package com.rohan.dp.decorator.solution.ex1;

public class CompressedCloudStream implements Stream {

    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressed = compress(data);
        stream.write(compressed);
    }

    private String compress(String data) {
        return data.substring(1, 5);
    }
}
