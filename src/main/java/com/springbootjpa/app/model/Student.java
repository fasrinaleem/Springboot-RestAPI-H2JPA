package com.springbootjpa.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="STUDENT_NAME")
	private String studentName;
	private int age;
	
	@OneToMany(mappedBy = "student")
	List<Book> allBooks;
	
	public Student() {
	}
	
	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public Student(String studentName, int age) {
		super();
		this.studentName = studentName;
		this.age = age;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
	
	
	
}
