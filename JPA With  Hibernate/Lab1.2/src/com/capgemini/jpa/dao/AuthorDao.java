package com.capgemini.jpa.dao;

import com.capgemini.jpa.beans.Author;


public interface AuthorDao {
	public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract void updateStudent(Author author);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
