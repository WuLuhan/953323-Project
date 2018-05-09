package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.partworkDao;
import com.bfmz.entity.partwork;


public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		System.out.println("发顺丰飒飒发顺丰");
		System.out.println(request.getParameter("id"));
		int id= Integer.parseInt(request.getParameter("id")) ;//�ѻ�ȡ����idת����int����
		partworkDao dao=new partworkDao();
		dao.deleteOne(id);
		List<partwork> list=dao.getPartwork();
		request.setAttribute("message", list);
		request.getRequestDispatcher("show.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
