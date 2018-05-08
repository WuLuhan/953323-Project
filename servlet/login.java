package com.bfmz.servlet1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.QiyeDao;
import com.bfmz.entity.Qiye;

/**
 * Servlet implementation class Login
 * 登录跳转，输入正确账号密码，
 */

public class Elogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String eNo=request.getParameter("eNo");
		String pass=request.getParameter("password");
		QiyeDao dao=new QiyeDao();
		System.out.println(dao.Elogin(eNo, pass));
		List<Qiye> stu=null;
		if(dao.Elogin(eNo, pass)) {
			stu=dao.getQiye();
			request.setAttribute("message",stu );
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("index1.jsp").forward(request, response);
		}
		
	}

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
