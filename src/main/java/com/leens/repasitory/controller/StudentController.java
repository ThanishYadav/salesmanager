package com.leens.repasitory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leens.repasitory.entity.Student;
import com.leens.repasitory.entity.Subject;
import com.leens.repasitory.service.StudentService;

@RestController
@RequestMapping("/student/api")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		
		System.out.println("student:::::::::::::::::"+student.getEmail());
		System.out.println("department:::::::::::::::::"+student.getDepartment().getDepartmentsName());	 
		
		List list =student.getSubjects();
		Subject sujectlist = (Subject) list.get(0);
		
		System.out.println("Sujects:::::::::::::::::"+sujectlist.getMarksObtained()+" ::::::"+sujectlist.getSubjectName() );

		return studentService.createStudent(student);

	}
}
