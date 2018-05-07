package com.qinzz.edu.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qinzz.edu.BaseTest;
import com.qinzz.edu.entity.Course;

public class CourseDaoTest extends BaseTest{

	@Autowired
	private CourseDao courseDao;
	
	private Course course;
	
	@Test
	public void testQuery(){
		List<Course> courseList = courseDao.queryCourse();
		assertEquals(2,courseList.size());
	}
	
}



