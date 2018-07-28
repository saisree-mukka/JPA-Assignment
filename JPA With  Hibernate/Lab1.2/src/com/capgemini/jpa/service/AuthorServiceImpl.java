package com.capgemini.jpa.service;

import com.capgemini.jpa.beans.Author;
import com.capgemini.jpa.dao.AuthorDao;
import com.capgemini.jpa.dao.AuthorDaoImpl;


public class AuthorServiceImpl implements AuthorService{

	private AuthorDao authorDao;
	
	
	public AuthorServiceImpl() {
		authorDao=new AuthorDaoImpl();
	}

	

	@Override
	public void addAuthor(Author author) {
		authorDao.beginTransaction();
		authorDao.addAuthor(author);
		authorDao.commitTransaction();
		
	}

	@Override
	public void removeAuthor(Author author) {
		authorDao.beginTransaction();
		authorDao.removeAuthor(author);
		authorDao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Author author) {
		authorDao.beginTransaction();
		authorDao.updateStudent(author);
		authorDao.commitTransaction();
	}

	@Override
	public Author findAuthorById(int id) {
		
		Author author=authorDao.getAuthorById(id);
		return author;
	}

}
