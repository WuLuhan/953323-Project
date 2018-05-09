package com.qinzz.edu.entity;

import java.util.Date;

//学生类
public class Course
{
	int courseNumber;
	String courseTitle;
	Date courseOpentime;
	int CourseNumberOfPeople;
	
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public Date getCourseOpentime() {
		return courseOpentime;
	}
	public void setCourseOpentime(Date courseOpentime) {
		this.courseOpentime = courseOpentime;
	}
	public int getCourseNumberOfPeople() {
		return CourseNumberOfPeople;
	}
	public void setCourseNumberOfPeople(int courseNumberOfPeople) {
		CourseNumberOfPeople = courseNumberOfPeople;
	}
}