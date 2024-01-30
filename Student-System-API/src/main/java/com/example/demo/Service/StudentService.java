package com.example.demo.Service;

import com.example.demo.model.Student;

public interface StudentService {
	Student createStudent(Student student);
	Iterable<Student> getAllStudents();
	
}
