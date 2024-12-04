package com.joseliza.matricula.Inscripcion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.joseliza.matricula.Inscripcion.model.Student;
import com.joseliza.matricula.Inscripcion.service.EnrollmentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    public Student enrollStudent(@RequestBody Student student) {
        return enrollmentService.enrollStudent(student);
    }

    @GetMapping("/all")
    public List<Student> getAllEnrolledStudents() {
        return enrollmentService.getAllEnrolledStudents();
    }
}

