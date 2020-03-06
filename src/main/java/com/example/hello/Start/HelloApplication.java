package com.example.hello.Start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.hello.EndPoint")
public class HelloApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloApplication.class, args);
	}

}
