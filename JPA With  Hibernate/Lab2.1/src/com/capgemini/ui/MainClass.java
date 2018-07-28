package com.capgemini.ui;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.bean.Author;
import com.capgemini.bean.Book;


public class MainClass {
	public static void main(String[] args) {
		List<Author> AuthorList = new ArrayList<>();
		List<Book> BookList = new ArrayList<>();

		Author author = new Author();
		Author author1 = new Author();
		author.setId(100);
		author.setName("Tejaswini");
		author1.setId(101);
		author1.setName("Kavya");

		Book book = new Book();
		Book book1 = new Book();

		book.setIsbn(1001);
		book.setPrice(20000);
		book.setTitle("My Book");
		book1.setIsbn(1002);
		book1.setPrice(50000);
		book1.setTitle("Soul");
		AuthorList.add(author);
		BookList.add(book);
		AuthorList.add(author1);
		BookList.add(book1);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaJpaProject");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(book);
		em.persist(book1);
		em.persist(author);
		em.persist(author1);
		tx.commit();
	}

}
