package com.cg.bankApp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.bankApp")
public class ServletBank extends HttpServlet {

	public ServletBank() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd ;
		String action = request.getServletPath();
		
		System.out.println(action);
		switch (action) {
		case "/addNewAccount.bankApp":
			response.sendRedirect("addNewAccount.jsp");
			
			break;
		case "/viewAllAccounts.bankApp" :
			break;
		case "/search.bankApp" :
			break;
		case "/withdraw.bankApp" :
			break;
		case "/deposit.bankApp" :
			break;
		case "/fundTransfer.bankApp" :
			break;
		case "/newAccount.bankApp" :
			String name = request.getParameter("customerName");
			String emailId = request.getParameter("emailId");
			String dob = request.getParameter("dob");
			String phNum = request.getParameter("telephone");
			String accType = request.getParameter("accType");
			boolean isSalaried = Boolean.parseBoolean(request.getParameter("salaried"));
			String balance = request.getParameter("balance");
			String odLimit = request.getParameter("odLimit");
			if(accType == "savingsAccount"  ) {
				
			}
			System.out.println(name+" "+emailId+" "+dob+" "+phNum+" "+accType+" "+isSalaried);
			System.out.println(balance+" "+odLimit);
		
			break;
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
