package com.example.studentlist.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;

@Component
public class StartServer {

    @Value("${app.server.port}")
    private int port;

    public void start(){
        try (ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server started on port " + port);

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
