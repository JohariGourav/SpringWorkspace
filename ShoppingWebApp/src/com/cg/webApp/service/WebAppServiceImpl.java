package com.cg.webApp.service;

import java.util.Collection;

import com.cg.webApp.dao.BookDaoImpl;
import com.cg.webApp.pojo.Book;

public class WebAppServiceImpl {

	private BookDaoImpl dao = new BookDaoImpl();

	public Collection<Book> displayAllBooks() {
		return dao.displayAllBooks();
	}
	
	public void addToCart(int bookId) {
		dao.addToCart(bookId);
	}
	
	public void removeFromCart (int bookId) {
		dao.addToCart(bookId);
	}
	public Collection<Book> viewCart() {
		return dao.viewCart();
	}
}
