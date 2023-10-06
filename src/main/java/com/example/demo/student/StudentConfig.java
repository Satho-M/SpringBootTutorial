package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY,5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2024, JANUARY,25)
            );

            Student matilda = new Student(
                    "Matilda",
                    "mariam@gmail.com",
                    LocalDate.of(1990, JANUARY,5)
            );

            repository.saveAll(
                    List.of(mariam, alex, matilda)
            );
        };
    }
}
