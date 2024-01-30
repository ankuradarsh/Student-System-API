package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.model.Student;

@SpringBootApplication
public class StudentSystemApiApplication implements CommandLineRunner{
	
	private final StudentRepository studentRepository;
	
	public StudentSystemApiApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student(UUID.randomUUID().toString(), "John", "CS"));
		studentRepository.save(new Student(UUID.randomUUID().toString(), "Mary", "CS"));
		studentRepository.save(new Student(UUID.randomUUID().toString(), "Susan", "IT"));
	}

}
