package com.bfmz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfmz.dao.partworkDao;
import com.bfmz.entity.partwork;

/**
 * Servlet implementation class Login
 * 登录跳转，输入正确账号密码，
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String pno=request.getParameter("pno");
		String pass=request.getParameter("pass");
		String aa= request.getParameter("stu");
		
		
		partworkDao dao=new partworkDao();
		//System.out.println(dao.login(pno, pass));
		List<partwork> stu=null;
		if(aa.equals("student")){
		if(dao.loginstu(pno, pass)) {
			stu=dao.getPartwork();
			request.setAttribute("message",stu );
			request.getRequestDispatcher("show1.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
		}else{
			
			if(dao.loginpart(pno, pass)) {
				stu=dao.getPartwork();
				request.setAttribute("message",stu );
				request.getRequestDispatcher("show.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("fail.jsp").forward(request, response);
			}
		}
		
	}

	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
