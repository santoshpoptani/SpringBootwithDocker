package com.example.dockerspringboot.service;

import com.example.dockerspringboot.DAO.StudentDAO;
import com.example.dockerspringboot.entity.StudentEnity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentJDBCService {

    private final StudentDAO studentDAO;

    public StudentJDBCService(@Qualifier("jdbc") StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public int saveStudent(StudentEnity studentEnity){
        return studentDAO.insert(studentEnity);
    }

    public List<StudentEnity> getAllStudent(){
        return studentDAO.selectAllStudents();
    }

    public Optional<StudentEnity> getStudentById(int id){
        return studentDAO.selectStudentById(id);
    }
}
