package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.partworkDao;
import com.bfmz.entity.partwork;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		partwork partwork=new partwork();
		partwork.setCourseNum(request.getParameter("courseNum"));
		partwork.setCourseName(request.getParameter("courseName"));
		partwork.setCourseId(request.getParameter("courseId"));
		partwork.setSemester(request.getParameter("semester"));
		partwork.setSchoolYear(request.getParameter("schoolYear"));
		partwork.setMaxNumber(request.getParameter("maxNumber"));
		partworkDao dao=new partworkDao();
		dao.updatePartInfo(partwork);
		List<partwork> list= dao.getPartwork();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
