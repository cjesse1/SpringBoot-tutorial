package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentbyId(long id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public void addNewStudent(Student student) {

        System.out.println("output of post request ");
        System.out.println(student);
        studentRepository.save(student);
    }

    public Student updateStudent(long id, Student student) {
        Student savedStudent = studentRepository.findById(id).get();
        savedStudent.setEmail(student.getEmail());
        studentRepository.save(savedStudent);
        return savedStudent;
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
