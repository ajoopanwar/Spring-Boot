package com.example.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PocApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context  = SpringApplication.run(PocApplication.class, args);

		//Due to scope annotation, here, two beans will be created
		Alien a = context.getBean(Alien.class);
		Alien a1 = context.getBean(Alien.class);

		a.show();
		a1.show();


	}

}
