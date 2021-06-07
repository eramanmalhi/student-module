package edu.student.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.student.entities.Student;
import edu.student.repositories.StudentRepository;
import edu.student.vo.College;
import edu.student.vo.StudentCollegeValueObject;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRepo;
	@Autowired
	RestTemplate restTemplate;

	public Iterable<Student> findAll() {
		return stuRepo.findAll();
	}

	public StudentCollegeValueObject findById(Integer id) {
		Optional<Student> student= stuRepo.findById(id);
		College college = restTemplate.getForObject("http://localhost:8001/college-info/colleges/"+student.get().getCollegeId(), College.class);
		StudentCollegeValueObject vo=new StudentCollegeValueObject(student.get(), college);
		return vo;
	}

	public Student save(Student s) {
		return stuRepo.save(s);
	}

	public void delete(Integer id) {
		stuRepo.deleteById(id);
	}
	
}
