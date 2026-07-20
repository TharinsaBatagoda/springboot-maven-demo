package com.example.springboot_maven_demo.configuration;

import com.example.springboot_maven_demo.model.Student;
import com.example.springboot_maven_demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadInitialStudents(
            StudentRepository studentRepository) {

        return args -> {
            if (studentRepository.count() == 0) {
                studentRepository.save(
                        new Student(
                                "Nimal Perera",
                                "nimal@example.com",
                                "Information Technology"
                        )
                );

                studentRepository.save(
                        new Student(
                                "Kamal Silva",
                                "kamal@example.com",
                                "Software Engineering"
                        )
                );
            }
        };
    }
}