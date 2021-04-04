package com.amigoscode.demo.amigoscode.youtube.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}

//    @GetMapping
//    public List<Student> getStudents(){
//        return List.of(new Student(
//                1L,
//                "@Dude_Alex",
//                "dudealex@gmail.com",
//                LocalDate.of(1921, Month.JANUARY,1),
//                100));
//    }

