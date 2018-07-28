package com.capgemini.jpa.dao;

import javax.persistence.EntityManager;

import com.capgemini.jpa.beans.Author;

public class AuthorDaoImpl implements AuthorDao{
	
	private EntityManager entityManager;

	public AuthorDaoImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Author getAuthorById(int id) {
		Author author =entityManager.find(Author.class, id);
		return author;
	}

	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);
		
	}

	@Override
	public void removeAuthor(Author author) {
		entityManager.remove(author);
	}
	
	@Override
	public void updateStudent(Author author) {
		entityManager.merge(author);
		
	}


	@Override
		public void beginTransaction() {
			entityManager.getTransaction().begin();;
			
		}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}

	

	
}
