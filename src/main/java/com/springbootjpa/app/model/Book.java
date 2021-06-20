package com.springbootjpa.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String bookName;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Book(Long id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
	public Book() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
