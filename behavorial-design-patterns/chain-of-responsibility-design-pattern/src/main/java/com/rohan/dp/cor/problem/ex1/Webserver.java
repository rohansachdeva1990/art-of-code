package com.rohan.dp.cor.problem.ex1;

/**
 * Because of the new keyword, this class is tightly coupled with authenticator, compressor etc.
 * So in future, if we need to add a new operation we would need to update this class with a new
 * set of lines responsible for taking care of the corresponding operation.
 *
 * To solve this we can extract Authenticator, Compressor to an interface and provide it to the web
 * server.
 * Even though this will decouple these operation creation from the web server it will still contain
 * the order of operations. In future, if we decide to disable any operation for eg logging, we need
 * to comeback here change the code. This violates the OCP, as this code needs to be opened everytime
 * for handling new type of operation.
 */
public class Webserver {

    public void handle(HttpRequest request) {

        // Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request);

        // Logging

        // Compression
    }

}
