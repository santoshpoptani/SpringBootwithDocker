package com.example.dockerspringboot.endpoits;

import com.example.dockerspringboot.entity.StudentEnity;
import com.example.dockerspringboot.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class Student {

    private final StudentService studentService;

    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentEnity> getallstudents(){
        return studentService.getStudents();
    }
}
