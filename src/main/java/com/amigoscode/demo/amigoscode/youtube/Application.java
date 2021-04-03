package com.amigoscode.demo.amigoscode.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello World";
	}

	@GetMapping
	public List<String> hellolist(){
		return List.of("Hello", "list");
	}

}
