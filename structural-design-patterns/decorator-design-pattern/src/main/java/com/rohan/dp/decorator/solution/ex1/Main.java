package com.rohan.dp.decorator.solution.ex1;

public class Main {
    public static void main(String[] args) {
//        storeCreditCard(new CloudStream());
//        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
//        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    // None of the above decoration is visible to this method. (Transparent to this method)
    public static void storeCreditCard(Stream stream) {
        stream.write("1223-4567-8902-2344");
    }
}
