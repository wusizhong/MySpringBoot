package org.springboot;

public class TomcatWebServer implements WebServer {
    @Override
    public void start() {
        System.out.println("TomcatWebServer start");
    }
}
