package com.qinzz.edu.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qinzz.edu.BaseTest;
import com.qinzz.edu.entity.Student;

public class AddStudentTest extends BaseTest{
	@Autowired
	private StudentDao studentDao;
	
	@Test
	 public void testAddStudent(){
		
		Student stu = new Student();
		
		stu.setStudentName("QQQ");
		stu.setStudentId("123");
		stu.setStudentAge(17);
		stu.setStudentNation("zhuan");
		stu.setStudentClass("NO.2");
		stu.setStudentMajor("SE");
		stu.setStudentCollege("CAMT");
		stu.setStudentIDcard(777);
		stu.setStudentAddress("P~S");
		
		int effectedNum = studentDao.insertStudent(stu);
		assertEquals(1,effectedNum);
		System.out.println(stu.getStudentName());
		
	}

}
