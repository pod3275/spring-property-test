package com.pod3275.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ExampleApplication {

	public static void main(String[] args) {

		String profile = System.getProperty("spring.profiles.active");
		log.info(profile);
		if (profile == null) {
			System.setProperty("spring.profiles.active", "dev");
		}

		SpringApplication.run(ExampleApplication.class, args);
	}

}
