package edu.student.vo;

import org.springframework.stereotype.Component;

import edu.student.entities.Student;

@Component
public class StudentCollegeValueObject {

	private Student student;
	private College college;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public StudentCollegeValueObject(Student student, College college) {
		this.student = student;
		this.college = college;
	}
	public StudentCollegeValueObject() {
	}
	
}
