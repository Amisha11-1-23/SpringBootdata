package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Dao")
public class SpringBootDbWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbWithJpaApplication.class, args);
	}

}
