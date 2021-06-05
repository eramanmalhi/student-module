package edu.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.student.entities.Student;
import edu.student.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRepo;

	public Iterable<Student> findAll() {
		return stuRepo.findAll();
	}
	
	
}
