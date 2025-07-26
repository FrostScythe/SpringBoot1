package com.example.first.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // We can only contain oe main method  and this anotation will only be written in main file.
// learn about the structure of project.
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Hello World this is our first spring boot application.");
	}

}
