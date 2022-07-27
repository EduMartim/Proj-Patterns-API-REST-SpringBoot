package com.patternsprojspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PatternsProjSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsProjSpringApplication.class, args);
	}

}
