package com.springbootjpa.app.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springbootjpa.app.model.Student;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	EntityManager em;
	
	public void insertStudent(Student student) {
		em.persist(student);
	}
}
