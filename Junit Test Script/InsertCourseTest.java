package com.qinzz.edu.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qinzz.edu.BaseTest;
import com.qinzz.edu.entity.Course;


public class InsertCourseTest extends BaseTest {
	@Autowired
	private CourseDao courseDao;
	
	@Test
	public void testInsertCourse(){
		
		Course course = new Course();
		
		course.setCourseNumber(134);
		course.setCourseTitle("testInsert");
		course.setCourseOpentime(new Date());
		course.setCourseNumberOfPeople(44);		
		int effectedNum = courseDao.insertCourse(course);
		assertEquals(1,effectedNum);
		System.out.println(course.getCourseNumber());
		System.out.println(course.getCourseNumberOfPeople());
		System.out.println(course.getCourseTitle());
		System.out.println(course.getCourseOpentime());
		
	}

}
