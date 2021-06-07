package edu.student.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.student.entities.Student;
import edu.student.services.StudentService;
import edu.student.vo.StudentCollegeValueObject;
@RestController
@RequestMapping("/student-info")
public class StudentController {

	@Autowired
	StudentService stuService;
	
	@GetMapping(path="/students")
	public @ResponseBody Iterable<Student> findAll()
	{
		return stuService.findAll();
	}
	@GetMapping("/students/{id}")
	public StudentCollegeValueObject findById(@PathVariable("id")  Integer id)
	{
		return stuService.findById(id);
	}
	
	@PostMapping("/students")
	public Student save(@RequestBody Student s)
	{
		return stuService.save(s);
	}
	@PutMapping("/students/{id}")
	public Student update(@PathVariable("id") Integer id, @RequestBody Student s)
	{
		StudentCollegeValueObject vo=stuService.findById(id);
		Student st=vo.getStudent();
		st.setCollegeId(s.getCollegeId());
		st.setContact(s.getContact());
		st.setEmailId(s.getEmailId());
		st.setStudentName(s.getStudentName());
		st.setStudentId(id);
		stuService.save(st);
		return stuService.findById(id).getStudent();
	}
	@DeleteMapping("/students/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		stuService.delete(id);
		return "RECORD DELETED FOR: "+id;
	}
}
