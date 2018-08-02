package com.ambow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ambow.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class SSTest {

	@Autowired
	private StudentService ss;

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllStudent() {
		System.out.println(ss.getAllStudent());
	}

}
