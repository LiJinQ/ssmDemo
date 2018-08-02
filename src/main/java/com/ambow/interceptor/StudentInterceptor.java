package com.ambow.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ambow.pojo.Student;
import com.ambow.service.StudentService;

public class StudentInterceptor implements HandlerInterceptor{
	@Autowired
	private StudentService ss;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("¿πΩÿ÷Æ∫Û");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("–ﬁ∏ƒ≤‚ ‘");
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String number = arg0.getParameter("number");
		String password = arg0.getParameter("password");
		Student student = new Student();
		student.setNumber(number);
		student.setPassword(password);
		if(ss.login(student)) {
			return true;
		}
		arg1.sendRedirect("login.jsp");
		return false;
	}

}
