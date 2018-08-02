package com.ambow.service;

import java.util.List;

import com.ambow.pojo.Student;

public interface StudentService {
	public boolean login(Student student);
	public List<Student> getAllStudent();
}
