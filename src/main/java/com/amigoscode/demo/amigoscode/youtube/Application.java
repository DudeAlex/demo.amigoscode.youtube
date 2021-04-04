package com.amigoscode.demo.amigoscode.youtube;

import com.amigoscode.demo.amigoscode.youtube.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World";
	}

	@GetMapping("/list")
	public List<String> hellolist(){
		return List.of("Hello", "list");
	}

	@GetMapping("/class")
	public List<Student> helloStudent(){
		return List.of(new Student(
				1L,
				"@Dude_Alex",
				"dudealex@gmail.com",
				LocalDate.of(1921, Month.JANUARY,1),
				100));
	}
}













