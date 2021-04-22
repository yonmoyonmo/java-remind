package com.company;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class JavaJjangServer {
    private Integer port = 8000;
    private HttpServer server = null;
    public JavaJjangServer() throws IOException {
        System.out.println("Java JJang Server On! port : 8000");
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/javajjang", new JavaJjangPostHandler());
        server.setExecutor(null);
        server.start();
        }
    }
