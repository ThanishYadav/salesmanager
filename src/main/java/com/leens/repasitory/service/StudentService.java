package com.leens.repasitory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leens.repasitory.dao.StudentRepository;
import com.leens.repasitory.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student  createStudent(Student student) {
		
		
		return studentRepository.save(student);
		
	}

}
