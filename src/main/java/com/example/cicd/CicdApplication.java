package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
		System.out.println("good morning");
		
	    Adder adder = new Adder();
        int result = adder.addThreeNumbers(5, 10, 15);
        System.out.println("The sum is: " + result); // Output: The sum is: 30
	}

}