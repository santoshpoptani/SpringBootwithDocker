package com.example.dockerspringboot.DAO;

import com.example.dockerspringboot.entity.StudentEnity;

import java.util.List;
import java.util.Optional;

public interface StudentDAO {

     int insert(StudentEnity studentEnity);
     List<StudentEnity> selectAllStudents();
     Optional<StudentEnity> selectStudentById(int id);

}
