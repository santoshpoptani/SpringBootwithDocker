package com.example.dockerspringboot;

import com.example.dockerspringboot.entity.StudentEnity;
import com.example.dockerspringboot.repository.StudentRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringbootApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Faker faker = new Faker();
            for (int i = 0; i < 3; i++) {
                String name = faker.name().fullName();
                int age = faker.number().numberBetween(18, 30);
                repository.save(new StudentEnity(name,age));
            }



        };
    }
}

