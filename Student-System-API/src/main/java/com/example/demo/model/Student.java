package com.example.demo.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private String id;
	private String name;
	private String stream;
	
	@Override
	public String toString() {
		return "Student [student ID : "+this.id+", Name : "+this.name+", Stream : "+this.stream+"]";
	}
	
}
