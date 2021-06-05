package edu.student.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.student.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
