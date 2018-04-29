package com.bfmz.servlet1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.QiyeDao;
import com.bfmz.entity.Qiye;


public class Edelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("eId"));
		int id= Integer.parseInt(request.getParameter("eId")) ;//
		QiyeDao dao=new QiyeDao();
		dao.deleteOne(id);
		List<Qiye> list=dao.getQiye();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show1.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
