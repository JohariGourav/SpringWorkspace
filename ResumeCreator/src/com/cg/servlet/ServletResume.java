package com.cg.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.resume.Resume;


@WebServlet("/ServletResume")
public class ServletResume extends HttpServlet {
	
     
   
    public ServletResume() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 Resume resume = new Resume(request.getParameter("firstName"), request.getParameter("lastName"),
				 request.getParameter("Gender"), request.getParameter("highestQualification"),
				 request.getParameter("date"), request.getParameter("hobbies"),
				 request.getParameter("address"), request.getParameterValues("skills"),
				 request.getParameter("email"), request.getParameter("website"),
				 request.getParameter("Telephone"), request.getParameter("desc"));
		// System.out.println("inside servlet:" +resume);
		 request.setAttribute("ServletResume", resume);
		RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");
		rd.forward(request, response);
//		PrintWriter out = response.getWriter();
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String gender = request.getParameter("Gender");
//		String highestQualification = request.getParameter("highestQualification");
//		String dob = request.getParameter("date");
//		String hobbies = request.getParameter("hobbies");
//		String address = request.getParameter("address");
//		String [] skills = request.getParameterValues("skills");
//		String email = request.getParameter("email");
//		String website = request.getParameter("website");
//		
//		out.print("<h1> "+firstName+"</h1></br>"
//				+ "<h1>"+lastName+"<h1></br>"+
//				"<p>Gender: "+gender+"</br>Highest Qualification: "+highestQualification);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
