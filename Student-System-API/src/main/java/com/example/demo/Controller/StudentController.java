package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@Controller
@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class StudentController {
	
	private final StudentService studentService;
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping
	public Iterable<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
}
