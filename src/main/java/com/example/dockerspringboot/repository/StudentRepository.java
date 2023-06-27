package com.example.dockerspringboot.repository;

import com.example.dockerspringboot.entity.StudentEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEnity,Long> {

}
