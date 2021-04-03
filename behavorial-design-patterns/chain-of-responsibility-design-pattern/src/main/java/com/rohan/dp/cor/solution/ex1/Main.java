package com.rohan.dp.cor.solution.ex1;

public class Main {

    // We can add/remove new handler without changing the web server
    public static void main(String[] args) {
        // Authenticator => Logger => Compressor => Encryptor(Last)
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var websever = new Webserver(authenticator);
        websever.handle(new HttpRequest("admin", "1234"));

        websever.handle(new HttpRequest("-", "1234"));
    }
}
