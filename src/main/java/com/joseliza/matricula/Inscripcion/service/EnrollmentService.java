package com.joseliza.matricula.Inscripcion.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.joseliza.matricula.Inscripcion.model.Student;
import com.joseliza.matricula.Inscripcion.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public Student enrollStudent(Student student) {
        return enrollmentRepository.save(student); 
    }

    public List<Student> getAllEnrolledStudents() {
        return enrollmentRepository.findAll(); 
    }
}
