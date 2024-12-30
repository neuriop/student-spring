package com.example.students.controllers;

import com.example.students.models.Student;
import com.example.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/grades")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping(value = "/students/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping(value = "/add_student")
    public ResponseEntity<Boolean> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.ok(true);
    }
}
