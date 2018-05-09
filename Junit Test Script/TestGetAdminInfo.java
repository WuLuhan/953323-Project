package com.qinzz.edu.admin;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qinzz.edu.BaseTest;
import com.qinzz.edu.entity.Admin;

public class TestGetAdminInfo extends BaseTest{
	
	@Autowired
	private Admin admin;
	
	@Test
	public void testGetAdminName(){
		
		
		System.out.println(admin.getAdminId());
		System.out.println(admin.getAdminName());
		
	}

}
