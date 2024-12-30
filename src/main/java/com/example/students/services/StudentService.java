package com.example.students.services;

import com.example.students.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
