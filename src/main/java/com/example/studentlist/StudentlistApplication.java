package com.example.studentlist;

import com.example.studentlist.server.StartServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StudentlistApplication {

	@Autowired
	private StartServer startServer;

	public static void main(String[] args) {
		SpringApplication.run(StudentlistApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void startServer(){
		startServer.start();
	}

}
