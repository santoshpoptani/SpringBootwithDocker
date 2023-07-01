package com.example.dockerspringboot.endpoits;

import com.example.dockerspringboot.entity.StudentEnity;
import com.example.dockerspringboot.service.StudentJDBCService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class Student {

private  final StudentJDBCService jdbcService;

    public Student(StudentJDBCService jdbcService) {
        this.jdbcService = jdbcService;
    }


    @GetMapping
    public List<StudentEnity> getallstudents(){
        return jdbcService.getAllStudent();
    }
    @GetMapping("/{studentID}")
    public StudentEnity getallstudents(@PathVariable("studentID") int id){
        return jdbcService.getStudentById(id).get();
    }
   @PostMapping
    public int saveStudent(@RequestBody StudentEnity studentEnity){
      return jdbcService.saveStudent(studentEnity);
    }
}
