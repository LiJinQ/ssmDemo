package com.ambow.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ambow.pojo.Student;
import com.ambow.service.StudentService;

@Controller
public class StudentController {
	
	@Resource
	private StudentService ss;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Model model) {
		List<Student> slist = ss.getAllStudent();
		model.addAttribute("slist", slist);
		return "index";
	}
}
