package com.example.dockerspringboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Student")
@Table(name = "student")
public class StudentEnity {

    @Id
    @SequenceGenerator(
            name = "student_sequenece",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private long id;
    @Column(
            nullable = false
    )
    private String Name;
    @Column(
            nullable = false
    )
    private int age;

    public StudentEnity(String name, int age) {
        Name = name;
        this.age = age;
    }
}
