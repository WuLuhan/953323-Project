package com.qinzz.edu.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qinzz.edu.BaseTest;
import com.qinzz.edu.entity.Student;

public class StudentDaoTest extends BaseTest {
	@Autowired
	private StudentDao studentDao;
	
	@Test
	public void testQuery(){
		
		List<Student> studentList = studentDao.queryStudent();
		assertEquals(2,studentList.size());
		Student stu = new Student();
		
		System.out.println(studentList.get(0));
		
	}
}
