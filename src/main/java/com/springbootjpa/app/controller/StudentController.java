package com.springbootjpa.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjpa.app.model.Book;
import com.springbootjpa.app.model.Student;
import com.springbootjpa.app.service.StudentDao;
import com.springbootjpa.app.service.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentDao dao;
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("saveStudent")
	public void saveStudent(@RequestBody Student student) {
		dao.insertStudent(student);
	}
	
	@PostMapping("persistStudent")
	public void persistStudent(@RequestBody Student student) {
		repo.save(student);
	}
	
	@GetMapping("allStudent")
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	
	@GetMapping("studentById/{id}")
	public Student getStudentById(@PathVariable long id){
		Optional<Student> byId = repo.findById(id);
		return byId.get();
	}
	
	@GetMapping("getBookById/{id}")
	public List<Book> getBooksById(@PathVariable long id){
		Student byId = repo.getById(id);
		return byId.getAllBooks();
	}
	
	@GetMapping("getAllBooks")
	public List<Student> getAllBooks(){
		return repo.findAll();
	}
}
