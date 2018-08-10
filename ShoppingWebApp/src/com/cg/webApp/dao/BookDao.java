package com.cg.webApp.dao;

import java.util.Collection;

import com.cg.webApp.pojo.Book;

public interface BookDao {

	Collection<Book> displayAllBooks();

	int addToCart(int bookId);

	int removeFromCart(int bookId);

	Collection<Book> viewCart();

}