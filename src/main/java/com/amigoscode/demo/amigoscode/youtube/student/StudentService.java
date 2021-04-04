package com.amigoscode.demo.amigoscode.youtube.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "@Dude_Alex",
                "dudealex@gmail.com",
                LocalDate.of(1921, Month.JANUARY, 1),
                100));
    }
}
