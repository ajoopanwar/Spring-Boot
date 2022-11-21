package com.example.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context  = SpringApplication.run(PocApplication.class, args);

		//To Validate how many times a bean is created
//		Alien a = context.getBean(Alien.class);
//		Alien a1 = context.getBean(Alien.class);
//		Alien a2 = context.getBean(Alien.class);

		//Constructor running only once...indicating bean not getting created with every call
//		a.show();


	}

}
