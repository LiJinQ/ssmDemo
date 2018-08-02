package com.ambow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambow.dao.StudentDao;
import com.ambow.pojo.Student;
import com.ambow.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao sd;
	

	@Override
	public boolean login(Student student) {
		// TODO Auto-generated method stub
		Student s = sd.getStudentByNumber(student.getNumber());
		if(s==null) {
			return false;
		}
		if(s.getPassword().equals(student.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sd.getAllStudent();
	}

}
