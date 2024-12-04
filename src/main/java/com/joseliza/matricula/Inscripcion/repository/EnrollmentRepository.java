package com.joseliza.matricula.Inscripcion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joseliza.matricula.Inscripcion.model.Student;

public interface EnrollmentRepository extends JpaRepository<Student, Long> {
    // No necesitas implementar nada; JpaRepository proporciona métodos como save, findAll, etc.
}
