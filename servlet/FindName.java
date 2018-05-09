package com.bfmz.servlet1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.QiyeDao;
import com.bfmz.entity.Qiye;


public class EFindName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String keyWord=request.getParameter("word");
		System.out.println("keyword="+keyWord);
		
		QiyeDao dao = new QiyeDao();
		List<Qiye> list= dao.findQiyeByName(keyWord);
		request.setAttribute("message", list);
		request.getRequestDispatcher("edelete.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
