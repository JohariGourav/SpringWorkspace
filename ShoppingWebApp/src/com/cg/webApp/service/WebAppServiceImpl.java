package com.cg.webApp.service;

import java.util.Collection;

import com.cg.webApp.dao.BookDao;
import com.cg.webApp.dao.BookDaoImpl;
import com.cg.webApp.pojo.Book;

public class WebAppServiceImpl implements WebAppService {

	private BookDao dao = new BookDaoImpl();

	/* (non-Javadoc)
	 * @see com.cg.webApp.service.WebAppService#displayAllBooks()
	 */
	@Override
	public Collection<Book> displayAllBooks() {
		return dao.displayAllBooks();
	}
	
	/* (non-Javadoc)
	 * @see com.cg.webApp.service.WebAppService#addToCart(int)
	 */
	@Override
	public int addToCart(int bookId) {
		return dao.addToCart(bookId);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.webApp.service.WebAppService#removeFromCart(int)
	 */
	@Override
	public int removeFromCart (int bookId) {
		return dao.removeFromCart(bookId);
	}
	/* (non-Javadoc)
	 * @see com.cg.webApp.service.WebAppService#viewCart()
	 */
	@Override
	public Collection<Book> viewCart() {
		return dao.viewCart();
	}
}
