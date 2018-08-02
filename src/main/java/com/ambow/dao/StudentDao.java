package com.ambow.dao;

import java.util.List;

import com.ambow.pojo.Student;

public interface StudentDao {
	public Student getStudentByNumber(String number);
	public List<Student> getAllStudent();
}
