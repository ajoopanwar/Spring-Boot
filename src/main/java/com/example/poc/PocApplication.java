package com.example.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context  = SpringApplication.run(PocApplication.class, args);

		Alien a = context.getBean(Alien.class);

		a.show();


	}

}
