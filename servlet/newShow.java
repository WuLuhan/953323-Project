package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.partworkDao;
import com.bfmz.entity.partwork;


public class show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		partwork stu=new partwork();
		
		stu.setCourseNum(request.getParameter("courseNum")); 
		stu.setCourseName(request.getParameter("courseName"));
		stu.setCourseId(request.getParameter("courseId"));
		stu.setSemester(request.getParameter("semester"));
		stu.setSchoolYear(request.getParameter("schoolYear"));
		stu.setMaxNumber(request.getParameter("maxNumber"));
		String aa= request.getParameter("stu");
		partworkDao dao=new partworkDao();
	    dao.save(stu);
		List<partwork> list=dao.getPartwork();
		request.setAttribute("message", list);
		
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
