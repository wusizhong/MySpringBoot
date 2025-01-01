package org.springboot;

public class JeetyWebServer implements WebServer {
    @Override
    public void start() {
        System.out.println("JeetyWebServer start...");
    }
}
