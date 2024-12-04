package com.joseliza.matricula.Inscripcion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.joseliza.matricula.Inscripcion.repository.EnrollmentRepository;
import com.joseliza.matricula.Inscripcion.service.EnrollmentService;

@SpringBootApplication
public class InscripcionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InscripcionApplication.class, args);
	}

}
