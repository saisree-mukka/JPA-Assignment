package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Book;
import com.cg.jpacrud.service.BookService;
import com.cg.jpacrud.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Boo with ID 106:"+service.getBookById(105));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(book);
		}
		
		
		System.out.println("************Listing All books between 500 and 1000*************");
		for(Book book:service.getBooksInPriceRange(500, 1000) ) {
			System.out.println(book);
		}
		
	}
}
