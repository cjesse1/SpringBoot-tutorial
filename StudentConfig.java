//package com.example.demo.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.Arrays;
//
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student Jesse = new Student(
//                    "Jesse",
//                    "jesse@gmail.com",
//                    "2000-12-17"
//            ) ;
//
//            Student Mariam = new Student(
//                    "Mariam",
//                    "Mariam@gmail.com",
//                    "2001-11-12"
//            );
//
//            Student Alex = new Student(
//                    "Alex",
//                    "Alex@gmail.com",
//                    "2002-10-13"
//            );
//
//            Student Alen = new Student(
//                    4L,
//                    "Alen",
//                    "Alen@gmail.com",
//                    "2002-10-16"
//            );
//
//            Student Alev = new Student();
//
//
////            repository.save()
//            repository.saveAll(
//                    Arrays.asList(Jesse, Mariam, Alex)
//            );
//        };
//    }
//}
