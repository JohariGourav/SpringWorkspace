package com.cg.webApp.controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cg.webApp.pojo.Book;
import com.cg.webApp.service.WebAppService;
import com.cg.webApp.service.WebAppServiceImpl;

import sun.rmi.server.Dispatcher;

@WebServlet("*.webApp")
public class ServletWebApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private WebAppService service = new WebAppServiceImpl();
	int totalPrice = 0, cartItems = 0;
	public ServletWebApp() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd;
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);
		switch (action) {
		case "/catalogue.webApp":

			Collection<Book> books = service.displayAllBooks();
			request.setAttribute("books", books);		
			 rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			break;
			
		case "/addToCart.webApp": 
			cartItems++;
			totalPrice += service.addToCart(Integer.parseInt(request.getParameter("bookId")));
			System.out.println(Integer.parseInt(request.getParameter("bookId")));
			session = request.getSession();
			session.setAttribute("totalPrice", totalPrice);
			session.setAttribute("cartItems", cartItems);
			response.sendRedirect("catalogue.webApp");
			break;
		
		case "/viewCart.webApp" :
			Collection<Book> cartBooks = service.viewCart();
			//System.out.println(cartBooks.);
			request.setAttribute("cartBooks", cartBooks);
			rd = request.getRequestDispatcher("cart.jsp");
			rd.forward(request, response);
			break;
		
		case "/removeBook.webApp" :
			cartItems--;
			totalPrice -= service.removeFromCart(Integer.parseInt(request.getParameter("cartBookId")));
			System.out.println(Integer.parseInt(request.getParameter("cartBookId")));
			session = request.getSession();
			session.setAttribute("totalPrice", totalPrice);
			session.setAttribute("cartItems", cartItems);
			response.sendRedirect("viewCart.webApp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
