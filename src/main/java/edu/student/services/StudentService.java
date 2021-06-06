package edu.student.services;

import java.util.Optional;

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

	public Optional<Student> findById(Integer id) {
		return stuRepo.findById(id);
	}

	public Student save(Student s) {
		return stuRepo.save(s);
	}

	public void delete(Integer id) {
		stuRepo.deleteById(id);
	}
	
}
