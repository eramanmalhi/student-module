package edu.student.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.student.entities.Student;
import edu.student.services.StudentService;
@RestController
public class StudentController {

	@Autowired
	StudentService stuService;
	
	@GetMapping(path="/students/all")
	public @ResponseBody Iterable<Student> getAllStudents()
	{
		System.out.println("All Called");
		return stuService.findAll();
	}
	
}
