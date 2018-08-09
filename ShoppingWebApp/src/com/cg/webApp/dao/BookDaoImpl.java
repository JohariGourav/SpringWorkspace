package com.cg.webApp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.webApp.pojo.Book;

public class BookDaoImpl {

	private Map<Integer, Book> bookDb = new HashMap<>();
	
	private Map<Integer, Book> cart = new HashMap<>();

	private void addBooks() {
		bookDb.put(101, new Book("Origin", 499, 101));
		bookDb.put(102, new Book("Wings Of Fire", 299, 102));
		bookDb.put(103, new Book("Rich Dad Poor Dad", 149, 103));
		bookDb.put(104, new Book("Chanakya Neeti", 199, 104));
		bookDb.put(105, new Book("Deception Point", 399, 105));
		bookDb.put(106, new Book("Turtles", 199, 106));
		bookDb.put(107, new Book("SpaceX", 699, 107));
		bookDb.put(108, new Book("Relativity", 199, 108));
		bookDb.put(109, new Book("Incredible India", 349, 109));
		bookDb.put(110, new Book("Born To Fly", 459, 110));
	}

	public Collection<Book> displayAllBooks() {
		addBooks();
		return bookDb.values();
	}
	
	public void addToCart (int bookId) {
		
		cart.put(bookId, bookDb.get(bookId));
		System.out.println(cart.values());
	}
	
	public void removeFromCart (int bookId) {
		cart.remove(bookId);
	}
	
	public Collection<Book> viewCart() {
		return cart.values();
	}
}
