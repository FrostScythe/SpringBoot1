package com.example.first.app;

import com.example.first.app.model.Address;
import com.example.first.app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // We can only contain oe main method  and this annotation will only be written in main file.
// learn about the structure of project.
// what are the feature of java?  what are thr feature of spring?

public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		System.out.println("Hello World this is our first spring boot application.");

		// tight coupling
		Employee emp1= new Employee();
		emp1.id=123;
		emp1.name= "Ajay";
		emp1.email = "aiaj123@g.com";
		emp1.designation="developer";

		Address adrs1= new Address();
		adrs1.doorNo=99;
		adrs1.streetName= "lk";
		adrs1.city="ejo";

		emp1.address = adrs1;

		System.out.println("Emp1  is: "+ emp1);
		System.out.println("Adrs1  is: "+ adrs1);

	}
}