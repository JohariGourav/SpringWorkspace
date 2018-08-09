package com.cg.mydocs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {

	public ServletLogin() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("get run");
		HttpSession session = request.getSession();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName + " " + password);

		if (userName.equals("admin") && password.equals("admin")) {
			session = request.getSession();
			session.setAttribute("userName", userName);
			System.out.println((String) session.getAttribute("userName"));
			response.sendRedirect("success.jsp");
		} else
			response.sendRedirect("error.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
