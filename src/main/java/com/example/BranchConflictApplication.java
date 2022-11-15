package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BranchConflictApplication {

	public static void main(String[] args) {
		SpringApplication.run(BranchConflictApplication.class, args);
	
	
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}

}
