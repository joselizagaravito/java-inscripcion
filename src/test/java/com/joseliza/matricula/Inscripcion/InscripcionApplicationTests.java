package com.joseliza.matricula.Inscripcion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.joseliza.matricula.Inscripcion.model.Student;
import com.joseliza.matricula.Inscripcion.repository.EnrollmentRepository;
import com.joseliza.matricula.Inscripcion.service.EnrollmentService;

@SpringBootTest
class InscripcionApplicationTests {

    @Test
    public void testEnroll() {
        EnrollmentRepository mockRepo = mock(EnrollmentRepository.class);

        EnrollmentService service = new EnrollmentService(mockRepo);

        Student student = new Student();
        student.setName("Jose Liza");
        student.setEmail("joseliza@example.com");

        service.enrollStudent(student);

        verify(mockRepo, times(1)).save(student);
    }

    @Test
    public void testGetEnrolledStudents() {

        EnrollmentRepository mockRepo = mock(EnrollmentRepository.class);

        EnrollmentService service = new EnrollmentService(mockRepo);

        List<Student> mockList = new ArrayList<>();
        when(mockRepo.findAll()).thenReturn(mockList);

        List<Student> result = service.getAllEnrolledStudents();

        assertEquals(mockList, result);

        verify(mockRepo, times(1)).findAll();
    }
}
