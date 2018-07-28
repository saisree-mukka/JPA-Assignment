package com.capgemini.jpa.service;

import com.capgemini.jpa.beans.Author;

public interface AuthorService {
	//public abstract Author getAuthorById(int id);

	public abstract void addAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract void updateStudent(Author author);

	public abstract Author findAuthorById(int id);
}
