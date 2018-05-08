package com.bfmz.servlet1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.QiyeDao;
import com.bfmz.entity.Qiye;


public class Eadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		Qiye stu=new Qiye();
		
		stu.seteNo(request.getParameter("eNo")); 
		stu.setPassword(request.getParameter("password"));
		stu.seteName(request.getParameter("eName"));
		stu.seteinfo(request.getParameter("einfo"));
		
		QiyeDao dao=new QiyeDao();
		dao.save(stu);
		List<Qiye> list=dao.getQiye();
		request.setAttribute("mm", list);
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
