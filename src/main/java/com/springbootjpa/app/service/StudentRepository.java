package com.springbootjpa.app.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootjpa.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	
	
}
