package com.example.dockerspringboot.service;

import com.example.dockerspringboot.entity.StudentEnity;
import com.example.dockerspringboot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<StudentEnity> getStudents() {
        return repository.findAll();
    }
}
