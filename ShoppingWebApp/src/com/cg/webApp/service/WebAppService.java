package com.cg.webApp.service;

import java.util.Collection;

import com.cg.webApp.pojo.Book;

public interface WebAppService {

	Collection<Book> displayAllBooks();

	int addToCart(int bookId);

	int removeFromCart(int bookId);

	Collection<Book> viewCart();

}