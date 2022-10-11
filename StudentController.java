package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;
    private final StudentRepository studentRepository;


    public StudentController(StudentService studentService, StudentRepository studentRepository){
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "/{id}")
    public Student getStudentbyId(@PathVariable("id") long id ) { return studentService.getStudentbyId(id);}

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) { studentService.addNewStudent(student); }

    @PatchMapping(path = "/{id}")
    public Student updateStudent (@PathVariable("id") long id, @RequestBody Student student ) {
        Student returnedStudentService = studentService.updateStudent(id, student);
        return returnedStudentService;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteStudent(@PathVariable("id") long id ) { studentService.deleteStudent(id); }
}
